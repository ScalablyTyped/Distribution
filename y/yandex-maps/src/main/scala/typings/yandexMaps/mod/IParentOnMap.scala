package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentOnMap extends js.Object {
  def getMap(): Map_
}

object IParentOnMap {
  @scala.inline
  def apply(getMap: () => Map_): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IParentOnMap]
  }
}

