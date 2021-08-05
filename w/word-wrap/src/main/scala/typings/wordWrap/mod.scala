package typings.wordWrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, options: IOptions): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("word-wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IOptions extends StObject {
    
    /**
      * Break a word between any two letters when the word is longer
      * than the specified width.
      * @default false
      */
    var cut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An escape function to run on each line after splitting them.
      * @default (str: string) => string;
      */
    var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
    
    /**
      * The string to use at the beginning of each line.
      * @default ´  ´ (two spaces)
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * The string to use at the end of each line.
      * @default ´\n´
      */
    var newline: js.UndefOr[String] = js.undefined
    
    /**
      * Trim trailing whitespace from the returned string.
      * This option is included since .trim() would also strip
      * the leading indentation from the first line.
      * @default true
      */
    var trim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width of the text before wrapping to a new line.
      * @default ´50´
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setCut(value: Boolean): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      inline def setEscape(value: /* str */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
