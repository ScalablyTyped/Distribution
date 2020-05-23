package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmutableCompilationSettings extends js.Object {
  var _allowAutomaticSemicolonInsertion: js.Any
  var _codeGenTarget: js.Any
  var _codepage: js.Any
  var _createFileLog: js.Any
  var _gatherDiagnostics: js.Any
  var _generateDeclarationFiles: js.Any
  var _mapRoot: js.Any
  var _mapSourceFiles: js.Any
  var _moduleGenTarget: js.Any
  var _noImplicitAny: js.Any
  var _noLib: js.Any
  var _noResolve: js.Any
  var _outDirOption: js.Any
  var _outFileOption: js.Any
  var _propagateEnumConstants: js.Any
  var _removeComments: js.Any
  var _sourceRoot: js.Any
  var _useCaseSensitiveFileResolution: js.Any
  var _watch: js.Any
  def allowAutomaticSemicolonInsertion(): Boolean
  def codeGenTarget(): LanguageVersion
  def codepage(): Double
  def createFileLog(): Boolean
  def gatherDiagnostics(): Boolean
  def generateDeclarationFiles(): Boolean
  def mapRoot(): String
  def mapSourceFiles(): Boolean
  def moduleGenTarget(): ModuleGenTarget
  def noImplicitAny(): Boolean
  def noLib(): Boolean
  def noResolve(): Boolean
  def outDirOption(): String
  def outFileOption(): String
  def propagateEnumConstants(): Boolean
  def removeComments(): Boolean
  def sourceRoot(): String
  def toCompilationSettings(): js.Any
  def useCaseSensitiveFileResolution(): Boolean
  def watch(): Boolean
}

object ImmutableCompilationSettings {
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _codeGenTarget: js.Any,
    _codepage: js.Any,
    _createFileLog: js.Any,
    _gatherDiagnostics: js.Any,
    _generateDeclarationFiles: js.Any,
    _mapRoot: js.Any,
    _mapSourceFiles: js.Any,
    _moduleGenTarget: js.Any,
    _noImplicitAny: js.Any,
    _noLib: js.Any,
    _noResolve: js.Any,
    _outDirOption: js.Any,
    _outFileOption: js.Any,
    _propagateEnumConstants: js.Any,
    _removeComments: js.Any,
    _sourceRoot: js.Any,
    _useCaseSensitiveFileResolution: js.Any,
    _watch: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    codeGenTarget: () => LanguageVersion,
    codepage: () => Double,
    createFileLog: () => Boolean,
    gatherDiagnostics: () => Boolean,
    generateDeclarationFiles: () => Boolean,
    mapRoot: () => String,
    mapSourceFiles: () => Boolean,
    moduleGenTarget: () => ModuleGenTarget,
    noImplicitAny: () => Boolean,
    noLib: () => Boolean,
    noResolve: () => Boolean,
    outDirOption: () => String,
    outFileOption: () => String,
    propagateEnumConstants: () => Boolean,
    removeComments: () => Boolean,
    sourceRoot: () => String,
    toCompilationSettings: () => js.Any,
    useCaseSensitiveFileResolution: () => Boolean,
    watch: () => Boolean
  ): ImmutableCompilationSettings = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _codeGenTarget = _codeGenTarget.asInstanceOf[js.Any], _codepage = _codepage.asInstanceOf[js.Any], _createFileLog = _createFileLog.asInstanceOf[js.Any], _gatherDiagnostics = _gatherDiagnostics.asInstanceOf[js.Any], _generateDeclarationFiles = _generateDeclarationFiles.asInstanceOf[js.Any], _mapRoot = _mapRoot.asInstanceOf[js.Any], _mapSourceFiles = _mapSourceFiles.asInstanceOf[js.Any], _moduleGenTarget = _moduleGenTarget.asInstanceOf[js.Any], _noImplicitAny = _noImplicitAny.asInstanceOf[js.Any], _noLib = _noLib.asInstanceOf[js.Any], _noResolve = _noResolve.asInstanceOf[js.Any], _outDirOption = _outDirOption.asInstanceOf[js.Any], _outFileOption = _outFileOption.asInstanceOf[js.Any], _propagateEnumConstants = _propagateEnumConstants.asInstanceOf[js.Any], _removeComments = _removeComments.asInstanceOf[js.Any], _sourceRoot = _sourceRoot.asInstanceOf[js.Any], _useCaseSensitiveFileResolution = _useCaseSensitiveFileResolution.asInstanceOf[js.Any], _watch = _watch.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), codeGenTarget = js.Any.fromFunction0(codeGenTarget), codepage = js.Any.fromFunction0(codepage), createFileLog = js.Any.fromFunction0(createFileLog), gatherDiagnostics = js.Any.fromFunction0(gatherDiagnostics), generateDeclarationFiles = js.Any.fromFunction0(generateDeclarationFiles), mapRoot = js.Any.fromFunction0(mapRoot), mapSourceFiles = js.Any.fromFunction0(mapSourceFiles), moduleGenTarget = js.Any.fromFunction0(moduleGenTarget), noImplicitAny = js.Any.fromFunction0(noImplicitAny), noLib = js.Any.fromFunction0(noLib), noResolve = js.Any.fromFunction0(noResolve), outDirOption = js.Any.fromFunction0(outDirOption), outFileOption = js.Any.fromFunction0(outFileOption), propagateEnumConstants = js.Any.fromFunction0(propagateEnumConstants), removeComments = js.Any.fromFunction0(removeComments), sourceRoot = js.Any.fromFunction0(sourceRoot), toCompilationSettings = js.Any.fromFunction0(toCompilationSettings), useCaseSensitiveFileResolution = js.Any.fromFunction0(useCaseSensitiveFileResolution), watch = js.Any.fromFunction0(watch))
    __obj.asInstanceOf[ImmutableCompilationSettings]
  }
}

