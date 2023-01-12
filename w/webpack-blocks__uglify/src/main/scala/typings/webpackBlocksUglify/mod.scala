package typings.webpackBlocksUglify

import typings.uglifyJs.mod.MinifyOptions
import typings.webpackBlocksUglify.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: Options): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@webpack-blocks/uglify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ExtractCommentsFunction = js.Function2[/* node */ Any, /* comment */ Any, Boolean | ExtractCommentsObject]
  
  trait ExtractCommentsObject extends StObject {
    
    var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.undefined
    
    var condition: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentsFunction] = js.undefined
    
    var filename: js.UndefOr[js.RegExp | FileNameFunction] = js.undefined
  }
  object ExtractCommentsObject {
    
    inline def apply(): ExtractCommentsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractCommentsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractCommentsObject] (val x: Self) extends AnyVal {
      
      inline def setBanner(value: Boolean | String | FileNameFunction): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerFunction1(value: /* file */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setCondition(value: Boolean | String | js.RegExp | ExtractCommentsFunction): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionFunction2(value: (/* node */ Any, /* comment */ Any) => Boolean | ExtractCommentsObject): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setFilename(value: js.RegExp | FileNameFunction): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* file */ String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  type FileNameFunction = js.Function1[/* file */ String, String]
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[String | Boolean] = js.undefined
    
    var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ Any, /* file */ Any, js.Object]] = js.undefined
    
    var chunkFilter: js.UndefOr[js.Function1[/* chunk */ Any, Boolean]] = js.undefined
    
    var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var extractComments: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentsFunction] = js.undefined
    
    var include: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var minify: js.UndefOr[js.Function2[/* file */ Any, /* sourceMap */ Any, Code]] = js.undefined
    
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var uglifyOptions: js.UndefOr[MinifyOptions] = js.undefined
    
    var warningsFilter: js.UndefOr[js.Function2[/* warning */ Any, /* source */ Any, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCache(value: String | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKeys(value: (/* defaultCacheKeys */ Any, /* file */ Any) => js.Object): Self = StObject.set(x, "cacheKeys", js.Any.fromFunction2(value))
      
      inline def setCacheKeysUndefined: Self = StObject.set(x, "cacheKeys", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChunkFilter(value: /* chunk */ Any => Boolean): Self = StObject.set(x, "chunkFilter", js.Any.fromFunction1(value))
      
      inline def setChunkFilterUndefined: Self = StObject.set(x, "chunkFilter", js.undefined)
      
      inline def setExclude(value: TestType | js.Array[TestType]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: TestType*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtractComments(value: Boolean | String | js.RegExp | ExtractCommentsFunction): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      inline def setExtractCommentsFunction2(value: (/* node */ Any, /* comment */ Any) => Boolean | ExtractCommentsObject): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      inline def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      inline def setInclude(value: TestType | js.Array[TestType]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: TestType*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMinify(value: (/* file */ Any, /* sourceMap */ Any) => Code): Self = StObject.set(x, "minify", js.Any.fromFunction2(value))
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTest(value: TestType | js.Array[TestType]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: TestType*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setUglifyOptions(value: MinifyOptions): Self = StObject.set(x, "uglifyOptions", value.asInstanceOf[js.Any])
      
      inline def setUglifyOptionsUndefined: Self = StObject.set(x, "uglifyOptions", js.undefined)
      
      inline def setWarningsFilter(value: (/* warning */ Any, /* source */ Any) => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction2(value))
      
      inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
  
  type TestType = String | js.RegExp
}
