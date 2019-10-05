package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected () extends js.Object {
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
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  var _codeGenTarget: js.Any = js.native
  var _codepage: js.Any = js.native
  var _createFileLog: js.Any = js.native
  var _gatherDiagnostics: js.Any = js.native
  var _generateDeclarationFiles: js.Any = js.native
  var _mapRoot: js.Any = js.native
  var _mapSourceFiles: js.Any = js.native
  var _moduleGenTarget: js.Any = js.native
  var _noImplicitAny: js.Any = js.native
  var _noLib: js.Any = js.native
  var _noResolve: js.Any = js.native
  var _outDirOption: js.Any = js.native
  var _outFileOption: js.Any = js.native
  var _propagateEnumConstants: js.Any = js.native
  var _removeComments: js.Any = js.native
  var _sourceRoot: js.Any = js.native
  var _useCaseSensitiveFileResolution: js.Any = js.native
  var _watch: js.Any = js.native
  def allowAutomaticSemicolonInsertion(): Boolean = js.native
  def codeGenTarget(): LanguageVersion = js.native
  def codepage(): Double = js.native
  def createFileLog(): Boolean = js.native
  def gatherDiagnostics(): Boolean = js.native
  def generateDeclarationFiles(): Boolean = js.native
  def mapRoot(): String = js.native
  def mapSourceFiles(): Boolean = js.native
  def moduleGenTarget(): ModuleGenTarget = js.native
  def noImplicitAny(): Boolean = js.native
  def noLib(): Boolean = js.native
  def noResolve(): Boolean = js.native
  def outDirOption(): String = js.native
  def outFileOption(): String = js.native
  def propagateEnumConstants(): Boolean = js.native
  def removeComments(): Boolean = js.native
  def sourceRoot(): String = js.native
  def toCompilationSettings(): js.Any = js.native
  def useCaseSensitiveFileResolution(): Boolean = js.native
  def watch(): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: CompilationSettings): ImmutableCompilationSettings = js.native
}

