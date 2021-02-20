package typings.svgjsDraggable

import typings.std.MouseEvent
import typings.svgjsDraggable.svgjs.draggable.DragDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgjs {
  
  @js.native
  trait Element extends StObject {
    
    def beforedrag(event: MouseEvent): js.Any = js.native
    
    def dragend(delta: DragDelta, event: MouseEvent): js.Any = js.native
    
    def draggable(): this.type = js.native
    def draggable(obj: js.Object): this.type = js.native
    
    def dragmove(delta: DragDelta, event: MouseEvent): js.Any = js.native
    
    def dragstart(delta: DragDelta, event: MouseEvent): js.Any = js.native
    
    def fixed(): this.type = js.native
  }
  
  object draggable {
    
    @js.native
    trait DragDelta extends StObject {
      
      var x: Double = js.native
      
      var y: Double = js.native
      
      var zoom: Double = js.native
    }
    object DragDelta {
      
      @scala.inline
      def apply(x: Double, y: Double, zoom: Double): DragDelta = {
        val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
        __obj.asInstanceOf[DragDelta]
      }
      
      @scala.inline
      implicit class DragDeltaMutableBuilder[Self <: DragDelta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      }
    }
  }
}
