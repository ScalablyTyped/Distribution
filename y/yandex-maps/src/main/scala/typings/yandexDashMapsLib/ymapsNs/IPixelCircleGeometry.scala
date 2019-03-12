package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelCircleGeometry extends IPixelGeometry {
  def getCoordinates(): js.Array[scala.Double]
  def getRadius(): scala.Double
}

object IPixelCircleGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => scala.Boolean,
    events: IEventManager,
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getCoordinates: () => js.Array[scala.Double],
    getMetaData: () => js.Object,
    getRadius: () => scala.Double,
    getType: () => java.lang.String,
    scale: scala.Double => IPixelGeometry,
    shift: js.Array[scala.Double] => IPixelGeometry
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), events = events, getBounds = js.Any.fromFunction0(getBounds), getCoordinates = js.Any.fromFunction0(getCoordinates), getMetaData = js.Any.fromFunction0(getMetaData), getRadius = js.Any.fromFunction0(getRadius), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
  
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
}

