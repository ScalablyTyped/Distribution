package typings.teppeisMultimaps

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultimapMod {
  
  /* note: abstract class */ @JSImport("@teppeis/multimaps/dist/src/multimap", "Multimap")
  @js.native
  open class Multimap[K, V, I /* <: js.Iterable[V] */] protected ()
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    def this(operator: CollectionOperator[V, I]) = this()
    def this(operator: CollectionOperator[V, I], iterable: js.Iterable[js.Tuple2[K, V]]) = this()
    
    def asMap(): Map[K, I] = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def deleteEntry(key: K, value: V): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach[T](
      callback: js.ThisFunction3[/* this */ T | this.type, /* alue */ V, /* key */ K, /* map */ this.type, Unit]
    ): Unit = js.native
    def forEach[T](
      callback: js.ThisFunction3[/* this */ T | this.type, /* alue */ V, /* key */ K, /* map */ this.type, Unit],
      thisArg: T
    ): Unit = js.native
    
    var get: Any = js.native
    def get(key: K): I = js.native
    
    def has(key: K): Boolean = js.native
    
    def hasEntry(key: K, value: V): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Multimap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    /* private */ var map: Any = js.native
    
    /* private */ var operator: Any = js.native
    
    def put(key: K, value: V): Boolean = js.native
    
    def putAll(key: K, values: I): Boolean = js.native
    def putAll(multimap: Multimap[K, V, I]): Boolean = js.native
    
    def size: Double = js.native
    
    /* private */ var size_ : Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    def values(): IterableIterator[V] = js.native
  }
  
  trait CollectionOperator[V, I] extends StObject {
    
    def add(value: V, collection: I): Boolean
    
    def clone(collection: I): I
    
    def create(): I
    
    def delete(value: V, collection: I): Boolean
    
    def has(value: V, collection: I): Boolean
    
    def size(collection: I): Double
  }
  object CollectionOperator {
    
    inline def apply[V, I](
      add: (V, I) => Boolean,
      clone_ : I => I,
      create: () => I,
      delete: (V, I) => Boolean,
      has: (V, I) => Boolean,
      size: I => Double
    ): CollectionOperator[V, I] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), create = js.Any.fromFunction0(create), delete = js.Any.fromFunction2(delete), has = js.Any.fromFunction2(has), size = js.Any.fromFunction1(size))
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[CollectionOperator[V, I]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionOperator[?, ?], V, I] (val x: Self & (CollectionOperator[V, I])) extends AnyVal {
      
      inline def setAdd(value: (V, I) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setClone_(value: I => I): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setCreate(value: () => I): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setDelete(value: (V, I) => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setHas(value: (V, I) => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
      
      inline def setSize(value: I => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    }
  }
}
