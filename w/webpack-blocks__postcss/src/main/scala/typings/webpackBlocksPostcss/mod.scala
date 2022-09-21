package typings.webpackBlocksPostcss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: Options): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@webpack-blocks/postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FunctionType = js.Function0[String]
  
  trait Options extends StObject {
    
    var parser: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var stringifier: js.UndefOr[String] = js.undefined
    
    var syntax: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setStringifier(value: String): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    var parser: js.UndefOr[String | FunctionType] = js.undefined
    
    var stringifier: js.UndefOr[String | FunctionType] = js.undefined
    
    var syntax: js.UndefOr[String | FunctionType] = js.undefined
  }
  object Plugin {
    
    inline def apply(): Plugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setParser(value: String | FunctionType): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction0(value: () => String): Self = StObject.set(x, "parser", js.Any.fromFunction0(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setStringifier(value: String | FunctionType): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction0(value: () => String): Self = StObject.set(x, "stringifier", js.Any.fromFunction0(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | FunctionType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxFunction0(value: () => String): Self = StObject.set(x, "syntax", js.Any.fromFunction0(value))
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
}
