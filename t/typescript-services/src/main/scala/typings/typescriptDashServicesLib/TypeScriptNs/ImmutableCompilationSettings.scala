package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
class ImmutableCompilationSettings protected () extends js.Object {
  def this(propagateEnumConstants: scala.Boolean, removeComments: scala.Boolean, watch: scala.Boolean, noResolve: scala.Boolean, allowAutomaticSemicolonInsertion: scala.Boolean, noImplicitAny: scala.Boolean, noLib: scala.Boolean, codeGenTarget: LanguageVersion, moduleGenTarget: ModuleGenTarget, outFileOption: java.lang.String, outDirOption: java.lang.String, mapSourceFiles: scala.Boolean, mapRoot: java.lang.String, sourceRoot: java.lang.String, generateDeclarationFiles: scala.Boolean, useCaseSensitiveFileResolution: scala.Boolean, gatherDiagnostics: scala.Boolean, codepage: scala.Double, createFileLog: scala.Boolean) = this()
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
  def allowAutomaticSemicolonInsertion(): scala.Boolean = js.native
  def codeGenTarget(): LanguageVersion = js.native
  def codepage(): scala.Double = js.native
  def createFileLog(): scala.Boolean = js.native
  def gatherDiagnostics(): scala.Boolean = js.native
  def generateDeclarationFiles(): scala.Boolean = js.native
  def mapRoot(): java.lang.String = js.native
  def mapSourceFiles(): scala.Boolean = js.native
  def moduleGenTarget(): ModuleGenTarget = js.native
  def noImplicitAny(): scala.Boolean = js.native
  def noLib(): scala.Boolean = js.native
  def noResolve(): scala.Boolean = js.native
  def outDirOption(): java.lang.String = js.native
  def outFileOption(): java.lang.String = js.native
  def propagateEnumConstants(): scala.Boolean = js.native
  def removeComments(): scala.Boolean = js.native
  def sourceRoot(): java.lang.String = js.native
  def toCompilationSettings(): js.Any = js.native
  def useCaseSensitiveFileResolution(): scala.Boolean = js.native
  def watch(): scala.Boolean = js.native
}

@JSGlobal("TypeScript.ImmutableCompilationSettings")
@js.native
object ImmutableCompilationSettings extends js.Object {
  var _defaultSettings: js.Any = js.native
  def defaultSettings(): typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings = js.native
  def fromCompilationSettings(settings: typescriptDashServicesLib.TypeScriptNs.CompilationSettings): typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings = js.native
}

