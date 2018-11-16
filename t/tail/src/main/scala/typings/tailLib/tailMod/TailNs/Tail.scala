package typings
package tailLib.tailMod.TailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tail extends js.Object {
  /** Error callback */
  @JSName("on")
  def on_error(eventType: tailLib.tailLibStrings.error, cb: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Callback to listen for newlines appended to file */
  @JSName("on")
  def on_line(eventType: tailLib.tailLibStrings.line, cb: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Stop watching file */
  def unwatch(): scala.Unit = js.native
  /** Start watching file if previously stopped */
  def watch(): scala.Unit = js.native
}

