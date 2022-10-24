package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentText extends StObject {
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getContentText(): Any
  
  def getToggleStyles(): Any
}
object GetContentText {
  
  inline def apply(
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getContentText: () => Any,
    getToggleStyles: () => Any
  ): GetContentText = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentText = js.Any.fromFunction0(getContentText), getToggleStyles = js.Any.fromFunction0(getToggleStyles))
    __obj.asInstanceOf[GetContentText]
  }
  
  extension [Self <: GetContentText](x: Self) {
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetContentText(value: () => Any): Self = StObject.set(x, "getContentText", js.Any.fromFunction0(value))
    
    inline def setGetToggleStyles(value: () => Any): Self = StObject.set(x, "getToggleStyles", js.Any.fromFunction0(value))
  }
}
