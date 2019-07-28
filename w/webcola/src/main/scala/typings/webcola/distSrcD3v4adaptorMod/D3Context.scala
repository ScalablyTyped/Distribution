package typings.webcola.distSrcD3v4adaptorMod

import typings.d3DashDispatch.d3DashDispatchMod.Dispatch
import typings.d3DashDrag.d3DashDragMod.DragBehavior
import typings.d3DashDrag.d3DashDragMod.DraggedElementBaseType
import typings.d3DashDrag.d3DashDragMod.SubjectPosition
import typings.d3DashTimer.d3DashTimerMod.Timer
import typings.std.EventTarget
import typings.webcola.Fn_Callback
import typings.webcola.Fn_Datum
import typings.webcola.Fn_Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3Context extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: Fn_Types = js.native
  @JSName("drag")
  var drag_Original: Fn_Datum = js.native
  var event: js.Any = js.native
  @JSName("timer")
  var timer_Original: Fn_Callback = js.native
  def dispatch[T /* <: EventTarget */](types: String*): Dispatch[T] = js.native
  def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
  @JSName("drag")
  def drag_GElement_DraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject] = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
}

