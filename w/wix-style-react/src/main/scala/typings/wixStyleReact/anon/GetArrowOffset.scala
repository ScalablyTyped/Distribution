package typings.wixStyleReact.anon

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowOffset extends StObject {
  
  /**
    * Clicks on the target element
    * @returns {Promise<void>}
    */
  def click(): js.Promise[Unit]
  
  /**
    * Clicks outside the target element (triggers mouseDown and mouseUp events)
    * @returns {Promise<void>}
    */
  def clickOutside(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /**
    * Gets the arrow offset
    * @returns {Promise<any>}
    */
  def getArrowOffset(): js.Promise[Any]
  
  /**
    * Gets the content element
    * @returns {Promise<any>}
    */
  def getContentElement(): js.Promise[Any]
  
  /**
    * Gets content as unidriver element
    * @private
    */
  def getContentElementUniDriver(): js.Promise[UniDriver[Any]]
  
  /**
    * Gets the portal element
    * @returns {Promise<any>}
    */
  def getPortalElement(): js.Promise[Any]
  
  /**
    * Gets the target element
    * @returns {Promise<any>}
    */
  def getTargetElement(): js.Promise[Any]
  
  /**
    * Checks whether content element exists
    * @returns {Promise<boolean>}
    */
  def isContentElementExists(): js.Promise[Boolean]
  
  /**
    * Checks whether target element exists
    * @returns {Promise<boolean>}
    */
  def isTargetElementExists(): js.Promise[Boolean]
  
  /**
    * Triggers a mouseEnter event
    * @returns {Promise<void>}
    */
  def mouseEnter(): js.Promise[Unit]
  
  /**
    * Triggers a mouseLeave event
    * @returns {Promise<void>}
    */
  def mouseLeave(): js.Promise[Unit]
}
object GetArrowOffset {
  
  inline def apply(
    click: () => js.Promise[Unit],
    clickOutside: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getArrowOffset: () => js.Promise[Any],
    getContentElement: () => js.Promise[Any],
    getContentElementUniDriver: () => js.Promise[UniDriver[Any]],
    getPortalElement: () => js.Promise[Any],
    getTargetElement: () => js.Promise[Any],
    isContentElementExists: () => js.Promise[Boolean],
    isTargetElementExists: () => js.Promise[Boolean],
    mouseEnter: () => js.Promise[Unit],
    mouseLeave: () => js.Promise[Unit]
  ): GetArrowOffset = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getContentElementUniDriver = js.Any.fromFunction0(getContentElementUniDriver), getPortalElement = js.Any.fromFunction0(getPortalElement), getTargetElement = js.Any.fromFunction0(getTargetElement), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
    __obj.asInstanceOf[GetArrowOffset]
  }
  
  extension [Self <: GetArrowOffset](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetArrowOffset(value: () => js.Promise[Any]): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    inline def setGetContentElement(value: () => js.Promise[Any]): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    inline def setGetContentElementUniDriver(value: () => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "getContentElementUniDriver", js.Any.fromFunction0(value))
    
    inline def setGetPortalElement(value: () => js.Promise[Any]): Self = StObject.set(x, "getPortalElement", js.Any.fromFunction0(value))
    
    inline def setGetTargetElement(value: () => js.Promise[Any]): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    inline def setIsContentElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    inline def setIsTargetElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
  }
}
