package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseGeometry extends IEventEmitter {
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null
  def getType(): java.lang.String
}

object IBaseGeometry {
  @scala.inline
  def apply(
    events: IEventManager,
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getType: () => java.lang.String
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events, getBounds = js.Any.fromFunction0(getBounds), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[IBaseGeometry]
  }
}

