package typings.webpackBlocks

import typings.std.Plugin
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
  
  @scala.inline
  def addPlugins(plugins: js.Array[Plugin]): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  object babel {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: typings.webpackBlocksBabel.mod.babel): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "babel")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def createConfig(configSetters: js.Array[Block[Context]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createConfig(configSetters: Block[Context]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(configSetters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object css {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: CssOptions): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "css")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def modules(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")().asInstanceOf[js.Any]
    @scala.inline
    def modules(options: ModuleOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def customConfig(wpConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("customConfig")(wpConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def defineConstants(constants: ConstantOptions): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConstants")(constants.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  object devServer {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: Unit, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(options: Unit, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def apply(options: Options, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(options: Options, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "devServer")
    @js.native
    val ^ : js.Any = js.native
  }
  
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
  def extractText(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractText")().asInstanceOf[js.Any]
  @scala.inline
  def extractText(outputFilePattern: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractText")(outputFilePattern.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def file(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Any]
  @scala.inline
  def file(options: FileOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
  
  object postcss {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: typings.webpackBlocksPostcss.mod.Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "postcss")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def resolve(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Resolve */ js.Any
  ): Block[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(config.asInstanceOf[js.Any]).asInstanceOf[Block[Context]]
  
  object sass {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: typings.webpackBlocksSass.mod.Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "sass")
    @js.native
    val ^ : js.Any = js.native
  }
  
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
  
  object typescript {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: typings.webpackBlocksTypescript.mod.Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "typescript")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object uglify {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(options: typings.webpackBlocksUglify.mod.Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("webpack-blocks", "uglify")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def url(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.Any]
  @scala.inline
  def url(options: UrlOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(condition.asInstanceOf[js.Any], configSetters.asInstanceOf[js.Any])).asInstanceOf[Block[Context]]
}
