package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("xmlcreate/lib/options", "StringOptions")
  @js.native
  class StringOptions protected () extends IStringOptions {
    def this(options: IStringOptions) = this()
    
    @JSName("doubleQuotes")
    var doubleQuotes_StringOptions: Boolean = js.native
    
    @JSName("indent")
    var indent_StringOptions: String = js.native
    
    @JSName("newline")
    var newline_StringOptions: String = js.native
    
    @JSName("pretty")
    var pretty_StringOptions: Boolean = js.native
  }
  
  @js.native
  trait IStringOptions extends StObject {
    
    /**
      * Whether double quotes or single quotes should be used in XML attributes.
      * By default, single quotes are used.
      */
    var doubleQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * The indent string used for pretty-printing. The default indent string is
      * four spaces.
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * The newline string used for pretty-printing. The default newline string
      * is "\n".
      */
    var newline: js.UndefOr[String] = js.native
    
    /**
      * Whether pretty-printing is enabled. By default, pretty-printing is
      * enabled.
      */
    var pretty: js.UndefOr[Boolean] = js.native
  }
  object IStringOptions {
    
    @scala.inline
    def apply(): IStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStringOptions]
    }
    
    @scala.inline
    implicit class IStringOptionsMutableBuilder[Self <: IStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoubleQuotes(value: Boolean): Self = StObject.set(x, "doubleQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleQuotesUndefined: Self = StObject.set(x, "doubleQuotes", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
}
