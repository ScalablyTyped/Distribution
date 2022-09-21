package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretStorageChangeEvent extends StObject {
  
  /**
    * The key of the secret that has changed.
    */
  val key: String
}
object SecretStorageChangeEvent {
  
  inline def apply(key: String): SecretStorageChangeEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretStorageChangeEvent]
  }
  
  extension [Self <: SecretStorageChangeEvent](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
