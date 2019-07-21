package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinearRingGeometryAccess extends IFreezable {
  def contain(position: scala.Double): scala.Boolean
  def get(index: scala.Double): js.Array[scala.Double]
  def getChildGeometry(index: scala.Double): IPointGeometryAccess
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object
  def getCoordinates(): js.Array[js.Array[scala.Double]]
  def getFillRule(): java.lang.String
  def getLength(): scala.Double
  def insert(index: scala.Double, coordinates: js.Array[scala.Double]): ILinearRingGeometryAccess
  def remove(index: scala.Double): js.Array[scala.Double]
  def set(index: scala.Double, coordinates: js.Array[scala.Double]): ILinearRingGeometryAccess
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): ILinearRingGeometryAccess
  def setFillRule(fillRule: java.lang.String): ILinearRingGeometryAccess
  def splice(index: scala.Double, number: scala.Double): js.Array[js.Array[scala.Double]]
}

object ILinearRingGeometryAccess {
  @scala.inline
  def apply(
    contain: scala.Double => scala.Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: scala.Double => js.Array[scala.Double],
    getChildGeometry: scala.Double => IPointGeometryAccess,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[scala.Double]],
    getFillRule: () => java.lang.String,
    getLength: () => scala.Double,
    insert: (scala.Double, js.Array[scala.Double]) => ILinearRingGeometryAccess,
    isFrozen: () => scala.Boolean,
    remove: scala.Double => js.Array[scala.Double],
    set: (scala.Double, js.Array[scala.Double]) => ILinearRingGeometryAccess,
    setCoordinates: js.Array[js.Array[scala.Double]] => ILinearRingGeometryAccess,
    setFillRule: java.lang.String => ILinearRingGeometryAccess,
    splice: (scala.Double, scala.Double) => js.Array[js.Array[scala.Double]],
    unfreeze: () => IFreezable
  ): ILinearRingGeometryAccess = {
    val __obj = js.Dynamic.literal(contain = js.Any.fromFunction1(contain), events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[ILinearRingGeometryAccess]
  }
}

