package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedMap[K, V] extends StObject {
  
  def asArray(): js.Array[K]
  
  def asMap(): Map[K, Cell[V]]
  
  def asPairArray(): js.Array[js.Tuple2[K, Cell[V]]]
  
  def asSet(): Set[K]
  
  def createChild(): StackedMap[K, V]
  
  def delete(item: K): Unit
  
  def get(item: K): Cell[V]
  
  def has(item: K): Boolean
  
  var map: Map[K, InternalCell[V]]
  
  def set(item: K, value: V): Unit
  
  val size: Double
  
  var stack: js.Array[Map[K, InternalCell[V]]]
}
object StackedMap {
  
  inline def apply[K, V](
    asArray: () => js.Array[K],
    asMap: () => Map[K, Cell[V]],
    asPairArray: () => js.Array[js.Tuple2[K, Cell[V]]],
    asSet: () => Set[K],
    createChild: () => StackedMap[K, V],
    delete: K => Unit,
    get: K => Cell[V],
    has: K => Boolean,
    map: Map[K, InternalCell[V]],
    set: (K, V) => Unit,
    size: Double,
    stack: js.Array[Map[K, InternalCell[V]]]
  ): StackedMap[K, V] = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), asMap = js.Any.fromFunction0(asMap), asPairArray = js.Any.fromFunction0(asPairArray), asSet = js.Any.fromFunction0(asSet), createChild = js.Any.fromFunction0(createChild), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), map = map.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedMap[K, V]]
  }
  
  extension [Self <: StackedMap[?, ?], K, V](x: Self & (StackedMap[K, V])) {
    
    inline def setAsArray(value: () => js.Array[K]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    inline def setAsMap(value: () => Map[K, Cell[V]]): Self = StObject.set(x, "asMap", js.Any.fromFunction0(value))
    
    inline def setAsPairArray(value: () => js.Array[js.Tuple2[K, Cell[V]]]): Self = StObject.set(x, "asPairArray", js.Any.fromFunction0(value))
    
    inline def setAsSet(value: () => Set[K]): Self = StObject.set(x, "asSet", js.Any.fromFunction0(value))
    
    inline def setCreateChild(value: () => StackedMap[K, V]): Self = StObject.set(x, "createChild", js.Any.fromFunction0(value))
    
    inline def setDelete(value: K => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: K => Cell[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setMap(value: Map[K, InternalCell[V]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStack(value: js.Array[Map[K, InternalCell[V]]]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackVarargs(value: (Map[K, InternalCell[V]])*): Self = StObject.set(x, "stack", js.Array(value*))
  }
}
