package typings.useDebounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EqualityFn[T] extends StObject {
    
    var equalityFn: js.UndefOr[js.Function2[/* left */ T, /* right */ T, Boolean]] = js.undefined
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var maxWait: js.UndefOr[Double] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object EqualityFn {
    
    @scala.inline
    def apply[T](): EqualityFn[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EqualityFn[T]]
    }
    
    @scala.inline
    implicit class EqualityFnMutableBuilder[Self <: EqualityFn[?], T] (val x: Self & EqualityFn[T]) extends AnyVal {
      
      @scala.inline
      def setEqualityFn(value: (/* left */ T, /* right */ T) => Boolean): Self = StObject.set(x, "equalityFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualityFnUndefined: Self = StObject.set(x, "equalityFn", js.undefined)
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
