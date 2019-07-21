package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolygonGeometryAccess extends IFreezable {
  def contains(position: js.Array[scala.Double]): scala.Boolean
  def get(index: scala.Double): js.Array[js.Array[scala.Double]]
  def getChildGeometry(index: scala.Double): ILinearRingGeometryAccess
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object
  def getCoordinates(): js.Array[js.Array[js.Array[scala.Double]]]
  def getFillRule(): java.lang.String
  def getLength(): scala.Double
  def insert(index: scala.Double, path: js.Array[js.Array[scala.Double]]): IPolygonGeometryAccess
  def remove(index: scala.Double): ILinearRingGeometryAccess
  def set(index: scala.Double, path: js.Array[js.Array[scala.Double]]): IPolygonGeometryAccess
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[scala.Double]]]): IPolygonGeometryAccess
  def setFillRule(fillRule: java.lang.String): IPolygonGeometryAccess
  def splice(index: scala.Double, number: scala.Double): js.Array[ILinearRingGeometryAccess]
}

object IPolygonGeometryAccess {
  @scala.inline
  def apply(
    contains: js.Array[scala.Double] => scala.Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: scala.Double => js.Array[js.Array[scala.Double]],
    getChildGeometry: scala.Double => ILinearRingGeometryAccess,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[scala.Double]]],
    getFillRule: () => java.lang.String,
    getLength: () => scala.Double,
    insert: (scala.Double, js.Array[js.Array[scala.Double]]) => IPolygonGeometryAccess,
    isFrozen: () => scala.Boolean,
    remove: scala.Double => ILinearRingGeometryAccess,
    set: (scala.Double, js.Array[js.Array[scala.Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[scala.Double]]] => IPolygonGeometryAccess,
    setFillRule: java.lang.String => IPolygonGeometryAccess,
    splice: (scala.Double, scala.Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: () => IFreezable
  ): IPolygonGeometryAccess = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[IPolygonGeometryAccess]
  }
}

