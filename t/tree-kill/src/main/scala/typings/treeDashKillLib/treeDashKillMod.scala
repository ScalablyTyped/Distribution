package typings
package treeDashKillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tree-kill", JSImport.Namespace)
@js.native
object treeDashKillMod extends js.Object {
  def apply(pid: scala.Double): scala.Unit = js.native
  def apply(pid: scala.Double, signal: java.lang.String | scala.Double): scala.Unit = js.native
  def apply(
    pid: scala.Double,
    signal: java.lang.String | scala.Double,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

