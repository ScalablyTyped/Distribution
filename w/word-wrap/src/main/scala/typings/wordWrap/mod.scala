package typings.wordWrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word-wrap", JSImport.Namespace)
  @js.native
  def apply(str: String): String = js.native
  @JSImport("word-wrap", JSImport.Namespace)
  @js.native
  def apply(str: String, options: IOptions): String = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    /**
      * Break a word between any two letters when the word is longer
      * than the specified width.
      * @default false
      */
    var cut: js.UndefOr[Boolean] = js.native
    
    /**
      * An escape function to run on each line after splitting them.
      * @default (str: string) => string;
      */
    var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
    
    /**
      * The string to use at the beginning of each line.
      * @default ´  ´ (two spaces)
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * The string to use at the end of each line.
      * @default ´\n´
      */
    var newline: js.UndefOr[String] = js.native
    
    /**
      * Trim trailing whitespace from the returned string.
      * This option is included since .trim() would also strip
      * the leading indentation from the first line.
      * @default true
      */
    var trim: js.UndefOr[Boolean] = js.native
    
    /**
      * The width of the text before wrapping to a new line.
      * @default ´50´
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCut(value: Boolean): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setEscape(value: /* str */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
