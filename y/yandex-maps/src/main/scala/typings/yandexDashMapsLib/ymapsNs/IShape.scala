package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShape extends js.Object {
  def contains(position: js.Array[scala.Double]): scala.Boolean
  def equals(shape: IShape): scala.Boolean
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null
  def getGeometry(): IPixelGeometry
  def getType(): java.lang.String
  def scale(factor: scala.Double): IShape
  def shift(offset: js.Array[scala.Double]): IShape
}

object IShape {
  @scala.inline
  def apply(
    contains: js.Function1[js.Array[scala.Double], scala.Boolean],
    equals: js.Function1[IShape, scala.Boolean],
    getBounds: js.Function0[js.Array[js.Array[scala.Double]] | scala.Null],
    getGeometry: js.Function0[IPixelGeometry],
    getType: js.Function0[java.lang.String],
    scale: js.Function1[scala.Double, IShape],
    shift: js.Function1[js.Array[scala.Double], IShape]
  ): IShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getGeometry")(getGeometry)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[IShape]
  }
}

