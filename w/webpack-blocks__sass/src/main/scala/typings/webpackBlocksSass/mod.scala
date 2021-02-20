package typings.webpackBlocksSass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/sass", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  @JSImport("@webpack-blocks/sass", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var includePaths: js.UndefOr[js.Array[String]] = js.native
    
    var indentedSyntax: js.UndefOr[Boolean] = js.native
    
    var outputStyle: js.UndefOr[String] = js.native
    
    var sourceMap: js.UndefOr[Boolean] = js.native
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
      def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      @scala.inline
      def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      @scala.inline
      def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
      
      @scala.inline
      def setOutputStyle(value: String): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
