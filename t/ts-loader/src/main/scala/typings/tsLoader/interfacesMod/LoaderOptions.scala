package typings.tsLoader.interfacesMod

import typings.chalk.mod.Chalk
import typings.std.RegExp
import typings.tsLoader.anon.FnCall
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.Program
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderOptions extends js.Object {
  
  var allowTsInNodeModules: Boolean = js.native
  
  var appendTsSuffixTo: js.Array[RegExp] = js.native
  
  var appendTsxSuffixTo: js.Array[RegExp] = js.native
  
  var colors: Boolean = js.native
  
  var compiler: String = js.native
  
  var compilerOptions: CompilerOptions = js.native
  
  var configFile: String = js.native
  
  var context: String = js.native
  
  def errorFormatter(message: ErrorInfo, colors: Chalk): String = js.native
  
  var experimentalFileCaching: Boolean = js.native
  
  var experimentalWatchApi: Boolean = js.native
  
  var getCustomTransformers: String | (js.Function1[/* program */ Program, js.UndefOr[CustomTransformers]]) = js.native
  
  var happyPackMode: Boolean = js.native
  
  var ignoreDiagnostics: js.Array[Double] = js.native
  
  var instance: String = js.native
  
  var logInfoToStdOut: Boolean = js.native
  
  var logLevel: LogLevel = js.native
  
  var onlyCompileBundledFiles: Boolean = js.native
  
  var projectReferences: Boolean = js.native
  
  var reportFiles: js.Array[String] = js.native
  
  def resolveModuleName(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    parentResolver: ResolveModuleName
  ): ResolvedModuleWithFailedLookupLocations = js.native
  @JSName("resolveModuleName")
  var resolveModuleName_Original: CustomResolveModuleName = js.native
  
  def resolveTypeReferenceDirective(
    typeDirectiveName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    parentResolver: FnCall
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  @JSName("resolveTypeReferenceDirective")
  var resolveTypeReferenceDirective_Original: CustomResolveTypeReferenceDirective = js.native
  
  var silent: Boolean = js.native
  
  var transpileOnly: Boolean = js.native
}
