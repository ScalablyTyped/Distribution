package typings.webpackBlocksUglify

import typings.std.RegExp
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackBlocksUglify.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/uglify", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  @JSImport("@webpack-blocks/uglify", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Any = js.native
  
  type ExtractCommentsFunction = js.Function2[/* node */ js.Any, /* comment */ js.Any, Boolean | ExtractCommentsObject]
  
  @js.native
  trait ExtractCommentsObject extends StObject {
    
    var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.native
    
    var condition: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.native
    
    var filename: js.UndefOr[RegExp | FileNameFunction] = js.native
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
  
  @js.native
  trait Options extends StObject {
    
    var cache: js.UndefOr[String | Boolean] = js.native
    
    var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.native
    
    var chunkFilter: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.native
    
    var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.native
    
    var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.native
    
    var include: js.UndefOr[TestType | js.Array[TestType]] = js.native
    
    var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, Code]] = js.native
    
    var parallel: js.UndefOr[Boolean | Double] = js.native
    
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    var test: js.UndefOr[TestType | js.Array[TestType]] = js.native
    
    var uglifyOptions: js.UndefOr[MinifyOptions] = js.native
    
    var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, Boolean]] = js.native
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
