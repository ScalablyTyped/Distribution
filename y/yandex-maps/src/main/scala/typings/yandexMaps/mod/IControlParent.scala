package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlParent
  extends StObject
     with IParentOnMap {
  
  def getChildElement(child: IControl): js.Promise[HTMLElement]
}
object IControlParent {
  
  @scala.inline
  def apply(getChildElement: IControl => js.Promise[HTMLElement], getMap: () => Map_): IControlParent = {
    val __obj = js.Dynamic.literal(getChildElement = js.Any.fromFunction1(getChildElement), getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IControlParent]
  }
  
  @scala.inline
  implicit class IControlParentMutableBuilder[Self <: IControlParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetChildElement(value: IControl => js.Promise[HTMLElement]): Self = StObject.set(x, "getChildElement", js.Any.fromFunction1(value))
  }
}
