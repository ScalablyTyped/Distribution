package typings.twilioSync

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  /**
    * @property length
    */
  @JSImport("twilio-sync/lib/utils/tree", "TreeMap")
  @js.native
  class TreeMap[K, V] ()
    extends StObject
       with TreeMapInterface[K, V] {
    def this(less: Less[K]) = this()
    def this(less: Unit, equal: Equal[K]) = this()
    def this(less: Less[K], equal: Equal[K]) = this()
    
    def clear(): Unit = js.native
    
    var count: js.Any = js.native
    
    def delete(key: K): Unit = js.native
    
    /* CompleteClass */
    override def get(key: K): V = js.native
    
    def getIterator(): IterableIterator[js.Tuple2[K, V]] = js.native
    def getIterator(key: K): IterableIterator[js.Tuple2[K, V]] = js.native
    
    var getNode: js.Any = js.native
    
    def getReverseIterator(): IterableIterator[js.Tuple2[K, V]] = js.native
    def getReverseIterator(key: K): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def insert(key: K, value: V): Unit = js.native
    
    var isEqual: js.Any = js.native
    
    var isLessThan: js.Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_TreeMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    var rebalance: js.Any = js.native
    
    var root: js.Any = js.native
    
    var rotateLeft: js.Any = js.native
    
    var rotateRight: js.Any = js.native
    
    /* CompleteClass */
    override def set(key: K, value: V): Unit = js.native
    
    def size: Double = js.native
  }
  
  type Equal[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
  
  type Less[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
  
  trait Map[K, V] extends StObject {
    
    def get(key: K): V
    
    def set(key: K, value: V): Unit
  }
  object Map {
    
    @scala.inline
    def apply[K, V](get: K => V, set: (K, V) => Unit): Map[K, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Map[K, V]]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map[?, ?], K, V] (val x: Self & (Map[K, V])) extends AnyVal {
      
      @scala.inline
      def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TreeMapInterface[K, V]
    extends StObject
       with Map[K, V]
       with Iterable[js.Tuple2[K, V]]
}
