package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "connect")
@js.native
object connect extends js.Object {
  
  def apply(token: String): js.Promise[Room] = js.native
  def apply(token: String, options: ConnectOptions): js.Promise[Room] = js.native
}
