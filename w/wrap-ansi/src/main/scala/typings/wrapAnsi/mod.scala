package typings.wrapAnsi

import typings.wrapAnsi.mod.wrapAnsi.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(input: String, columns: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(input: String, columns: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("wrap-ansi", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object wrapAnsi {
    
    trait Options extends StObject {
      
      /** @default false */
      var hard: js.UndefOr[Boolean] = js.undefined
      
      /** @default true */
      var trim: js.UndefOr[Boolean] = js.undefined
      
      /** @default true */
      var wordWrap: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
        
        inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
        
        inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
        
        inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
        
        inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      }
    }
  }
}
