package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContent extends StObject {
  
  /** returns element **/
  def element(): Any
  
  /** returns whether element is rendered */
  def exists(): Boolean
  
  /** Get content as a tooltip text value. */
  def getContent(): js.UndefOr[String | Null]
  
  /** Get size. */
  def getSize(): Any
  
  /** Hover on icon. */
  def hover(): js.Promise[js.UndefOr[Unit]]
}
object GetContent {
  
  inline def apply(
    element: () => Any,
    exists: () => Boolean,
    getContent: () => js.UndefOr[String | Null],
    getSize: () => Any,
    hover: () => js.Promise[js.UndefOr[Unit]]
  ): GetContent = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getSize = js.Any.fromFunction0(getSize), hover = js.Any.fromFunction0(hover))
    __obj.asInstanceOf[GetContent]
  }
  
  extension [Self <: GetContent](x: Self) {
    
    inline def setElement(value: () => Any): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetContent(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => Any): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setHover(value: () => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
  }
}
