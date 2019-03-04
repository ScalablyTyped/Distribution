package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): scala.Boolean
  def getMetaData(): js.Object
  def scale(factor: scala.Double): IPixelGeometry
  def shift(offset: js.Array[scala.Double]): IPixelGeometry
}

object IPixelGeometry {
  @scala.inline
  def apply(
    equals: js.Function1[IPixelGeometry, scala.Boolean],
    events: IEventManager,
    getBounds: js.Function0[js.Array[js.Array[scala.Double]] | scala.Null],
    getMetaData: js.Function0[js.Object],
    getType: js.Function0[java.lang.String],
    scale: js.Function1[scala.Double, IPixelGeometry],
    shift: js.Function1[js.Array[scala.Double], IPixelGeometry]
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(equals = equals, events = events, getBounds = getBounds, getMetaData = getMetaData, getType = getType, scale = scale, shift = shift)
  
    __obj.asInstanceOf[IPixelGeometry]
  }
}

