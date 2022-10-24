package typings.wixStyleReact.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWidth extends StObject {
  
  def clickOutside(): js.Promise[Unit]
  
  def exists(): js.Promise[Boolean]
  
  def getWidth(): js.Promise[String]
  
  def open(): ReturnType[js.Function0[js.Promise[Unit]]]
}
object GetWidth {
  
  inline def apply(
    clickOutside: () => js.Promise[Unit],
    exists: () => js.Promise[Boolean],
    getWidth: () => js.Promise[String],
    open: () => ReturnType[js.Function0[js.Promise[Unit]]]
  ): GetWidth = {
    val __obj = js.Dynamic.literal(clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), getWidth = js.Any.fromFunction0(getWidth), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[GetWidth]
  }
  
  extension [Self <: GetWidth](x: Self) {
    
    inline def setClickOutside(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => ReturnType[js.Function0[js.Promise[Unit]]]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
