package typings.webcola

import typings.webcola.layoutMod.EventType
import typings.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/adaptor", JSImport.Namespace)
@js.native
object adaptorMod extends js.Object {
  
  def adaptor(options: js.Any): LayoutAdaptor = js.native
  
  @js.native
  class LayoutAdaptor protected () extends Layout {
    def this(options: js.Any) = this()
    
    def drag(): Unit = js.native
    
    def dragEnd(d: js.Any): Unit = js.native
    
    def dragStart(d: js.Any): Unit = js.native
    
    def dragend(d: js.Any): Unit = js.native
    
    def dragstart(d: js.Any): Unit = js.native
    
    def on(eventType: String, listener: js.Function0[Unit]): this.type = js.native
    def on(eventType: EventType, listener: js.Function0[Unit]): this.type = js.native
  }
}
