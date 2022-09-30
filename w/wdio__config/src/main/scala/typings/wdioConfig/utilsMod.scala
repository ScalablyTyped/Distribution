package typings.wdioConfig

import typings.std.Record
import typings.wdioConfig.typesMod.ModuleRequireService
import typings.wdioTypes.capabilitiesMod.Capabilities
import typings.wdioTypes.optionsMod.AutoCompileConfig
import typings.wdioTypes.optionsMod.Definition
import typings.wdioTypes.optionsMod.TSConfigPathsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wdio/config/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCloudCapability(caps: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(caps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCucumberFeatureWithLineNumber(spec: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCucumberFeatureWithLineNumber(spec: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadAutoCompilers(autoCompileConfig: AutoCompileConfig, requireService: ModuleRequireService): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAutoCompilers")(autoCompileConfig.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def loadBabelCompiler(babelOpts: Unit, requireService: ModuleRequireService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBabelCompiler")(babelOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def loadBabelCompiler(babelOpts: Record[String, Any], requireService: ModuleRequireService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBabelCompiler")(babelOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loadTypeScriptCompiler(tsNodeOpts: Any, tsConfigPathsOpts: Unit, requireService: ModuleRequireService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTypeScriptCompiler")(tsNodeOpts.asInstanceOf[js.Any], tsConfigPathsOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def loadTypeScriptCompiler(tsNodeOpts: Any, tsConfigPathsOpts: TSConfigPathsOptions, requireService: ModuleRequireService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTypeScriptCompiler")(tsNodeOpts.asInstanceOf[js.Any], tsConfigPathsOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeLineNumbers(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLineNumbers")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validObjectOrArray(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validObjectOrArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: Definition[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: Definition[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def validateTsConfigPaths(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTsConfigPaths")().asInstanceOf[Unit]
  inline def validateTsConfigPaths(tsNodeOpts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTsConfigPaths")(tsNodeOpts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
