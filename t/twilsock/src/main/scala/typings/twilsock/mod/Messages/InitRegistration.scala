package typings.twilsock.mod.Messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitRegistration extends StObject {
  
  var message_types: js.Array[String]
  
  var notification_protocol_version: Double
  
  /*
    * @internal
    *
    * Populate init registrations section in the Twilsock configuration generically with
    * passed-in list of types to register.
    *
    * Used only by the SDK, ignore.
    *
    * @param {string[]} types List of types to add to init registrations in options.
    * @param {object} options Twilsock options object to update. Omit to create a new one.
    */
  def populateInitRegistrations(types: js.Array[String]): Unit
  
  var product: String
  
  var `type`: String
}
object InitRegistration {
  
  inline def apply(
    message_types: js.Array[String],
    notification_protocol_version: Double,
    populateInitRegistrations: js.Array[String] => Unit,
    product: String,
    `type`: String
  ): InitRegistration = {
    val __obj = js.Dynamic.literal(message_types = message_types.asInstanceOf[js.Any], notification_protocol_version = notification_protocol_version.asInstanceOf[js.Any], populateInitRegistrations = js.Any.fromFunction1(populateInitRegistrations), product = product.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitRegistration] (val x: Self) extends AnyVal {
    
    inline def setMessage_types(value: js.Array[String]): Self = StObject.set(x, "message_types", value.asInstanceOf[js.Any])
    
    inline def setMessage_typesVarargs(value: String*): Self = StObject.set(x, "message_types", js.Array(value*))
    
    inline def setNotification_protocol_version(value: Double): Self = StObject.set(x, "notification_protocol_version", value.asInstanceOf[js.Any])
    
    inline def setPopulateInitRegistrations(value: js.Array[String] => Unit): Self = StObject.set(x, "populateInitRegistrations", js.Any.fromFunction1(value))
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
