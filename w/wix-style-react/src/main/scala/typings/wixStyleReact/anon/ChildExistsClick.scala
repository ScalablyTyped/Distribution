package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExistsClick extends StObject {
  
  def childExists(selector: Any): js.Promise[Any]
  
  def click(): js.Promise[Any]
  
  def exists(): js.Promise[Any]
  
  def isSelected(): js.Promise[Boolean]
}
object ChildExistsClick {
  
  inline def apply(
    childExists: Any => js.Promise[Any],
    click: () => js.Promise[Any],
    exists: () => js.Promise[Any],
    isSelected: () => js.Promise[Boolean]
  ): ChildExistsClick = {
    val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), isSelected = js.Any.fromFunction0(isSelected))
    __obj.asInstanceOf[ChildExistsClick]
  }
  
  extension [Self <: ChildExistsClick](x: Self) {
    
    inline def setChildExists(value: Any => js.Promise[Any]): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClick(value: () => js.Promise[Any]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Any]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
  }
}
