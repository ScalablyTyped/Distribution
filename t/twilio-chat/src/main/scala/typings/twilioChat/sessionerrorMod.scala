package typings.twilioChat

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/sessionerror", JSImport.Namespace)
@js.native
object sessionerrorMod extends js.Object {
  
  @js.native
  class SessionError protected () extends Error {
    def this(message: String, code: Double) = this()
    
    var code: Double = js.native
  }
}
