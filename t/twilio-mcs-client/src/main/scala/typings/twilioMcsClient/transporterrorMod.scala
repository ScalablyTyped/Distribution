package typings.twilioMcsClient

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transporterrorMod {
  
  @JSImport("twilio-mcs-client/lib/services/transporterror", "TransportError")
  @js.native
  class TransportError protected ()
    extends StObject
       with Error {
    def this(message: String, code: Double, body: js.Any, status: String, headers: js.Any) = this()
    
    val body: js.Any = js.native
    
    val code: Double = js.native
    
    val headers: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    val status: String = js.native
  }
}
