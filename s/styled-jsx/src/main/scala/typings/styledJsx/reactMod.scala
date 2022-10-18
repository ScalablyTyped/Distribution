package typings.styledJsx

import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactMod {
  
  trait StyleHTMLAttributes[T]
    extends StObject
       with HTMLAttributes[T] {
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var jsx: js.UndefOr[Boolean] = js.undefined
  }
  object StyleHTMLAttributes {
    
    inline def apply[T](): StyleHTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleHTMLAttributes[T]]
    }
    
    extension [Self <: StyleHTMLAttributes[?], T](x: Self & StyleHTMLAttributes[T]) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    }
  }
}
