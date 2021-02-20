package typings.ungapWeakmap

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ungap/weakmap", JSImport.Namespace)
  @js.native
  class ^[K /* <: js.Object */, V] () extends WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  trait WeakMap[K /* <: js.Object */, V] extends StObject {
    
    def delete(key: K): Boolean = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def set(key: K, value: V): this.type = js.native
  }
  object WeakMap {
    
    @scala.inline
    def apply[K /* <: js.Object */, V](delete: K => Boolean, get: K => js.UndefOr[V], has: K => Boolean, set: (K, V) => WeakMap[K, V]): WeakMap[K, V] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[WeakMap[K, V]]
    }
    
    @scala.inline
    implicit class WeakMapMutableBuilder[Self <: WeakMap[_, _], K /* <: js.Object */, V] (val x: Self with (WeakMap[K, V])) extends AnyVal {
      
      @scala.inline
      def setDelete(value: K => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (K, V) => WeakMap[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
