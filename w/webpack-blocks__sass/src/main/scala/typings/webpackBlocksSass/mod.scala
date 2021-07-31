package typings.webpackBlocksSass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
