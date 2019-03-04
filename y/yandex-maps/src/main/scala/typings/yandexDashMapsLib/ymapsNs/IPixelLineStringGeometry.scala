package typings
package yandexDashMapsLib.ymapsNs

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
    equals: js.Function1[IPixelGeometry, scala.Boolean],
    events: IEventManager,
    getBounds: js.Function0[js.Array[js.Array[scala.Double]] | scala.Null],
    getClosest: js.Function1[js.Array[scala.Double], js.Object],
    getCoordinates: js.Function0[js.Array[js.Array[scala.Double]]],
    getLength: js.Function0[scala.Double],
    getMetaData: js.Function0[js.Object],
    getType: js.Function0[java.lang.String],
    scale: js.Function1[scala.Double, IPixelGeometry],
    shift: js.Function1[js.Array[scala.Double], IPixelGeometry]
  ): IPixelLineStringGeometry = {
    val __obj = js.Dynamic.literal(equals = equals, events = events, getBounds = getBounds, getClosest = getClosest, getCoordinates = getCoordinates, getLength = getLength, getMetaData = getMetaData, getType = getType, scale = scale, shift = shift)
  
    __obj.asInstanceOf[IPixelLineStringGeometry]
  }
}

