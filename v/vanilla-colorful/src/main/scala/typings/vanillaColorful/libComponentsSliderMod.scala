package typings.vanillaColorful

import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ShadowRoot
import typings.vanillaColorful.libTypesMod.HsvaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderMod {
  
  /* note: abstract class */ @JSImport("vanilla-colorful/lib/components/slider", "Slider")
  @js.native
  open class Slider protected () extends StObject {
    def this(root: ShadowRoot, part: String, aria: String, xy: Boolean) = this()
    
    def dragging_=(state: Boolean): Unit = js.native
    
    var el: HTMLElement = js.native
    
    def getMove(offset: Offset): Record[String, Double] = js.native
    def getMove(offset: Offset, key: Boolean): Record[String, Double] = js.native
    
    def handleEvent(event: Event): Unit = js.native
    
    var nodes: js.Array[HTMLElement] = js.native
    
    def style(styles: js.Array[Record[String, String]]): Unit = js.native
    
    def update(hsva: HsvaColor): Unit = js.native
    
    var xy: Boolean = js.native
  }
  
  trait Offset extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Offset {
    
    inline def apply(x: Double, y: Double): Offset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
