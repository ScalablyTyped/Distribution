package typings.wixUiCore.anon

import typings.std.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStyle extends StObject {
  
  def focus(): js.Promise[Unit]
  
  def getStyle(): js.Promise[CSSStyleDeclaration]
  
  def mouseLeave(): js.Promise[Unit]
}
object GetStyle {
  
  inline def apply(
    focus: () => js.Promise[Unit],
    getStyle: () => js.Promise[CSSStyleDeclaration],
    mouseLeave: () => js.Promise[Unit]
  ): GetStyle = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), getStyle = js.Any.fromFunction0(getStyle), mouseLeave = js.Any.fromFunction0(mouseLeave))
    __obj.asInstanceOf[GetStyle]
  }
  
  extension [Self <: GetStyle](x: Self) {
    
    inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGetStyle(value: () => js.Promise[CSSStyleDeclaration]): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
  }
}
