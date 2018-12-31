package typings
package wtfnodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wtfnode", JSImport.Namespace)
@js.native
object wtfnodeMod extends js.Object {
  def dump(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def resetLoggers(): scala.Unit = js.native
  @JSName("setLogger")
  def setLogger_error(
    `type`: wtfnodeLib.wtfnodeLibStrings.error,
    fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("setLogger")
  def setLogger_info(
    `type`: wtfnodeLib.wtfnodeLibStrings.info,
    fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("setLogger")
  def setLogger_warn(
    `type`: wtfnodeLib.wtfnodeLibStrings.warn,
    fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

