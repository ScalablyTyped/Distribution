package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typings.yandexMaps.mod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ @js.native
trait IBasePolygonGeometry extends IBaseGeometry {
  def contains(position: js.Array[Double]): Boolean = js.native
  def freeze(): IFreezable = js.native
  def get(index: Double): js.Array[js.Array[Double]] = js.native
  def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
  def getFillRule(): String = js.native
  def getLength(): Double = js.native
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def isFrozen(): Boolean = js.native
  def remove(index: Double): ILinearRingGeometryAccess = js.native
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess = js.native
  def setFillRule(fillRule: String): IPolygonGeometryAccess = js.native
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
  def unfreeze(): IFreezable = js.native
}

object IBasePolygonGeometry {
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[js.Array[Double]],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getChildGeometry: Double => ILinearRingGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[Double]]],
    getFillRule: () => String,
    getLength: () => Double,
    getType: () => String,
    insert: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => ILinearRingGeometryAccess,
    set: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess,
    setFillRule: String => IPolygonGeometryAccess,
    splice: (Double, Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: () => IFreezable
  ): IBasePolygonGeometry = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IBasePolygonGeometry]
  }
  @scala.inline
  implicit class IBasePolygonGeometryOps[Self <: IBasePolygonGeometry] (val x: Self) extends AnyVal {
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
    def setContains(value: js.Array[Double] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setFreeze(value: () => IFreezable): Self = this.set("freeze", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: Double => js.Array[js.Array[Double]]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildGeometry(value: Double => ILinearRingGeometryAccess): Self = this.set("getChildGeometry", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = this.set("getClosest", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[js.Array[Double]]]): Self = this.set("getCoordinates", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFillRule(value: () => String): Self = this.set("getFillRule", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setIsFrozen(value: () => Boolean): Self = this.set("isFrozen", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: Double => ILinearRingGeometryAccess): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSetCoordinates(value: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess): Self = this.set("setCoordinates", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFillRule(value: String => IPolygonGeometryAccess): Self = this.set("setFillRule", js.Any.fromFunction1(value))
    @scala.inline
    def setSplice(value: (Double, Double) => js.Array[ILinearRingGeometryAccess]): Self = this.set("splice", js.Any.fromFunction2(value))
    @scala.inline
    def setUnfreeze(value: () => IFreezable): Self = this.set("unfreeze", js.Any.fromFunction0(value))
  }
  
}

