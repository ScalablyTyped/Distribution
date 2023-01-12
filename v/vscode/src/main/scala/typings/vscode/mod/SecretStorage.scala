package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretStorage extends StObject {
  
  /**
    * Remove a secret from storage.
    * @param key The key the secret was stored under.
    */
  def delete(key: String): Thenable[Unit]
  
  /**
    * Retrieve a secret that was stored with key. Returns undefined if there
    * is no password matching that key.
    * @param key The key the secret was stored under.
    * @returns The stored value or `undefined`.
    */
  def get(key: String): Thenable[js.UndefOr[String]]
  
  /**
    * Fires when a secret is stored or deleted.
    */
  def onDidChange(listener: js.Function1[/* e */ SecretStorageChangeEvent, Any]): Disposable
  def onDidChange(listener: js.Function1[/* e */ SecretStorageChangeEvent, Any], thisArgs: Any): Disposable
  def onDidChange(
    listener: js.Function1[/* e */ SecretStorageChangeEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable
  def onDidChange(
    listener: js.Function1[/* e */ SecretStorageChangeEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable
  /**
    * Fires when a secret is stored or deleted.
    */
  @JSName("onDidChange")
  var onDidChange_Original: Event[SecretStorageChangeEvent]
  
  /**
    * Store a secret under a given key.
    * @param key The key to store the secret under.
    * @param value The secret.
    */
  def store(key: String, value: String): Thenable[Unit]
}
object SecretStorage {
  
  inline def apply(
    delete: String => Thenable[Unit],
    get: String => Thenable[js.UndefOr[String]],
    onDidChange: (/* listener */ js.Function1[SecretStorageChangeEvent, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
    store: (String, String) => Thenable[Unit]
  ): SecretStorage = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), onDidChange = js.Any.fromFunction3(onDidChange), store = js.Any.fromFunction2(store))
    __obj.asInstanceOf[SecretStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretStorage] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: String => Thenable[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Thenable[js.UndefOr[String]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setOnDidChange(
      value: (/* listener */ js.Function1[SecretStorageChangeEvent, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction3(value))
    
    inline def setStore(value: (String, String) => Thenable[Unit]): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
  }
}
