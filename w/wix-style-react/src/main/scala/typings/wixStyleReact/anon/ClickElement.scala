package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickElement extends StObject {
  
  /**
    * Clicks on the component root element
    * @returns {Promise<void>}
    */
  def click(): js.Promise[Unit]
  
  /**
    * Gets the component root element
    * @returns {Promise<any>}
    */
  def element(): js.Promise[Any]
  
  /**
    * Checks whether the component found with the given data hook
    * @returns {Promise<boolean>}
    */
  def exists(): js.Promise[Boolean]
}
object ClickElement {
  
  inline def apply(click: () => js.Promise[Unit], element: () => js.Promise[Any], exists: () => js.Promise[Boolean]): ClickElement = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
    __obj.asInstanceOf[ClickElement]
  }
  
  extension [Self <: ClickElement](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
  }
}
