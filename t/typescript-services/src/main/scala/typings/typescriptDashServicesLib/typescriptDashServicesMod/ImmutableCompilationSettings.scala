package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings {
  def this(propagateEnumConstants: scala.Boolean, removeComments: scala.Boolean, watch: scala.Boolean, noResolve: scala.Boolean, allowAutomaticSemicolonInsertion: scala.Boolean, noImplicitAny: scala.Boolean, noLib: scala.Boolean, codeGenTarget: typescriptDashServicesLib.TypeScriptNs.LanguageVersion, moduleGenTarget: typescriptDashServicesLib.TypeScriptNs.ModuleGenTarget, outFileOption: java.lang.String, outDirOption: java.lang.String, mapSourceFiles: scala.Boolean, mapRoot: java.lang.String, sourceRoot: java.lang.String, generateDeclarationFiles: scala.Boolean, useCaseSensitiveFileResolution: scala.Boolean, gatherDiagnostics: scala.Boolean, codepage: scala.Double, createFileLog: scala.Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typescriptDashServicesLib.TypeScriptNs.CompilationSettings): typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings = js.native
}

