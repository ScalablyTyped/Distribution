package typings.webcola

import typings.d3DashDispatch.d3DashDispatchMod.Dispatch
import typings.d3DashDrag.d3DashDragMod.DragBehavior
import typings.d3DashDrag.d3DashDragMod.DraggedElementBaseType
import typings.d3DashDrag.d3DashDragMod.SubjectPosition
import typings.d3DashTimer.d3DashTimerMod.Timer
import typings.std.EventTarget
import typings.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.distSrcD3v4adaptorMod.D3Context
import typings.webcola.distSrcLayoutMod.Event
import typings.webcola.distSrcLayoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/d3v4adaptor", JSImport.Namespace)
@js.native
object distSrcD3v4adaptorMod extends js.Object {
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
  
  @js.native
  class D3StyleLayoutAdaptor protected ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    def this(d3Context: D3Context) = this()
    var d3Context: js.Any = js.native
    /* InferMemberOverrides */
    /* protected */ override def kick(): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def trigger(e: Event): Unit = js.native
  }
  
}

