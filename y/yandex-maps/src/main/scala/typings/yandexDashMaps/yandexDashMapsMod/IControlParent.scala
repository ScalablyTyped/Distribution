package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlParent extends IParentOnMap {
  def getChildElement(child: IControl): js.Promise[HTMLElement]
}

object IControlParent {
  @scala.inline
  def apply(getChildElement: IControl => js.Promise[HTMLElement], getMap: () => Map): IControlParent = {
    val __obj = js.Dynamic.literal(getChildElement = js.Any.fromFunction1(getChildElement), getMap = js.Any.fromFunction0(getMap))
  
    __obj.asInstanceOf[IControlParent]
  }
}

