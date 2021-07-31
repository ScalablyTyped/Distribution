package typings.webpackBlocksWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import typings.webpackBlocksCore.mod.MatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addPlugins(plugins: js.Array[Plugin]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def createConfig(configSetters: js.Array[Block[Context]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createConfig(configSetters: Block[Context]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def customConfig(wpConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("customConfig")(wpConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def defineConstants(constants: ConstantOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConstants")(constants.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def entryPoint(entry: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  @scala.inline
  def entryPoint(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  @scala.inline
  def entryPoint(entry: js.Array[String]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(envName.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  @scala.inline
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  @scala.inline
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  @scala.inline
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  @scala.inline
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  @scala.inline
  def optimization(optimizationOptions: OptimizationOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimization")(optimizationOptions.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def performance(
    performanceBudget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Performance */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("performance")(performanceBudget.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(config.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def setContext(contextPath: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(contextPath.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def setDevTool(devtool: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevTool")(devtool.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def setEnv(constants: ConstantOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnv")(constants.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def setMode(mode: js.Any): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def setOutput(): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")().asInstanceOf[Block[Context]]
  @scala.inline
  def setOutput(output: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")(output.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  @scala.inline
  def setOutput(
    output: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Output */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")(output.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def sourceMaps(): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceMaps")().asInstanceOf[Block[Context]]
  @scala.inline
  def sourceMaps(
    devtool: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Devtool */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceMaps")(devtool.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  @scala.inline
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  type ConstantOptions = StringDictionary[js.Any]
  
  trait OptimizationOptions extends StObject {
    
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.undefined
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
}
