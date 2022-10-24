package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExistsClickElement extends StObject {
  
  def childExists(dataHook: Any): Any
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
}
object ChildExistsClickElement {
  
  inline def apply(
    childExists: Any => Any,
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean]
  ): ChildExistsClickElement = {
    val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
    __obj.asInstanceOf[ChildExistsClickElement]
  }
  
  extension [Self <: ChildExistsClickElement](x: Self) {
    
    inline def setChildExists(value: Any => Any): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
  }
}
