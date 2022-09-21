package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentSessionKey extends StObject {
  
  /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
  var encrypted: Boolean
  
  /**
    * Gets or sets the symmetric key value.
    */
  var value: js.Array[Double]
}
object TaskAgentSessionKey {
  
  inline def apply(encrypted: Boolean, value: js.Array[Double]): TaskAgentSessionKey = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSessionKey]
  }
  
  extension [Self <: TaskAgentSessionKey](x: Self) {
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
