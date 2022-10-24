package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTooltipText extends StObject {
  
  /** clicks outside the tooltip target */
  def clickOutside(): js.Promise[Unit]
  
  /** returns true if trigger element exists on the DOM */
  def exists(): js.Promise[Boolean]
  
  /** returns tooltips content value in string */
  def getTooltipText(): js.UndefOr[String | Null]
  
  /**
    * Checks whether tooltip has a given size
    * @param {boolean} sizeName The tooltip size
    * @return {Promise<boolean>}
    */
  def hasSize(sizeName: TooltipSize): Boolean
  
  /** mouse over the target element */
  def mouseEnter(): js.Promise[js.UndefOr[Unit]]
  
  /** mouse leaves the target element */
  def mouseLeave(): js.Promise[js.UndefOr[Unit]]
  
  /** returns true if tooltip element exists on the DOM */
  def tooltipExists(): js.Promise[Boolean]
}
object GetTooltipText {
  
  inline def apply(
    clickOutside: () => js.Promise[Unit],
    exists: () => js.Promise[Boolean],
    getTooltipText: () => js.UndefOr[String | Null],
    hasSize: TooltipSize => Boolean,
    mouseEnter: () => js.Promise[js.UndefOr[Unit]],
    mouseLeave: () => js.Promise[js.UndefOr[Unit]],
    tooltipExists: () => js.Promise[Boolean]
  ): GetTooltipText = {
    val __obj = js.Dynamic.literal(clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), getTooltipText = js.Any.fromFunction0(getTooltipText), hasSize = js.Any.fromFunction1(hasSize), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), tooltipExists = js.Any.fromFunction0(tooltipExists))
    __obj.asInstanceOf[GetTooltipText]
  }
  
  extension [Self <: GetTooltipText](x: Self) {
    
    inline def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetTooltipText(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getTooltipText", js.Any.fromFunction0(value))
    
    inline def setHasSize(value: TooltipSize => Boolean): Self = StObject.set(x, "hasSize", js.Any.fromFunction1(value))
    
    inline def setMouseEnter(value: () => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    
    inline def setTooltipExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "tooltipExists", js.Any.fromFunction0(value))
  }
}
