package typings.webpackBlocksSass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  inline def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/sass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var indentedSyntax: js.UndefOr[Boolean] = js.undefined
    
    var outputStyle: js.UndefOr[String] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      inline def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
      
      inline def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
      
      inline def setOutputStyle(value: String): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
      
      inline def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
