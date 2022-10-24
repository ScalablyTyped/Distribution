package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppearance extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /** Get tagName */
  def getAppearance(): js.Promise[Any]
  
  /** Get short version of text */
  def getShortText(): js.Promise[Any]
  
  /** Get long version of text */
  def getText(): js.Promise[Any]
}
object GetAppearance {
  
  inline def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getAppearance: () => js.Promise[Any],
    getShortText: () => js.Promise[Any],
    getText: () => js.Promise[Any]
  ): GetAppearance = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAppearance = js.Any.fromFunction0(getAppearance), getShortText = js.Any.fromFunction0(getShortText), getText = js.Any.fromFunction0(getText))
    __obj.asInstanceOf[GetAppearance]
  }
  
  extension [Self <: GetAppearance](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetAppearance(value: () => js.Promise[Any]): Self = StObject.set(x, "getAppearance", js.Any.fromFunction0(value))
    
    inline def setGetShortText(value: () => js.Promise[Any]): Self = StObject.set(x, "getShortText", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => js.Promise[Any]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
  }
}
