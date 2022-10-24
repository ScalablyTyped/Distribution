package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickUp extends StObject {
  
  def clickDown(): Unit
  
  def clickUp(): Unit
  
  def exists(): Boolean
  
  def getDown(): Any
  
  def getUp(): Any
  
  def isDownDisabled(): Any
  
  def isUpDisabled(): Any
}
object ClickUp {
  
  inline def apply(
    clickDown: () => Unit,
    clickUp: () => Unit,
    exists: () => Boolean,
    getDown: () => Any,
    getUp: () => Any,
    isDownDisabled: () => Any,
    isUpDisabled: () => Any
  ): ClickUp = {
    val __obj = js.Dynamic.literal(clickDown = js.Any.fromFunction0(clickDown), clickUp = js.Any.fromFunction0(clickUp), exists = js.Any.fromFunction0(exists), getDown = js.Any.fromFunction0(getDown), getUp = js.Any.fromFunction0(getUp), isDownDisabled = js.Any.fromFunction0(isDownDisabled), isUpDisabled = js.Any.fromFunction0(isUpDisabled))
    __obj.asInstanceOf[ClickUp]
  }
  
  extension [Self <: ClickUp](x: Self) {
    
    inline def setClickDown(value: () => Unit): Self = StObject.set(x, "clickDown", js.Any.fromFunction0(value))
    
    inline def setClickUp(value: () => Unit): Self = StObject.set(x, "clickUp", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetDown(value: () => Any): Self = StObject.set(x, "getDown", js.Any.fromFunction0(value))
    
    inline def setGetUp(value: () => Any): Self = StObject.set(x, "getUp", js.Any.fromFunction0(value))
    
    inline def setIsDownDisabled(value: () => Any): Self = StObject.set(x, "isDownDisabled", js.Any.fromFunction0(value))
    
    inline def setIsUpDisabled(value: () => Any): Self = StObject.set(x, "isUpDisabled", js.Any.fromFunction0(value))
  }
}
