package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ImmutableCompilationSettings")
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
  /* CompleteClass */
  override var _allowAutomaticSemicolonInsertion: js.Any = js.native
  /* CompleteClass */
  override var _codeGenTarget: js.Any = js.native
  /* CompleteClass */
  override var _codepage: js.Any = js.native
  /* CompleteClass */
  override var _createFileLog: js.Any = js.native
  /* CompleteClass */
  override var _gatherDiagnostics: js.Any = js.native
  /* CompleteClass */
  override var _generateDeclarationFiles: js.Any = js.native
  /* CompleteClass */
  override var _mapRoot: js.Any = js.native
  /* CompleteClass */
  override var _mapSourceFiles: js.Any = js.native
  /* CompleteClass */
  override var _moduleGenTarget: js.Any = js.native
  /* CompleteClass */
  override var _noImplicitAny: js.Any = js.native
  /* CompleteClass */
  override var _noLib: js.Any = js.native
  /* CompleteClass */
  override var _noResolve: js.Any = js.native
  /* CompleteClass */
  override var _outDirOption: js.Any = js.native
  /* CompleteClass */
  override var _outFileOption: js.Any = js.native
  /* CompleteClass */
  override var _propagateEnumConstants: js.Any = js.native
  /* CompleteClass */
  override var _removeComments: js.Any = js.native
  /* CompleteClass */
  override var _sourceRoot: js.Any = js.native
  /* CompleteClass */
  override var _useCaseSensitiveFileResolution: js.Any = js.native
  /* CompleteClass */
  override var _watch: js.Any = js.native
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  /* CompleteClass */
  override def codeGenTarget(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  /* CompleteClass */
  override def codepage(): Double = js.native
  /* CompleteClass */
  override def createFileLog(): Boolean = js.native
  /* CompleteClass */
  override def gatherDiagnostics(): Boolean = js.native
  /* CompleteClass */
  override def generateDeclarationFiles(): Boolean = js.native
  /* CompleteClass */
  override def mapRoot(): String = js.native
  /* CompleteClass */
  override def mapSourceFiles(): Boolean = js.native
  /* CompleteClass */
  override def moduleGenTarget(): typings.typescriptServices.TypeScript.ModuleGenTarget = js.native
  /* CompleteClass */
  override def noImplicitAny(): Boolean = js.native
  /* CompleteClass */
  override def noLib(): Boolean = js.native
  /* CompleteClass */
  override def noResolve(): Boolean = js.native
  /* CompleteClass */
  override def outDirOption(): String = js.native
  /* CompleteClass */
  override def outFileOption(): String = js.native
  /* CompleteClass */
  override def propagateEnumConstants(): Boolean = js.native
  /* CompleteClass */
  override def removeComments(): Boolean = js.native
  /* CompleteClass */
  override def sourceRoot(): String = js.native
  /* CompleteClass */
  override def toCompilationSettings(): js.Any = js.native
  /* CompleteClass */
  override def useCaseSensitiveFileResolution(): Boolean = js.native
  /* CompleteClass */
  override def watch(): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typings.typescriptServices.TypeScript.CompilationSettings): typings.typescriptServices.TypeScript.ImmutableCompilationSettings = js.native
}

