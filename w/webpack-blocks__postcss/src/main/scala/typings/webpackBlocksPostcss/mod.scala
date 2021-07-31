package typings.webpackBlocksPostcss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FunctionType = js.Function0[String]
  
  trait Options extends StObject {
    
    var parser: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var stringifier: js.UndefOr[String] = js.undefined
    
    var syntax: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setStringifier(value: String): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    var parser: js.UndefOr[String | FunctionType] = js.undefined
    
    var stringifier: js.UndefOr[String | FunctionType] = js.undefined
    
    var syntax: js.UndefOr[String | FunctionType] = js.undefined
  }
  object Plugin {
    
    @scala.inline
    def apply(): Plugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(value: String | FunctionType): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserFunction0(value: () => String): Self = StObject.set(x, "parser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setStringifier(value: String | FunctionType): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifierFunction0(value: () => String): Self = StObject.set(x, "stringifier", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setSyntax(value: String | FunctionType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxFunction0(value: () => String): Self = StObject.set(x, "syntax", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
}
