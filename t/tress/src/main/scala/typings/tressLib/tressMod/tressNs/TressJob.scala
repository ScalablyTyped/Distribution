package typings
package tressLib.tressMod.tressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TressJob extends js.Object {
  @JSName("callback")
  var callback_Original: TressJobCallback = js.native
  var data: TressJobData = js.native
  def callback(`this`: TressJobData, args: js.Any*): scala.Unit = js.native
}

