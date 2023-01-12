package typings.textareaCaret

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(element: HTMLElement, position: Double): Caret = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Caret]
  inline def apply(element: HTMLElement, position: Double, options: Options): Caret = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], position.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Caret]
  
  @JSImport("textarea-caret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Caret extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
  }
  object Caret {
    
    inline def apply(height: Double, left: Double, top: Double): Caret = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Caret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Caret] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
}
