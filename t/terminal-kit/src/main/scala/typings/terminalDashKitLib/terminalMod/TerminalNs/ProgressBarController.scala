package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarController extends js.Object {
  def itemDone(name: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def startItem(name: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def update(updateObject: scala.Double): scala.Unit = js.native
  def update(updateObject: terminalDashKitLib.Anon_Items): scala.Unit = js.native
}

