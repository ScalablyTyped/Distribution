package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelLineStringGeometry extends IPixelGeometry {
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object
  def getCoordinates(): js.Array[js.Array[scala.Double]]
  def getLength(): scala.Double
}

object IPixelLineStringGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => scala.Boolean,
    events: IEventManager,
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[scala.Double]],
    getLength: () => scala.Double,
    getMetaData: () => js.Object,
    getType: () => java.lang.String,
    scale: scala.Double => IPixelGeometry,
    shift: js.Array[scala.Double] => IPixelGeometry
  ): IPixelLineStringGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), events = events, getBounds = js.Any.fromFunction0(getBounds), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
  
    __obj.asInstanceOf[IPixelLineStringGeometry]
  }
}

