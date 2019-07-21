package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ trait IBaseLineStringGeometry extends IBaseGeometry {
  def get(index: scala.Double): js.Array[scala.Double]
  def getChildGeometry(index: scala.Double): IPointGeometryAccess
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object
  def getCoordinates(): js.Array[js.Array[scala.Double]]
  def getLength(): scala.Double
  def insert(index: scala.Double, coordinates: js.Array[js.Array[scala.Double]]): ILineStringGeometryAccess
  def remove(index: scala.Double): js.Array[scala.Double]
  def set(index: scala.Double, coordinates: js.Array[scala.Double]): ILineStringGeometryAccess
  def setCoordinates(coordinates: js.Array[scala.Double]): ILineStringGeometryAccess
  def splice(index: scala.Double, length: scala.Double): js.Array[js.Array[scala.Double]]
}

object IBaseLineStringGeometry {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    get: scala.Double => js.Array[scala.Double],
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getChildGeometry: scala.Double => IPointGeometryAccess,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[scala.Double]],
    getLength: () => scala.Double,
    getType: () => java.lang.String,
    insert: (scala.Double, js.Array[js.Array[scala.Double]]) => ILineStringGeometryAccess,
    isFrozen: () => scala.Boolean,
    remove: scala.Double => js.Array[scala.Double],
    set: (scala.Double, js.Array[scala.Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[scala.Double] => ILineStringGeometryAccess,
    splice: (scala.Double, scala.Double) => js.Array[js.Array[scala.Double]],
    unfreeze: () => IFreezable
  ): IBaseLineStringGeometry = {
    val __obj = js.Dynamic.literal(events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[IBaseLineStringGeometry]
  }
}

