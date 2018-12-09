package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IControlParent extends IParentOnMap {
  def getChildElement(child: IControl): js.Promise[stdLib.HTMLElement]
}

