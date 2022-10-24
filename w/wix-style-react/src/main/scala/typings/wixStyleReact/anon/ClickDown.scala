package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickDown extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickDown(): Any
  
  def clickUp(): Any
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def isDownDisabled(): js.Promise[Boolean]
  
  def isUpDisabled(): js.Promise[Boolean]
}
object ClickDown {
  
  inline def apply(
    click: () => js.Promise[Unit],
    clickDown: () => Any,
    clickUp: () => Any,
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    isDownDisabled: () => js.Promise[Boolean],
    isUpDisabled: () => js.Promise[Boolean]
  ): ClickDown = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickDown = js.Any.fromFunction0(clickDown), clickUp = js.Any.fromFunction0(clickUp), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isDownDisabled = js.Any.fromFunction0(isDownDisabled), isUpDisabled = js.Any.fromFunction0(isUpDisabled))
    __obj.asInstanceOf[ClickDown]
  }
  
  extension [Self <: ClickDown](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickDown(value: () => Any): Self = StObject.set(x, "clickDown", js.Any.fromFunction0(value))
    
    inline def setClickUp(value: () => Any): Self = StObject.set(x, "clickUp", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setIsDownDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDownDisabled", js.Any.fromFunction0(value))
    
    inline def setIsUpDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isUpDisabled", js.Any.fromFunction0(value))
  }
}
