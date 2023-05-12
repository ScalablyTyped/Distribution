package typings.wrapAnsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wrap-ansi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String, columns: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(string: String, columns: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	By default the wrap is soft, meaning long words may extend past the column width. Setting this to `true` will make it hard wrap at the column width.
    	@default false
    	*/
    val hard: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Whitespace on all lines is removed by default. Set this option to `false` if you don't want to trim.
    	@default true
    	*/
    val trim: js.UndefOr[Boolean] = js.undefined
    
    /**
    	By default, an attempt is made to split words at spaces, ensuring that they don't extend past the configured columns. If wordWrap is `false`, each column will instead be completely filled splitting words as necessary.
    	@default true
    	*/
    val wordWrap: js.UndefOr[Boolean] = js.undefined
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
