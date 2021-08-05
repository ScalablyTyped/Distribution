package typings.webcola

import typings.d3Dispatch.mod.Dispatch_
import typings.d3Drag.mod.DragBehavior
import typings.d3Drag.mod.DraggedElementBaseType
import typings.d3Drag.mod.SubjectPosition
import typings.d3Timer.mod.Timer_
import typings.webcola.anon.Fn0
import typings.webcola.anon.FnCall
import typings.webcola.anon.FnCallTypes
import typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.layoutMod.Event
import typings.webcola.layoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3v4adaptorMod {
  
  @JSImport("webcola/dist/src/d3v4adaptor", "D3StyleLayoutAdaptor")
  @js.native
  class D3StyleLayoutAdaptor protected ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    def this(d3Context: D3Context) = this()
    
    /* private */ var d3Context: js.Any = js.native
    
    /* protected */ /* InferMemberOverrides */
    override def kick(): Unit = js.native
    
    /* protected */ /* InferMemberOverrides */
    override def trigger(e: Event): Unit = js.native
  }
  
  trait D3Context extends StObject {
    
    def dispatch[T /* <: js.Object */](types: String*): Dispatch_[T]
    @JSName("dispatch")
    var dispatch_Original: FnCallTypes
    
    def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition]
    @JSName("drag")
    def drag_GElement_DraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject]
    @JSName("drag")
    var drag_Original: Fn0
    
    var event: js.Any
    
    def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_
    @JSName("timer")
    var timer_Original: FnCall
  }
  object D3Context {
    
    inline def apply(dispatch: FnCallTypes, drag: Fn0, event: js.Any, timer: FnCall): D3Context = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[D3Context]
    }
    
    extension [Self <: D3Context](x: Self) {
      
      inline def setDispatch(value: FnCallTypes): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDrag(value: Fn0): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: FnCall): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
