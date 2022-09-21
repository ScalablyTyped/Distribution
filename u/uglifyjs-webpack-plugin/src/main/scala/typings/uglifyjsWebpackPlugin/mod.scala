package typings.uglifyjsWebpackPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("uglifyjs-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: UglifyJsPluginOptions) = this()
  }
  
  trait ExtractCommentsOptions extends StObject {
    
    var banner: js.UndefOr[Boolean | String | (js.Function1[/* fileName */ String, String])] = js.undefined
    
    var condition: js.UndefOr[js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])] = js.undefined
    
    var filename: js.UndefOr[String | (js.Function1[/* originalFileName */ String, String])] = js.undefined
  }
  object ExtractCommentsOptions {
    
    inline def apply(): ExtractCommentsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractCommentsOptions]
    }
    
    extension [Self <: ExtractCommentsOptions](x: Self) {
      
      inline def setBanner(value: Boolean | String | (js.Function1[/* fileName */ String, String])): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerFunction1(value: /* fileName */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setCondition(value: js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setFilename(value: String | (js.Function1[/* originalFileName */ String, String])): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* originalFileName */ String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait UglifyJsOptions extends StObject {
    
    var compress: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var ecma: js.UndefOr[Double] = js.undefined
    
    var ie8: js.UndefOr[Boolean] = js.undefined
    
    var keep_classnames: js.UndefOr[Boolean] = js.undefined
    
    var keep_fnames: js.UndefOr[Boolean] = js.undefined
    
    var mangle: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var nameCache: js.UndefOr[js.Object] = js.undefined
    
    var output: js.UndefOr[js.Object] = js.undefined
    
    var parse: js.UndefOr[js.Object] = js.undefined
    
    var safari10: js.UndefOr[Boolean] = js.undefined
    
    var toplevel: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object UglifyJsOptions {
    
    inline def apply(): UglifyJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyJsOptions]
    }
    
    extension [Self <: UglifyJsOptions](x: Self) {
      
      inline def setCompress(value: Boolean | js.Object): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setEcma(value: Double): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      inline def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      inline def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
      inline def setKeep_classnames(value: Boolean): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
      
      inline def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
      
      inline def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      inline def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      inline def setMangle(value: Boolean | js.Object): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      inline def setNameCache(value: js.Object): Self = StObject.set(x, "nameCache", value.asInstanceOf[js.Any])
      
      inline def setNameCacheUndefined: Self = StObject.set(x, "nameCache", js.undefined)
      
      inline def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setParse(value: js.Object): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
      
      inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
      
      inline def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      inline def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  type UglifyJsPlugin = Plugin
  
  trait UglifyJsPluginOptions extends StObject {
    
    var cache: js.UndefOr[Boolean | String] = js.undefined
    
    var exclude: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var extractComments: js.UndefOr[
        Boolean | js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
      ] = js.undefined
    
    var include: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.undefined
    
    var warningsFilter: js.UndefOr[js.Function1[/* source */ String, Boolean]] = js.undefined
  }
  object UglifyJsPluginOptions {
    
    inline def apply(): UglifyJsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyJsPluginOptions]
    }
    
    extension [Self <: UglifyJsPluginOptions](x: Self) {
      
      inline def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setExclude(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: js.RegExp*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtractComments(
        value: Boolean | js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
      ): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      inline def setExtractCommentsFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      inline def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      inline def setInclude(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: js.RegExp*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTest(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: js.RegExp*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setUglifyOptions(value: UglifyJsOptions): Self = StObject.set(x, "uglifyOptions", value.asInstanceOf[js.Any])
      
      inline def setUglifyOptionsUndefined: Self = StObject.set(x, "uglifyOptions", js.undefined)
      
      inline def setWarningsFilter(value: /* source */ String => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction1(value))
      
      inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
}
