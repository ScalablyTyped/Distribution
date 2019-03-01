package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentOnMap extends js.Object {
  def getMap(): Map
}

object IParentOnMap {
  @scala.inline
  def apply(getMap: js.Function0[Map]): IParentOnMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMap")(getMap)
    __obj.asInstanceOf[IParentOnMap]
  }
}

