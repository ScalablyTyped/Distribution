package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
class TypeScriptCompiler ()
  extends typings.typescriptServices.TypeScript.TypeScriptCompiler {
  def this(logger: ILogger) = this()
  def this(
    logger: js.UndefOr[scala.Nothing],
    _settings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
  def this(logger: ILogger, _settings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings) = this()
}
object TypeScriptCompiler {
  
  /* static member */
  @JSImport("typescript-services", "TypeScriptCompiler.getFullDiagnosticText")
  @js.native
  def getFullDiagnosticText(
    diagnostic: typings.typescriptServices.TypeScript.Diagnostic,
    resolvePath: js.Function1[/* path */ String, String]
  ): String = js.native
  
  /* static member */
  @JSImport("typescript-services", "TypeScriptCompiler.getLocationText")
  @js.native
  def getLocationText(location: js.Any, resolvePath: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "TypeScriptCompiler.mapToDTSFileName")
  @js.native
  def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  
  /* static member */
  @JSImport("typescript-services", "TypeScriptCompiler.mapToFileNameExtension")
  @js.native
  def mapToFileNameExtension(extension: String, fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  
  /* static member */
  @JSImport("typescript-services", "TypeScriptCompiler.mapToJSFileName")
  @js.native
  def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
}
