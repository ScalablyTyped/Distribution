package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineStringGeometryAccess
  extends StObject
     with IFreezable {
  
  def get(index: Double): js.Array[Double]
  
  def getChildGeometry(index: Double): IPointGeometryAccess
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[Double]]
  
  def getLength(): Double
  
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  
  def remove(index: Double): js.Array[Double]
  
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  
  def splice(index: Double, length: Double): js.Array[js.Array[Double]]
}
object ILineStringGeometryAccess {
  
  inline def apply(
    events: IEventManager[js.Object],
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
    setCoordinates: js.Array[js.Array[Double]] => ILineStringGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: () => IFreezable
  ): ILineStringGeometryAccess = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILineStringGeometryAccess] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Double => js.Array[Double]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetChildGeometry(value: Double => IPointGeometryAccess): Self = StObject.set(x, "getChildGeometry", js.Any.fromFunction1(value))
    
    inline def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setInsert(value: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setRemove(value: Double => js.Array[Double]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Double, js.Array[Double]) => ILineStringGeometryAccess): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetCoordinates(value: js.Array[js.Array[Double]] => ILineStringGeometryAccess): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSplice(value: (Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "splice", js.Any.fromFunction2(value))
  }
}
