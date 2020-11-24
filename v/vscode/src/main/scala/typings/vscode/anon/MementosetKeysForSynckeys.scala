package typings.vscode.anon

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode.vscode.Memento & {setKeysForSync (keys : std.Array<string>): void} */
@js.native
trait MementosetKeysForSynckeys extends js.Object {
  
  /**
    * Return a value.
    *
    * @param key A string.
    * @return The stored value or `undefined`.
    */
  def get[T](key: String): js.UndefOr[T] = js.native
  /**
    * Return a value.
    *
    * @param key A string.
    * @param defaultValue A value that should be returned when there is no
    * value (`undefined`) with the given key.
    * @return The stored value or the defaultValue.
    */
  def get[T](key: String, defaultValue: T): T = js.native
  
  /**
    * Set the keys whose values should be synchronized across devices when synchronizing user-data
    * like configuration, extensions, and mementos.
    *
    * Note that this function defines the whole set of keys whose values are synchronized:
    *  - calling it with an empty array stops synchronization for this memento
    *  - calling it with a non-empty array replaces all keys whose values are synchronized
    *
    * For any given set of keys this function needs to be called only once but there is no harm in
    * repeatedly calling it.
    *
    * @param keys The set of keys whose values are synced.
    */
  def setKeysForSync(keys: js.Array[String]): Unit = js.native
  
  /**
    * Store a value. The value must be JSON-stringifyable.
    *
    * @param key A string.
    * @param value A value. MUST not contain cyclic references.
    */
  def update(key: String, value: js.Any): Thenable[Unit] = js.native
}
