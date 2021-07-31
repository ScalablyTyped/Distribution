package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolygonGeometryAccess
  extends StObject
     with IFreezable {
  
  def contains(position: js.Array[Double]): Boolean
  
  def get(index: Double): js.Array[js.Array[Double]]
  
  def getChildGeometry(index: Double): ILinearRingGeometryAccess
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]]
  
  def getFillRule(): String
  
  def getLength(): Double
  
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  
  def remove(index: Double): ILinearRingGeometryAccess
  
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess
  
  def setFillRule(fillRule: String): IPolygonGeometryAccess
  
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess]
}
object IPolygonGeometryAccess {
  
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    events: IEventManager[js.Object],
    freeze: () => IFreezable,
    get: Double => js.Array[js.Array[Double]],
    getChildGeometry: Double => ILinearRingGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[Double]]],
    getFillRule: () => String,
    getLength: () => Double,
    insert: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => ILinearRingGeometryAccess,
    set: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess,
    setFillRule: String => IPolygonGeometryAccess,
    splice: (Double, Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: () => IFreezable
  ): IPolygonGeometryAccess = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IPolygonGeometryAccess]
  }
  
  @scala.inline
  implicit class IPolygonGeometryAccessMutableBuilder[Self <: IPolygonGeometryAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Double => js.Array[js.Array[Double]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildGeometry(value: Double => ILinearRingGeometryAccess): Self = StObject.set(x, "getChildGeometry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillRule(value: () => String): Self = StObject.set(x, "getFillRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: Double => ILinearRingGeometryAccess): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCoordinates(value: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFillRule(value: String => IPolygonGeometryAccess): Self = StObject.set(x, "setFillRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplice(value: (Double, Double) => js.Array[ILinearRingGeometryAccess]): Self = StObject.set(x, "splice", js.Any.fromFunction2(value))
  }
}
