package typings.twilsock

import typings.twilsock.twilsockerrorMod.TwilsockError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockreplyerrorMod {
  
  @JSImport("twilsock/lib/error/twilsockreplyerror", "TwilsockReplyError")
  @js.native
  class TwilsockReplyError protected () extends TwilsockError {
    def this(description: String, reply: js.Any) = this()
    
    val reply: js.Any = js.native
  }
}
