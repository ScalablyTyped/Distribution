package typings.uglifyjsWebpackPlugin

import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uglifyjs-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: UglifyJsPluginOptions) = this()
  }
  
  @js.native
  trait ExtractCommentsOptions extends StObject {
    
    var banner: js.UndefOr[Boolean | String | (js.Function1[/* fileName */ String, String])] = js.native
    
    var condition: js.UndefOr[RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])] = js.native
    
    var filename: js.UndefOr[String | (js.Function1[/* originalFileName */ String, String])] = js.native
  }
  object ExtractCommentsOptions {
    
    @scala.inline
    def apply(): ExtractCommentsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractCommentsOptions]
    }
    
    @scala.inline
    implicit class ExtractCommentsOptionsMutableBuilder[Self <: ExtractCommentsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBanner(value: Boolean | String | (js.Function1[/* fileName */ String, String])): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannerFunction1(value: /* fileName */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      @scala.inline
      def setCondition(value: RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setFilename(value: String | (js.Function1[/* originalFileName */ String, String])): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameFunction1(value: /* originalFileName */ String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  @js.native
  trait UglifyJsOptions extends StObject {
    
    var compress: js.UndefOr[Boolean | js.Object] = js.native
    
    var ecma: js.UndefOr[Double] = js.native
    
    var ie8: js.UndefOr[Boolean] = js.native
    
    var keep_classnames: js.UndefOr[Boolean] = js.native
    
    var keep_fnames: js.UndefOr[Boolean] = js.native
    
    var mangle: js.UndefOr[Boolean | js.Object] = js.native
    
    var nameCache: js.UndefOr[js.Object] = js.native
    
    var output: js.UndefOr[js.Object] = js.native
    
    var parse: js.UndefOr[js.Object] = js.native
    
    var safari10: js.UndefOr[Boolean] = js.native
    
    var toplevel: js.UndefOr[Boolean] = js.native
    
    var warnings: js.UndefOr[Boolean] = js.native
  }
  object UglifyJsOptions {
    
    @scala.inline
    def apply(): UglifyJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyJsOptions]
    }
    
    @scala.inline
    implicit class UglifyJsOptionsMutableBuilder[Self <: UglifyJsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean | js.Object): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setEcma(value: Double): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      @scala.inline
      def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
      @scala.inline
      def setKeep_classnames(value: Boolean): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setMangle(value: Boolean | js.Object): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      @scala.inline
      def setNameCache(value: js.Object): Self = StObject.set(x, "nameCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameCacheUndefined: Self = StObject.set(x, "nameCache", js.undefined)
      
      @scala.inline
      def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setParse(value: js.Object): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  type UglifyJsPlugin = Plugin
  
  @js.native
  trait UglifyJsPluginOptions extends StObject {
    
    var cache: js.UndefOr[Boolean | String] = js.native
    
    var exclude: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var extractComments: js.UndefOr[
        Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
      ] = js.native
    
    var include: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var parallel: js.UndefOr[Boolean | Double] = js.native
    
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    var test: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.native
    
    var warningsFilter: js.UndefOr[js.Function1[/* source */ String, Boolean]] = js.native
  }
  object UglifyJsPluginOptions {
    
    @scala.inline
    def apply(): UglifyJsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyJsPluginOptions]
    }
    
    @scala.inline
    implicit class UglifyJsPluginOptionsMutableBuilder[Self <: UglifyJsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setExclude(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: RegExp*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExtractComments(
        value: Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
      ): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractCommentsFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      @scala.inline
      def setInclude(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: RegExp*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setTest(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: RegExp*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      @scala.inline
      def setUglifyOptions(value: UglifyJsOptions): Self = StObject.set(x, "uglifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglifyOptionsUndefined: Self = StObject.set(x, "uglifyOptions", js.undefined)
      
      @scala.inline
      def setWarningsFilter(value: /* source */ String => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
}
