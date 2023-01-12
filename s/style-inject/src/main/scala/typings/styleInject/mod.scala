package typings.styleInject

import typings.styleInject.styleInjectStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(css: String): Unit = ^.asInstanceOf[js.Dynamic].apply(css.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(css: String, options: StyleInjectOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("style-inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StyleInjectOptions extends StObject {
    
    var insertAt: js.UndefOr[top] = js.undefined
  }
  object StyleInjectOptions {
    
    inline def apply(): StyleInjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleInjectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleInjectOptions] (val x: Self) extends AnyVal {
      
      inline def setInsertAt(value: top): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
      
      inline def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    }
  }
}
