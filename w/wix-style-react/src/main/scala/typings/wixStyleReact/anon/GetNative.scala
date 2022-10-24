package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNative extends StObject {
  
  def childExists(selector: Any): js.Promise[Any]
  
  def click(): js.Promise[Any]
  
  def exists(): js.Promise[Any]
  
  def getNative(): js.Promise[Any]
  
  def getToggleText(): js.Promise[Any]
  
  def isSelected(): js.Promise[Boolean]
  
  def prefixExists(): js.Promise[Any]
}
object GetNative {
  
  inline def apply(
    childExists: Any => js.Promise[Any],
    click: () => js.Promise[Any],
    exists: () => js.Promise[Any],
    getNative: () => js.Promise[Any],
    getToggleText: () => js.Promise[Any],
    isSelected: () => js.Promise[Boolean],
    prefixExists: () => js.Promise[Any]
  ): GetNative = {
    val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getNative = js.Any.fromFunction0(getNative), getToggleText = js.Any.fromFunction0(getToggleText), isSelected = js.Any.fromFunction0(isSelected), prefixExists = js.Any.fromFunction0(prefixExists))
    __obj.asInstanceOf[GetNative]
  }
  
  extension [Self <: GetNative](x: Self) {
    
    inline def setChildExists(value: Any => js.Promise[Any]): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClick(value: () => js.Promise[Any]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Any]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetNative(value: () => js.Promise[Any]): Self = StObject.set(x, "getNative", js.Any.fromFunction0(value))
    
    inline def setGetToggleText(value: () => js.Promise[Any]): Self = StObject.set(x, "getToggleText", js.Any.fromFunction0(value))
    
    inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    
    inline def setPrefixExists(value: () => js.Promise[Any]): Self = StObject.set(x, "prefixExists", js.Any.fromFunction0(value))
  }
}
