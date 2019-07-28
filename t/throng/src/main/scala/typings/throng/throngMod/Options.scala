package typings.throng.throngMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var grace: js.UndefOr[Double] = js.native
  var lifetime: js.UndefOr[Double] = js.native
  var master: js.UndefOr[ProcessCallback] = js.native
  @JSName("start")
  var start_Original: ProcessCallback = js.native
  var workers: js.UndefOr[WorkerCount] = js.native
  def start(id: Double): js.Any = js.native
}

