package typings
package webcolaLib.distSrcD3v4adaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3Context extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: js.Function1[
    /* repeated */java.lang.String, 
    d3DashDispatchLib.d3DashDispatchMod.Dispatch[stdLib.EventTarget]
  ] = js.native
  @JSName("drag")
  var drag_Original: js.Function0[
    d3DashDragLib.d3DashDragMod.DragBehavior[d3DashDragLib.d3DashDragMod.DraggedElementBaseType, _, _]
  ] = js.native
  var event: js.Any = js.native
  @JSName("timer")
  var timer_Original: js.Function3[
    /* callback */ js.Function1[/* elapsed */ scala.Double, scala.Unit], 
    /* delay */ scala.Double, 
    /* time */ scala.Double, 
    d3DashTimerLib.d3DashTimerMod.Timer
  ] = js.native
  def dispatch[T /* <: stdLib.EventTarget */](types: java.lang.String*): d3DashDispatchLib.d3DashDispatchMod.Dispatch[T] = js.native
  def drag[GElement /* <: d3DashDragLib.d3DashDragMod.DraggedElementBaseType */, Datum, Subject](): d3DashDragLib.d3DashDragMod.DragBehavior[GElement, Datum, Subject] = js.native
  def timer(
    callback: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): d3DashTimerLib.d3DashTimerMod.Timer = js.native
}

