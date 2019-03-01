package typings
package yandexDashMapsLib.ymapsNs

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
    getBounds: js.Function0[js.Array[js.Array[scala.Double]] | scala.Null],
    getType: js.Function0[java.lang.String]
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[IBaseGeometry]
  }
}

