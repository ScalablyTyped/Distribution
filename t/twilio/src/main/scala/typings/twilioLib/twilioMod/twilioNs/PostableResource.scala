package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostableResource extends Resource {
  @JSName("post")
  var post_Original: RestMethod = js.native
  def post(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def post(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

