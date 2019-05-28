package typings
package webcolaLib.distSrcD3v4adaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3Context extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: webcolaLib.Fn_Types = js.native
  @JSName("drag")
  var drag_Original: webcolaLib.Fn_Datum = js.native
  var event: js.Any = js.native
  @JSName("timer")
  var timer_Original: webcolaLib.Fn_Callback = js.native
  def dispatch[T /* <: stdLib.EventTarget */](types: java.lang.String*): d3DashDispatchLib.d3DashDispatchMod.Dispatch[T] = js.native
  def drag[GElement /* <: d3DashDragLib.d3DashDragMod.DraggedElementBaseType */, Datum](): d3DashDragLib.d3DashDragMod.DragBehavior[GElement, Datum, Datum | d3DashDragLib.d3DashDragMod.SubjectPosition] = js.native
  @JSName("drag")
  def drag_GElementDraggedElementBaseTypeDatumSubject[GElement /* <: d3DashDragLib.d3DashDragMod.DraggedElementBaseType */, Datum, Subject](): d3DashDragLib.d3DashDragMod.DragBehavior[GElement, Datum, Subject] = js.native
  def timer(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit]): d3DashTimerLib.d3DashTimerMod.Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ scala.Double, scala.Unit], delay: scala.Double): d3DashTimerLib.d3DashTimerMod.Timer = js.native
  def timer(
    callback: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): d3DashTimerLib.d3DashTimerMod.Timer = js.native
}

