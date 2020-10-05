package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineStringGeometryAccess extends IFreezable {
  def get(index: Double): js.Array[Double] = js.native
  def getChildGeometry(index: Double): IPointGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[Double]] = js.native
  def getLength(): Double = js.native
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
  def remove(index: Double): js.Array[Double] = js.native
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
  def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
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
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
  @scala.inline
  implicit class ILineStringGeometryAccessOps[Self <: ILineStringGeometryAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Double => js.Array[Double]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildGeometry(value: Double => IPointGeometryAccess): Self = this.set("getChildGeometry", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = this.set("getClosest", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[Double]]): Self = this.set("getCoordinates", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: Double => js.Array[Double]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Double, js.Array[Double]) => ILineStringGeometryAccess): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSetCoordinates(value: js.Array[Double] => ILineStringGeometryAccess): Self = this.set("setCoordinates", js.Any.fromFunction1(value))
    @scala.inline
    def setSplice(value: (Double, Double) => js.Array[js.Array[Double]]): Self = this.set("splice", js.Any.fromFunction2(value))
  }
  
}

