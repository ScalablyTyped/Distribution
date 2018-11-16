package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
class TypeScriptCompiler ()
  extends typescriptDashServicesLib.TypeScriptNs.TypeScriptCompiler {
  def this(logger: typescriptDashServicesLib.TypeScriptNs.ILogger) = this()
  def this(logger: typescriptDashServicesLib.TypeScriptNs.ILogger, _settings: typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings) = this()
}

@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
object TypeScriptCompiler extends js.Object {
  def getFullDiagnosticText(
    diagnostic: typescriptDashServicesLib.TypeScriptNs.Diagnostic,
    resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  /* private */ def getLocationText(location: js.Any, resolvePath: js.Any): js.Any = js.native
  def mapToDTSFileName(fileName: java.lang.String, wholeFileNameReplaced: scala.Boolean): java.lang.String = js.native
  def mapToFileNameExtension(extension: java.lang.String, fileName: java.lang.String, wholeFileNameReplaced: scala.Boolean): java.lang.String = js.native
  def mapToJSFileName(fileName: java.lang.String, wholeFileNameReplaced: scala.Boolean): java.lang.String = js.native
}

