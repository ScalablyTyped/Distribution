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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  trait Async extends StObject {
    
    var async: Boolean
    
    var dispose: js.UndefOr[js.Function] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Async {
    
    inline def apply(async: Boolean): Async = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: js.Function): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default[?], T] (val x: Self & Default[T]) extends AnyVal {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
    
    var hasError: Boolean
    
    var stack: js.Array[Async]
  }
  object Error {
    
    inline def apply(error: Any, hasError: Boolean, stack: js.Array[Async]): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[Async]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: Async*): Self = StObject.set(x, "stack", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get[?, ?], T /* <: js.Object */, V] (val x: Self & (Get[T, V])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Has[?], T /* <: js.Object */] (val x: Self & Has[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Set[?, ?], T /* <: js.Object */, V] (val x: Self & (Set[T, V])) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], V] (val x: Self & Value[V]) extends AnyVal {
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
