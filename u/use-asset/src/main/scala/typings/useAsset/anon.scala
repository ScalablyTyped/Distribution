package typings.useAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear[T] extends StObject {
    
    def clear(args: js.Any*): Unit
    
    def peek(args: js.Any*): Unit | T
    
    def preload(args: js.Any*): Unit
    
    /**
      * @throws Suspense Promise if asset is not yet ready
      * @throws Error if the promise rejected for some reason
      */
    def read(args: js.Any*): T
  }
  object Clear {
    
    @scala.inline
    def apply[T](
      clear: /* repeated */ js.Any => Unit,
      peek: /* repeated */ js.Any => Unit | T,
      preload: /* repeated */ js.Any => Unit,
      read: /* repeated */ js.Any => T
    ): Clear[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), peek = js.Any.fromFunction1(peek), preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Clear[T]]
    }
    
    @scala.inline
    implicit class ClearMutableBuilder[Self <: Clear[?], T] (val x: Self & Clear[T]) extends AnyVal {
      
      @scala.inline
      def setClear(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeek(value: /* repeated */ js.Any => Unit | T): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreload(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: /* repeated */ js.Any => T): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
}
