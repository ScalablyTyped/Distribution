package typings.twilsock

import typings.twilsock.libErrorTwilsockerrorMod.TwilsockError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/error/twilsockreplyerror", JSImport.Namespace)
@js.native
object libErrorTwilsockreplyerrorMod extends js.Object {
  @js.native
  class TwilsockReplyError protected () extends TwilsockError {
    def this(description: String, reply: js.Any) = this()
    val reply: js.Any = js.native
  }
  
}

