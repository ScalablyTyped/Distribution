package typings
package toobusyDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("toobusy-js", JSImport.Namespace)
@js.native
object toobusyDashJsMod extends js.Object {
  def apply(): scala.Boolean = js.native
  def interval(newInterval: scala.Double): scala.Double = js.native
  def lag(): scala.Double = js.native
  def maxLag(newLag: scala.Double): scala.Double = js.native
  def onLag(fn: js.Function1[/* lag */ scala.Double, scala.Unit]): scala.Unit = js.native
  def onLag(fn: js.Function1[/* lag */ scala.Double, scala.Unit], threshold: scala.Double): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
  def smmothingFactor(newFactor: scala.Double): scala.Double = js.native
  def started(): scala.Boolean = js.native
}

