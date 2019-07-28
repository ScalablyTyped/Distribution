package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineStringGeometryAccess extends IFreezable {
  def get(index: Double): js.Array[Double]
  def getChildGeometry(index: Double): IPointGeometryAccess
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  def getCoordinates(): js.Array[js.Array[Double]]
  def getLength(): Double
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  def remove(index: Double): js.Array[Double]
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess
  def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess
  def splice(index: Double, length: Double): js.Array[js.Array[Double]]
}

object ILineStringGeometryAccess {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[Double],
    getChildGeometry: Double => IPointGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[Double]],
    getLength: () => Double,
    insert: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => js.Array[Double],
    set: (Double, js.Array[Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[Double] => ILineStringGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: () => IFreezable
  ): ILineStringGeometryAccess = {
    val __obj = js.Dynamic.literal(events = events, freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
  
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
}

