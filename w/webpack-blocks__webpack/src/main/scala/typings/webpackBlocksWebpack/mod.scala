package typings.webpackBlocksWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import typings.webpackBlocksCore.mod.MatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/webpack", "addPlugins")
  @js.native
  def addPlugins(plugins: js.Array[Plugin]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "createConfig")
  @js.native
  def createConfig(configSetters: js.Array[Block[Context]]): js.Any = js.native
  @JSImport("@webpack-blocks/webpack", "createConfig")
  @js.native
  def createConfig(configSetters: Block[Context]): js.Any = js.native
  
  @JSImport("@webpack-blocks/webpack", "customConfig")
  @js.native
  def customConfig(wpConfig: js.Any): js.Any = js.native
  
  @JSImport("@webpack-blocks/webpack", "defineConstants")
  @js.native
  def defineConstants(constants: ConstantOptions): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "entryPoint")
  @js.native
  def entryPoint(entry: String): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "entryPoint")
  @js.native
  def entryPoint(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ js.Any
  ): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "entryPoint")
  @js.native
  def entryPoint(entry: js.Array[String]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "env")
  @js.native
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "group")
  @js.native
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "optimization")
  @js.native
  def optimization(optimizationOptions: OptimizationOptions): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "performance")
  @js.native
  def performance(
    performanceBudget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Performance */ js.Any
  ): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "resolve")
  @js.native
  def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ js.Any
  ): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "setContext")
  @js.native
  def setContext(contextPath: String): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "setDevTool")
  @js.native
  def setDevTool(devtool: String): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "setEnv")
  @js.native
  def setEnv(constants: ConstantOptions): js.Any = js.native
  
  @JSImport("@webpack-blocks/webpack", "setMode")
  @js.native
  def setMode(mode: js.Any): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "setOutput")
  @js.native
  def setOutput(): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "setOutput")
  @js.native
  def setOutput(output: String): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "setOutput")
  @js.native
  def setOutput(
    output: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Output */ js.Any
  ): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "sourceMaps")
  @js.native
  def sourceMaps(): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "sourceMaps")
  @js.native
  def sourceMaps(
    devtool: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Devtool */ js.Any
  ): Block[Context] = js.native
  
  @JSImport("@webpack-blocks/webpack", "when")
  @js.native
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  
  type ConstantOptions = StringDictionary[js.Any]
  
  @js.native
  trait OptimizationOptions extends StObject {
    
    var minimize: js.UndefOr[Boolean] = js.native
    
    var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.native
  }
  object OptimizationOptions {
    
    @scala.inline
    def apply(): OptimizationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizationOptions]
    }
    
    @scala.inline
    implicit class OptimizationOptionsMutableBuilder[Self <: OptimizationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setMinimizer(value: js.Array[Plugin] | PluginFunction): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizerFunction1(value: /* compiler */ js.Any => Plugin): Self = StObject.set(x, "minimizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinimizerUndefined: Self = StObject.set(x, "minimizer", js.undefined)
      
      @scala.inline
      def setMinimizerVarargs(value: Plugin*): Self = StObject.set(x, "minimizer", js.Array(value :_*))
    }
  }
  
  type PluginFunction = js.Function1[/* compiler */ js.Any, Plugin]
  
  @JSImport("@webpack-blocks/webpack", "match")
  @js.native
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "match")
  @js.native
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "match")
  @js.native
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @JSImport("@webpack-blocks/webpack", "match")
  @js.native
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}
