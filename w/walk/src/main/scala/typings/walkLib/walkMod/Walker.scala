package typings
package walkLib.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walker extends js.Object {
  def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): scala.Unit = js.native
  def on(event: WalkStatEvent, cb: WalkStatEventCallback): scala.Unit = js.native
  @JSName("on")
  def on_end(event: walkLib.walkLibStrings.end, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_names(event: walkLib.walkLibStrings.names, cb: WalkNamesEventCallback): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
}

