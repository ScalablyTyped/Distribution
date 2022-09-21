package typings.terserWebpackPlugin

import typings.terser.mod.CompressOptions
import typings.terser.mod.ECMA
import typings.terser.mod.FormatOptions
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("terser-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object esbuildMinify {
    
    inline def apply(input: Input, sourceMap: Unit, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(input: Input, sourceMap: SourceMapInput, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    
    @JSImport("terser-webpack-plugin/types/utils", "esbuildMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  object swcMinify {
    
    inline def apply(input: Input, sourceMap: Unit, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(input: Input, sourceMap: SourceMapInput, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    
    @JSImport("terser-webpack-plugin/types/utils", "swcMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  object terserMinify {
    
    inline def apply(input: Input, sourceMap: Unit, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(
      input: Input,
      sourceMap: Unit,
      minimizerOptions: PredefinedOptions & CustomOptions,
      extractComments: ExtractCommentsOptions
    ): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(input: Input, sourceMap: SourceMapInput, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(
      input: Input,
      sourceMap: SourceMapInput,
      minimizerOptions: PredefinedOptions & CustomOptions,
      extractComments: ExtractCommentsOptions
    ): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    
    @JSImport("terser-webpack-plugin/types/utils", "terserMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  inline def throttleAll[T](limit: Double, tasks: js.Array[Task[T]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(limit.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  object uglifyJsMinify {
    
    inline def apply(input: Input, sourceMap: Unit, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(
      input: Input,
      sourceMap: Unit,
      minimizerOptions: PredefinedOptions & CustomOptions,
      extractComments: ExtractCommentsOptions
    ): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(input: Input, sourceMap: SourceMapInput, minimizerOptions: PredefinedOptions & CustomOptions): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    inline def apply(
      input: Input,
      sourceMap: SourceMapInput,
      minimizerOptions: PredefinedOptions & CustomOptions,
      extractComments: ExtractCommentsOptions
    ): js.Promise[MinimizedResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any], extractComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinimizedResult]]
    
    @JSImport("terser-webpack-plugin/types/utils", "uglifyJsMinify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @returns {string | undefined}
      */
    inline def getMinimizerVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimizerVersion")().asInstanceOf[js.UndefOr[String]]
  }
  
  type CustomOptions = typings.terserWebpackPlugin.mod.CustomOptions
  
  type ExtractCommentsCondition = typings.terserWebpackPlugin.mod.ExtractCommentsCondition
  
  type ExtractCommentsFunction = typings.terserWebpackPlugin.mod.ExtractCommentsFunction
  
  type ExtractCommentsOptions = typings.terserWebpackPlugin.mod.ExtractCommentsOptions
  
  type ExtractedComments = js.Array[String]
  
  type Input = typings.terserWebpackPlugin.mod.Input
  
  type MinimizedResult = typings.terserWebpackPlugin.mod.MinimizedResult
  
  type PredefinedOptions = typings.terserWebpackPlugin.mod.PredefinedOptions
  
  type SourceMapInput = typings.jridgewellTraceMapping.typesMod.SourceMapInput
  
  type Task[T] = js.Function0[js.Promise[T]]
  
  type TerserCompressOptions = CompressOptions
  
  type TerserECMA = ECMA
  
  type TerserFormatOptions = FormatOptions
  
  type TerserOptions = MinifyOptions
}
