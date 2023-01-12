package typings.svgjsDraggable

import typings.std.MouseEvent
import typings.svgjsDraggable.svgjs.draggable.DragDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgjs {
  
  @js.native
  trait Element extends StObject {
    
    def beforedrag(event: MouseEvent): Any = js.native
    
    def dragend(delta: DragDelta, event: MouseEvent): Any = js.native
    
    def draggable(): this.type = js.native
    def draggable(obj: js.Object): this.type = js.native
    
    def dragmove(delta: DragDelta, event: MouseEvent): Any = js.native
    
    def dragstart(delta: DragDelta, event: MouseEvent): Any = js.native
    
    def fixed(): this.type = js.native
  }
  
  object draggable {
    
    trait DragDelta extends StObject {
      
      var x: Double
      
      var y: Double
      
      var zoom: Double
    }
    object DragDelta {
      
      inline def apply(x: Double, y: Double, zoom: Double): DragDelta = {
        val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
        __obj.asInstanceOf[DragDelta]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DragDelta] (val x: Self) extends AnyVal {
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      }
    }
  }
}
