package typings.twilioChat

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionerrorMod {
  
  @JSImport("twilio-chat/lib/sessionerror", "SessionError")
  @js.native
  class SessionError protected () extends Error {
    def this(message: String, code: Double) = this()
    
    var code: Double = js.native
  }
}
