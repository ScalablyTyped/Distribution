package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.uswdsUswds.anon.Body
import typings.uswdsUswds.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaTooltipMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-tooltip", JSImport.Default)
  @js.native
  val default: Tooltip = js.native
  
  @js.native
  trait Tooltip extends StObject {
    
    def getTooltipElements(trigger: Element): Body = js.native
    
    /**
      * Removes all the properties to show and position the tooltip,
      * and resets the tooltip position to the original intention
      * in case the window is resized or the element is moved through
      * DOM manipulation.
      */
    def hide(tooltipBody: HTMLElement): Unit = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    /**
      * Setup the tooltip component
      */
    def setup(tooltipTrigger: HTMLElement): Position = js.native
    
    /**
      * Shows the tooltip
      */
    def show(tooltipTrigger: HTMLElement): Unit = js.native
  }
  
  trait TooltipContext extends StObject {
    
    var position: String
    
    var tooltipBody: HTMLSpanElement
    
    var tooltipContent: String
    
    var wrapper: HTMLSpanElement
  }
  object TooltipContext {
    
    inline def apply(position: String, tooltipBody: HTMLSpanElement, tooltipContent: String, wrapper: HTMLSpanElement): TooltipContext = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], tooltipBody = tooltipBody.asInstanceOf[js.Any], tooltipContent = tooltipContent.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipContext] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTooltipBody(value: HTMLSpanElement): Self = StObject.set(x, "tooltipBody", value.asInstanceOf[js.Any])
      
      inline def setTooltipContent(value: String): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: HTMLSpanElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Tooltip
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaTooltipMod.foo` */
  override def _to: Tooltip = default
}
