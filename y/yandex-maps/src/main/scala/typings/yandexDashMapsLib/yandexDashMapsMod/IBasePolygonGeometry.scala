package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ trait IBasePolygonGeometry extends IBaseGeometry {
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

object IBasePolygonGeometry {
  @scala.inline
  def apply(
    contains: js.Array[scala.Double] => scala.Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: scala.Double => js.Array[js.Array[scala.Double]],
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getChildGeometry: scala.Double => ILinearRingGeometryAccess,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[scala.Double]]],
    getFillRule: () => java.lang.String,
    getLength: () => scala.Double,
    getType: () => java.lang.String,
    insert: (scala.Double, js.Array[js.Array[scala.Double]]) => IPolygonGeometryAccess,
    isFrozen: () => scala.Boolean,
    remove: scala.Double => ILinearRingGeometryAccess,
    set: (scala.Double, js.Array[js.Array[scala.Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[scala.Double]]] => IPolygonGeometryAccess,
    setFillRule: java.lang.String => IPolygonGeometryAccess,
    splice: (scala.Double, scala.Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: () => IFreezable
  ): IBasePolygonGeometry = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[IBasePolygonGeometry]
  }
}

