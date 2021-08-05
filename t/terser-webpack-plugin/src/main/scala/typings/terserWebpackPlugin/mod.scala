package typings.terserWebpackPlugin

import typings.std.RegExp
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terser-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with TerserPlugin {
    def this(opts: TerserPluginOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  type ExtractCommentFn = js.Function2[/* astNode */ js.Any, /* comment */ js.Any, Boolean | js.Object]
  
  trait ExtractCommentOptions extends StObject {
    
    var banner: js.UndefOr[Boolean | String | FormatFn] = js.undefined
    
    var condition: String | RegExp | ExtractCommentFn
    
    var filename: js.UndefOr[String | FilenameFn] = js.undefined
  }
  object ExtractCommentOptions {
    
    inline def apply(condition: String | RegExp | ExtractCommentFn): ExtractCommentOptions = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractCommentOptions]
    }
    
    extension [Self <: ExtractCommentOptions](x: Self) {
      
      inline def setBanner(value: Boolean | String | FormatFn): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerFunction1(value: /* input */ String => String): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setCondition(value: String | RegExp | ExtractCommentFn): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionFunction2(value: (/* astNode */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setFilename(value: String | FilenameFn): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* fileData */ FileData => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait FileData extends StObject {
    
    val basename: String
    
    val filename: String
    
    val hash: String
    
    val query: String
  }
  object FileData {
    
    inline def apply(basename: String, filename: String, hash: String, query: String): FileData = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileData]
    }
    
    extension [Self <: FileData](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type FilenameFn = js.Function1[/* fileData */ FileData, String]
  
  type FormatFn = js.Function1[/* input */ String, String]
  
  trait MinifyResult extends StObject {
    
    var code: js.Any
    
    var extractedComments: js.Any
    
    var map: js.Any
  }
  object MinifyResult {
    
    inline def apply(code: js.Any, extractedComments: js.Any, map: js.Any): MinifyResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], extractedComments = extractedComments.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinifyResult]
    }
    
    extension [Self <: MinifyResult](x: Self) {
      
      inline def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setExtractedComments(value: js.Any): Self = StObject.set(x, "extractedComments", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ trait TerserPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object TerserPlugin {
    
    inline def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): TerserPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[TerserPlugin]
    }
    
    extension [Self <: TerserPlugin](x: Self) {
      
      inline def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait TerserPluginOptions extends StObject {
    
    /**
      * Files to exclude.
      * @default undefined
      */
    var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Whether comments shall be extracted to a separate file, (see details).
      * By default extract only comments using /^\**!|@preserve|@license|@cc_on/i regexp condition and remove remaining comments.
      * If the original file is named foo.js, then the comments will be stored to foo.js.LICENSE.txt.
      * The terserOptions.output.comments option specifies whether the comment will be preserved,
      * i.e. it is possible to preserve some comments (e.g. annotations) while extracting others or even preserving comments that have been extracted
      * @default true
      */
    var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions] = js.undefined
    
    /**
      * Files to include.
      * @default undefined
      */
    var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Allows you to override default minify function.
      * By default plugin uses terser package. Useful for using and testing unpublished versions or forks
      * @default undefined
      */
    var minify: js.UndefOr[
        js.Function3[
          /* file */ js.Any, 
          /* sourceMap */ js.Any, 
          /* minimizerOptions */ js.UndefOr[MinifyOptions], 
          MinifyResult
        ]
      ] = js.undefined
    
    /**
      * Enable/disable multi-process parallel running.
      * Use multi-process parallel running to improve the build speed. Default number of concurrent runs: os.cpus().length - 1.
      * @default true
      */
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Terser minify {@link https://github.com/terser/terser#minify-options|options}.
      */
    var terserOptions: js.UndefOr[MinifyOptions] = js.undefined
    
    /**
      * Test to match files against.
      * @default /\.m?js(\?.*)?$/i
      */
    var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  }
  object TerserPluginOptions {
    
    inline def apply(): TerserPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerserPluginOptions]
    }
    
    extension [Self <: TerserPluginOptions](x: Self) {
      
      inline def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setExtractComments(value: Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions): Self = StObject.set(x, "extractComments", value.asInstanceOf[js.Any])
      
      inline def setExtractCommentsFunction2(value: (/* astNode */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = StObject.set(x, "extractComments", js.Any.fromFunction2(value))
      
      inline def setExtractCommentsUndefined: Self = StObject.set(x, "extractComments", js.undefined)
      
      inline def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setMinify(
        value: (/* file */ js.Any, /* sourceMap */ js.Any, /* minimizerOptions */ js.UndefOr[MinifyOptions]) => MinifyResult
      ): Self = StObject.set(x, "minify", js.Any.fromFunction3(value))
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setTerserOptions(value: MinifyOptions): Self = StObject.set(x, "terserOptions", value.asInstanceOf[js.Any])
      
      inline def setTerserOptionsUndefined: Self = StObject.set(x, "terserOptions", js.undefined)
      
      inline def setTest(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
