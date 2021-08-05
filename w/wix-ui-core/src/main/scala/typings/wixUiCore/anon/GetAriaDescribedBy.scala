package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAriaDescribedBy extends StObject {
  
  def clickOutside(): js.Promise[Unit]
  
  def exists(): js.Promise[Boolean]
  
  def getAriaDescribedBy(): js.Promise[js.Any]
  
  def getTargetText(): js.Promise[js.Any]
  
  def getTooltipText(): js.Promise[js.Any]
  
  def mouseEnter(): js.Promise[Unit]
  
  def mouseLeave(): js.Promise[Unit]
  
  def tabIn(): js.Promise[Unit]
  
  def tabOut(): js.Promise[Unit]
  
  def tooltipExists(): js.Promise[Boolean]
}
object GetAriaDescribedBy {
  
  inline def apply(
    clickOutside: () => js.Promise[Unit],
    exists: () => js.Promise[Boolean],
    getAriaDescribedBy: () => js.Promise[js.Any],
    getTargetText: () => js.Promise[js.Any],
    getTooltipText: () => js.Promise[js.Any],
    mouseEnter: () => js.Promise[Unit],
    mouseLeave: () => js.Promise[Unit],
    tabIn: () => js.Promise[Unit],
    tabOut: () => js.Promise[Unit],
    tooltipExists: () => js.Promise[Boolean]
  ): GetAriaDescribedBy = {
    val __obj = js.Dynamic.literal(clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), getAriaDescribedBy = js.Any.fromFunction0(getAriaDescribedBy), getTargetText = js.Any.fromFunction0(getTargetText), getTooltipText = js.Any.fromFunction0(getTooltipText), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), tabIn = js.Any.fromFunction0(tabIn), tabOut = js.Any.fromFunction0(tabOut), tooltipExists = js.Any.fromFunction0(tooltipExists))
    __obj.asInstanceOf[GetAriaDescribedBy]
  }
  
  extension [Self <: GetAriaDescribedBy](x: Self) {
    
    inline def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetAriaDescribedBy(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getAriaDescribedBy", js.Any.fromFunction0(value))
    
    inline def setGetTargetText(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getTargetText", js.Any.fromFunction0(value))
    
    inline def setGetTooltipText(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getTooltipText", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    
    inline def setTabIn(value: () => js.Promise[Unit]): Self = StObject.set(x, "tabIn", js.Any.fromFunction0(value))
    
    inline def setTabOut(value: () => js.Promise[Unit]): Self = StObject.set(x, "tabOut", js.Any.fromFunction0(value))
    
    inline def setTooltipExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "tooltipExists", js.Any.fromFunction0(value))
  }
}
