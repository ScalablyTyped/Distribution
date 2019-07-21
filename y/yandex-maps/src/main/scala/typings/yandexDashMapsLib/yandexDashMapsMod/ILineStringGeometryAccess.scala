package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineStringGeometryAccess extends IFreezable {
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

object ILineStringGeometryAccess {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    get: scala.Double => js.Array[scala.Double],
    getChildGeometry: scala.Double => IPointGeometryAccess,
    getClosest: js.Array[scala.Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[scala.Double]],
    getLength: () => scala.Double,
    insert: (scala.Double, js.Array[js.Array[scala.Double]]) => ILineStringGeometryAccess,
    isFrozen: () => scala.Boolean,
    remove: scala.Double => js.Array[scala.Double],
    set: (scala.Double, js.Array[scala.Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[scala.Double] => ILineStringGeometryAccess,
    splice: (scala.Double, scala.Double) => js.Array[js.Array[scala.Double]],
    unfreeze: () => IFreezable
  ): ILineStringGeometryAccess = {
    val __obj = js.Dynamic.literal(events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
}

