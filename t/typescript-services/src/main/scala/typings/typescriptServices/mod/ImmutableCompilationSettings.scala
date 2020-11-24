package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected ()
  extends typings.typescriptServices.TypeScript.ImmutableCompilationSettings {
  def this(
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    watch: Boolean,
    noResolve: Boolean,
    allowAutomaticSemicolonInsertion: Boolean,
    noImplicitAny: Boolean,
    noLib: Boolean,
    codeGenTarget: typings.typescriptServices.TypeScript.LanguageVersion,
    moduleGenTarget: typings.typescriptServices.TypeScript.ModuleGenTarget,
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
  
  def defaultSettings(): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  
  def fromCompilationSettings(settings: typings.typescriptServices.TypeScript.CompilationSettings): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
}
