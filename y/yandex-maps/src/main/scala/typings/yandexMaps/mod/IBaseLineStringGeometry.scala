package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typings.yandexMaps.mod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ trait IBaseLineStringGeometry extends IBaseGeometry {
  def freeze(): IFreezable
  def get(index: Double): js.Array[Double]
  def getChildGeometry(index: Double): IPointGeometryAccess
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  def getCoordinates(): js.Array[js.Array[Double]]
  def getLength(): Double
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  def isFrozen(): Boolean
  def remove(index: Double): js.Array[Double]
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess
  def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess
  def splice(index: Double, length: Double): js.Array[js.Array[Double]]
  def unfreeze(): IFreezable
}

object IBaseLineStringGeometry {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[Double],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getChildGeometry: Double => IPointGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[Double]],
    getLength: () => Double,
    getType: () => String,
    insert: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => js.Array[Double],
    set: (Double, js.Array[Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[Double] => ILineStringGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: () => IFreezable
  ): IBaseLineStringGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IBaseLineStringGeometry]
  }
}

