package typings.webpackBlocks

import typings.webpack.mod.Configuration
import typings.webpack.mod.Entry
import typings.webpack.mod.Output
import typings.webpack.mod.Plugin
import typings.webpackBlocksAssets.mod.css.CssOptions
import typings.webpackBlocksAssets.mod.css.FileOptions
import typings.webpackBlocksAssets.mod.css.ModuleOptions
import typings.webpackBlocksAssets.mod.css.UrlOptions
import typings.webpackBlocksCore.mod.Block
import typings.webpackBlocksCore.mod.Context
import typings.webpackBlocksCore.mod.MatchOptions
import typings.webpackBlocksDevServer.mod.Options
import typings.webpackBlocksWebpack.mod.ConstantOptions
import typings.webpackBlocksWebpack.mod.OptimizationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-blocks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPlugins(plugins: js.Array[Plugin]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def babel(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("babel")().asInstanceOf[Any]
  inline def babel(options: typings.webpackBlocksBabel.mod.babel): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("babel")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createConfig(configSetters: js.Array[Block[Context]]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  inline def createConfig(configSetters: Block[Context]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  object css {
    
    inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
    inline def apply(options: CssOptions): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("webpack-blocks", "css")
    @js.native
    val ^ : js.Any = js.native
    
    inline def modules(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")().asInstanceOf[Any]
    inline def modules(options: ModuleOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def customConfig(wpConfig: Any): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("customConfig")(wpConfig.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def defineConstants(constants: ConstantOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConstants")(constants.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def devServer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("devServer")().asInstanceOf[Any]
  inline def devServer(options: Unit, entry: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("devServer")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def devServer(options: Unit, entry: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("devServer")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def devServer(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("devServer")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def devServer(options: Options, entry: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("devServer")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def devServer(options: Options, entry: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("devServer")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def entryPoint(entry: String): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def entryPoint(entry: js.Array[String]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  inline def entryPoint(entry: Entry): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("entryPoint")(entry.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(envName.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def extractText(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractText")().asInstanceOf[Any]
  inline def extractText(outputFilePattern: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractText")(outputFilePattern.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def file(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[Any]
  inline def file(options: FileOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def group(configSetters: js.Array[Block[Context]]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(configSetters.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  inline def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(test.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
  
  inline def optimization(optimizationOptions: OptimizationOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimization")(optimizationOptions.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def performance(
    performanceBudget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Performance */ Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("performance")(performanceBudget.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def postcss(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("postcss")().asInstanceOf[Any]
  inline def postcss(options: typings.webpackBlocksPostcss.mod.Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("postcss")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(config.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  inline def sass(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sass")().asInstanceOf[Any]
  inline def sass(options: typings.webpackBlocksSass.mod.Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sass")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  
  inline def typescript(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typescript")().asInstanceOf[Any]
  inline def typescript(options: typings.webpackBlocksTypescript.mod.Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typescript")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def uglify(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uglify")().asInstanceOf[Any]
  inline def uglify(options: typings.webpackBlocksUglify.mod.Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uglify")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def url(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[Any]
  inline def url(options: UrlOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
}
