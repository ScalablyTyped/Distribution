package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.LanguageVersion
import typings.typescriptDashServices.TypeScript.ModuleGenTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: LanguageVersion,
    moduleGenTarget: ModuleGenTarget,
    outFileOption: String,
    outDirOption: String,
    mapSourceFiles: Boolean,
    mapRoot: String,
    sourceRoot: String,
    generateDeclarationFiles: Boolean,
    useCaseSensitiveFileResolution: Boolean,
    gatherDiagnostics: Boolean,
    codepage: Double,
    createFileLog: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typings.typescriptDashServices.TypeScript.CompilationSettings): typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings = js.native
}

