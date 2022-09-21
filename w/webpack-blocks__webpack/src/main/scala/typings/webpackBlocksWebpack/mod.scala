package typings.webpackBlocksWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Configuration
import typings.webpack.mod.Entry
import typings.webpack.mod.Output
import typings.webpack.mod.Plugin
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
  
  inline def addPlugins(plugins: js.Array[Plugin]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def createConfig(configSetters: js.Array[Block[Context]]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  inline def createConfig(configSetters: Block[Context]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def customConfig(wpConfig: Any): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("customConfig")(wpConfig.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def defineConstants(constants: ConstantOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConstants")(constants.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def entryPoint(entry: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def entryPoint(entry: js.Array[String]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def entryPoint(entry: Entry): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(envName.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def group(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def optimization(optimizationOptions: OptimizationOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimization")(optimizationOptions.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def performance(
    performanceBudget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Performance */ Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("performance")(performanceBudget.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(config.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def setContext(contextPath: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(contextPath.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def setDevTool(devtool: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevTool")(devtool.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def setEnv(constants: ConstantOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnv")(constants.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setMode(mode: Any): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def setOutput(): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")().asInstanceOf[Block[Context]]
  inline def setOutput(output: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")(output.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def setOutput(output: Output): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOutput")(output.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def sourceMaps(): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceMaps")().asInstanceOf[Block[Context]]
  inline def sourceMaps(
    devtool: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Devtool */ Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("sourceMaps")(devtool.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  type ConstantOptions = StringDictionary[Any]
  
  trait OptimizationOptions extends StObject {
    
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.undefined
  }
  object OptimizationOptions {
    
    inline def apply(): OptimizationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizationOptions]
    }
    
    extension [Self <: OptimizationOptions](x: Self) {
      
      inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      inline def setMinimizer(value: js.Array[Plugin] | PluginFunction): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
      
      inline def setMinimizerFunction1(value: /* compiler */ Any => Plugin): Self = StObject.set(x, "minimizer", js.Any.fromFunction1(value))
      
      inline def setMinimizerUndefined: Self = StObject.set(x, "minimizer", js.undefined)
      
      inline def setMinimizerVarargs(value: Plugin*): Self = StObject.set(x, "minimizer", js.Array(value*))
    }
  }
  
  type PluginFunction = js.Function1[/* compiler */ Any, Plugin]
}
