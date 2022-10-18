package typings.webcola

import typings.webcola.distSrcLayoutMod.EventType
import typings.webcola.distSrcLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdaptorMod {
  
  @JSImport("webcola/dist/src/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola/dist/src/adaptor", "LayoutAdaptor")
  @js.native
  open class LayoutAdaptor protected () extends Layout {
    def this(options: Any) = this()
    
    def drag(): Unit = js.native
    
    def dragEnd(d: Any): Unit = js.native
    
    def dragStart(d: Any): Unit = js.native
    
    def dragend(d: Any): Unit = js.native
    
    def dragstart(d: Any): Unit = js.native
    
    def on(eventType: String, listener: js.Function0[Unit]): this.type = js.native
    def on(eventType: EventType, listener: js.Function0[Unit]): this.type = js.native
  }
  
  inline def adaptor(options: Any): LayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(options.asInstanceOf[js.Any]).asInstanceOf[LayoutAdaptor]
}
