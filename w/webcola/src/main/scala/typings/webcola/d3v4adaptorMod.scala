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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3v4adaptorMod {
  
  @JSImport("webcola/dist/src/d3v4adaptor", "D3StyleLayoutAdaptor")
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
  
  @js.native
  trait D3Context extends StObject {
    
    def dispatch[T /* <: js.Object */](types: String*): Dispatch_[T] = js.native
    @JSName("dispatch")
    var dispatch_Original: FnCallTypes = js.native
    
    def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
    @JSName("drag")
    def drag_GElement_DraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject] = js.native
    @JSName("drag")
    var drag_Original: Fn0 = js.native
    
    var event: js.Any = js.native
    
    def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: js.UndefOr[scala.Nothing], time: Double): Timer_ = js.native
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
    def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
    @JSName("timer")
    var timer_Original: FnCall = js.native
  }
}
