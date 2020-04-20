package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseGeometry extends IEventEmitter {
  def getBounds(): js.Array[js.Array[Double]] | Null
  def getType(): String
}

object IBaseGeometry {
  @scala.inline
  def apply(events: IEventManager, getBounds: () => js.Array[js.Array[Double]] | Null, getType: () => String): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[IBaseGeometry]
  }
}

