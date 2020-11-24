package typings.twilsock

import typings.twilsock.twilsockerrorMod.TwilsockError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/error/twilsockreplyerror", JSImport.Namespace)
@js.native
object twilsockreplyerrorMod extends js.Object {
  
  @js.native
  class TwilsockReplyError protected () extends TwilsockError {
    def this(description: String, reply: js.Any) = this()
    
    val reply: js.Any = js.native
  }
}
