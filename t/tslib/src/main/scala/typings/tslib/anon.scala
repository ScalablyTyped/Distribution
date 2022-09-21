package typings.tslib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def has(o: Any): Boolean
  }
  object `0` {
    
    inline def apply(has: Any => Boolean): `0` = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait Default[T] extends StObject {
    
    var default: T
  }
  object Default {
    
    inline def apply[T](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    extension [Self <: Default[?], T](x: Self & Default[T]) {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait Get[T /* <: js.Object */, V] extends StObject {
    
    def get(o: T): js.UndefOr[V]
    
    def has(o: T): Boolean
  }
  object Get {
    
    inline def apply[T /* <: js.Object */, V](get: T => js.UndefOr[V], has: T => Boolean): Get[T, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Get[T, V]]
    }
    
    extension [Self <: Get[?, ?], T /* <: js.Object */, V](x: Self & (Get[T, V])) {
      
      inline def setGet(value: T => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait Has[T /* <: js.Object */] extends StObject {
    
    def has(o: T): Boolean
  }
  object Has {
    
    inline def apply[T /* <: js.Object */](has: T => Boolean): Has[T] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Has[T]]
    }
    
    extension [Self <: Has[?], T /* <: js.Object */](x: Self & Has[T]) {
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait Set[T /* <: js.Object */, V] extends StObject {
    
    def has(o: T): Boolean
    
    def set(o: T, value: V): Any
  }
  object Set {
    
    inline def apply[T /* <: js.Object */, V](has: T => Boolean, set: (T, V) => Any): Set[T, V] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Set[T, V]]
    }
    
    extension [Self <: Set[?, ?], T /* <: js.Object */, V](x: Self & (Set[T, V])) {
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (T, V) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Value[V] extends StObject {
    
    var value: V
  }
  object Value {
    
    inline def apply[V](value: V): Value[V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[V]]
    }
    
    extension [Self <: Value[?], V](x: Self & Value[V]) {
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
