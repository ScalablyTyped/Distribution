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
  def apply(getMap: () => Map): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
  
    __obj.asInstanceOf[IParentOnMap]
  }
}

