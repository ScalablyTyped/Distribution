package typings.styledJsx

import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait StyleHTMLAttributes[T] extends HTMLAttributes[T] {
    
    var global: js.UndefOr[Boolean] = js.native
    
    var jsx: js.UndefOr[Boolean] = js.native
  }
  object StyleHTMLAttributes {
    
    @scala.inline
    def apply[T](): StyleHTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleHTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class StyleHTMLAttributesMutableBuilder[Self <: StyleHTMLAttributes[_], T] (val x: Self with StyleHTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    }
  }
}
