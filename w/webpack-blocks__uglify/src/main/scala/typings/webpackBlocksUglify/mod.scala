package typings.webpackBlocksUglify

import typings.std.RegExp
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackBlocksUglify.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/uglify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ExtractCommentsFunction = js.Function2[/* node */ js.Any, /* comment */ js.Any, Boolean | ExtractCommentsObject]
  
  trait ExtractCommentsObject extends StObject {
    
    var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.undefined
    
    var condition: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.undefined
    
    var filename: js.UndefOr[RegExp | FileNameFunction] = js.undefined
  }
  object ExtractCommentsObject {
    
    @scala.inline
    def apply(): ExtractCommentsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractCommentsObject]
    }
    
    @scala.inline
    implicit class ExtractCommentsObjectMutableBuilder[Self <: ExtractCommentsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBanner(value: Boolean | String | FileNameFunction): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannerFunction1(value: /* file */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      @scala.inline
      def setCondition(value: Boolean | String | RegExp | ExtractCommentsFunction): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setFilename(value: RegExp | FileNameFunction): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameFunction1(value: /* file */ String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  type FileNameFunction = js.Function1[/* file */ String, String]
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[String | Boolean] = js.undefined
    
    var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
    
    var chunkFilter: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.undefined
    
    var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.undefined
    
    var include: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, Code]] = js.undefined
    
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
    
    var uglifyOptions: js.UndefOr[MinifyOptions] = js.undefined
    
    var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, Boolean]] = js.undefined
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
      def setCache(value: String | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeys(value: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object): Self = StObject.set(x, "cacheKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheKeysUndefined: Self = StObject.set(x, "cacheKeys", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setChunkFilter(value: /* chunk */ js.Any => Boolean): Self = StObject.set(x, "chunkFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChunkFilterUndefined: Self = StObject.set(x, "chunkFilter", js.undefined)
      
      @scala.inline
      def setExclude(value: TestType | js.Array[TestType]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: TestType*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExtractComments(value: Boolean | String | RegExp | ExtractCommentsFunction): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractCommentsFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      @scala.inline
      def setInclude(value: TestType | js.Array[TestType]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: TestType*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMinify(value: (/* file */ js.Any, /* sourceMap */ js.Any) => Code): Self = StObject.set(x, "minify", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setTest(value: TestType | js.Array[TestType]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: TestType*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      @scala.inline
      def setUglifyOptions(value: MinifyOptions): Self = StObject.set(x, "uglifyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglifyOptionsUndefined: Self = StObject.set(x, "uglifyOptions", js.undefined)
      
      @scala.inline
      def setWarningsFilter(value: (/* warning */ js.Any, /* source */ js.Any) => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
  
  type TestType = String | RegExp
}
