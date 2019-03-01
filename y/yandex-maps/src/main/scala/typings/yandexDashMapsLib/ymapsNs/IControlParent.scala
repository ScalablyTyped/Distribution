package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlParent extends IParentOnMap {
  def getChildElement(child: IControl): js.Promise[stdLib.HTMLElement]
}

object IControlParent {
  @scala.inline
  def apply(getChildElement: js.Function1[IControl, js.Promise[stdLib.HTMLElement]], getMap: js.Function0[Map]): IControlParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildElement")(getChildElement)
    __obj.updateDynamic("getMap")(getMap)
    __obj.asInstanceOf[IControlParent]
  }
}

