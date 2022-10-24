package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /** Returns size property value */
  def getSize(): Any
}
object Exists {
  
  inline def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getSize: () => Any
  ): Exists = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSize = js.Any.fromFunction0(getSize))
    __obj.asInstanceOf[Exists]
  }
  
  extension [Self <: Exists](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => Any): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
  }
}
