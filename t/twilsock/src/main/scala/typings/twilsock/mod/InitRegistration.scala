package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock", "InitRegistration")
@js.native
open class InitRegistration protected () extends StObject {
  // It's a Set<string> but TS cannot serialize Sets properly.
  def this(product: String) = this()
  
  var message_types: js.Array[String] = js.native
  
  var notification_protocol_version: Double = js.native
  
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
  def populateInitRegistrations(types: js.Array[String]): Unit = js.native
  
  var product: String = js.native
  
  var `type`: String = js.native
}
