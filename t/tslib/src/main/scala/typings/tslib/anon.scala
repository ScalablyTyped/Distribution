package typings.tslib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default[T] extends StObject {
    
    var default: T = js.native
  }
  object Default {
    
    @scala.inline
    def apply[T](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[_], T] (val x: Self with Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Get[T /* <: js.Object */, V] extends StObject {
    
    def get(o: T): js.UndefOr[V] = js.native
    
    def has(o: T): Boolean = js.native
  }
  object Get {
    
    @scala.inline
    def apply[T /* <: js.Object */, V](get: T => js.UndefOr[V], has: T => Boolean): Get[T, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[Get[T, V]]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get[_, _], T /* <: js.Object */, V] (val x: Self with (Get[T, V])) extends AnyVal {
      
      @scala.inline
      def setGet(value: T => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Has[T /* <: js.Object */, V] extends StObject {
    
    def has(o: T): Boolean = js.native
    
    def set(o: T, value: V): js.Any = js.native
  }
  object Has {
    
    @scala.inline
    def apply[T /* <: js.Object */, V](has: T => Boolean, set: (T, V) => js.Any): Has[T, V] = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Has[T, V]]
    }
    
    @scala.inline
    implicit class HasMutableBuilder[Self <: Has[_, _], T /* <: js.Object */, V] (val x: Self with (Has[T, V])) extends AnyVal {
      
      @scala.inline
      def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (T, V) => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
