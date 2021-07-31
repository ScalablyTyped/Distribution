package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowOffset extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickOutside(): js.Promise[Unit]
  
  def element(): js.Promise[js.Any]
  
  def exists(): js.Promise[Boolean]
  
  def getArrowOffset(): js.Promise[js.Any]
  
  /**
    * Returns the content element (`<Popover.Content/>`)
    * @returns null if element is not found
    */
  def getContentElement(): js.Promise[js.Any]
  
  def getPortalElement(): js.Promise[js.Any]
  
  def getTargetElement(): js.Promise[js.Any]
  
  /** Returns `true` whether the content element (`<Popover.Content/>`) exists */
  def isContentElementExists(): js.Promise[Boolean]
  
  /** Returns `true` whether the target element (`<Popover.Element/>`) exists */
  def isTargetElementExists(): js.Promise[Boolean]
  
  def mouseEnter(): js.Promise[Unit]
  
  def mouseLeave(): js.Promise[Unit]
}
object GetArrowOffset {
  
  @scala.inline
  def apply(
    click: () => js.Promise[Unit],
    clickOutside: () => js.Promise[Unit],
    element: () => js.Promise[js.Any],
    exists: () => js.Promise[Boolean],
    getArrowOffset: () => js.Promise[js.Any],
    getContentElement: () => js.Promise[js.Any],
    getPortalElement: () => js.Promise[js.Any],
    getTargetElement: () => js.Promise[js.Any],
    isContentElementExists: () => js.Promise[Boolean],
    isTargetElementExists: () => js.Promise[Boolean],
    mouseEnter: () => js.Promise[Unit],
    mouseLeave: () => js.Promise[Unit]
  ): GetArrowOffset = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getPortalElement = js.Any.fromFunction0(getPortalElement), getTargetElement = js.Any.fromFunction0(getTargetElement), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
    __obj.asInstanceOf[GetArrowOffset]
  }
  
  @scala.inline
  implicit class GetArrowOffsetMutableBuilder[Self <: GetArrowOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArrowOffset(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPortalElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getPortalElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsContentElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTargetElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
  }
}
