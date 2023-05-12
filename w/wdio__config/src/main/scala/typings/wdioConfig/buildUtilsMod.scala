package typings.wdioConfig

import typings.std.Record
import typings.wdioConfig.buildTypesMod.ModuleImportService
import typings.wdioTypes.buildCapabilitiesMod.Capabilities
import typings.wdioTypes.buildOptionsMod.AutoCompileConfig
import typings.wdioTypes.buildOptionsMod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("@wdio/config/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCloudCapability(caps: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(caps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCucumberFeatureWithLineNumber(spec: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCucumberFeatureWithLineNumber(spec: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadAutoCompilers(autoCompileConfig: AutoCompileConfig, requireService: ModuleImportService): js.Promise[js.UndefOr[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAutoCompilers")(autoCompileConfig.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def loadBabelCompiler(babelOpts: Unit, requireService: ModuleImportService): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBabelCompiler")(babelOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def loadBabelCompiler(babelOpts: Record[String, Any], requireService: ModuleImportService): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBabelCompiler")(babelOpts.asInstanceOf[js.Any], requireService.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def loadTypeScriptCompiler(autoCompileConfig: AutoCompileConfig): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTypeScriptCompiler")(autoCompileConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def makeRelativeToCWD(): js.Array[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRelativeToCWD")().asInstanceOf[js.Array[String | js.Array[String]]]
  inline def makeRelativeToCWD(files: js.Array[String | js.Array[String]]): js.Array[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRelativeToCWD")(files.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | js.Array[String]]]
  
  inline def objectToEnv(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToEnv")().asInstanceOf[Unit]
  inline def objectToEnv(params: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToEnv")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeLineNumbers(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLineNumbers")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validObjectOrArray(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validObjectOrArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: Definition[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: Definition[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
}
