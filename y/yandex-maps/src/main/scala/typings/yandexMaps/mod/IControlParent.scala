package typings.yandexMaps.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlParent extends IParentOnMap {
  
  def getChildElement(child: IControl): js.Promise[HTMLElement] = js.native
}
object IControlParent {
  
  @scala.inline
  def apply(getChildElement: IControl => js.Promise[HTMLElement], getMap: () => Map_): IControlParent = {
    val __obj = js.Dynamic.literal(getChildElement = js.Any.fromFunction1(getChildElement), getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IControlParent]
  }
  
  @scala.inline
  implicit class IControlParentOps[Self <: IControlParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetChildElement(value: IControl => js.Promise[HTMLElement]): Self = this.set("getChildElement", js.Any.fromFunction1(value))
  }
}
