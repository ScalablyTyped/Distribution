package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableCompilationSettings extends js.Object {
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
  @scala.inline
  implicit class ImmutableCompilationSettingsOps[Self <: ImmutableCompilationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_allowAutomaticSemicolonInsertion(value: js.Any): Self = this.set("_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    @scala.inline
    def set_codeGenTarget(value: js.Any): Self = this.set("_codeGenTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def set_codepage(value: js.Any): Self = this.set("_codepage", value.asInstanceOf[js.Any])
    @scala.inline
    def set_createFileLog(value: js.Any): Self = this.set("_createFileLog", value.asInstanceOf[js.Any])
    @scala.inline
    def set_gatherDiagnostics(value: js.Any): Self = this.set("_gatherDiagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def set_generateDeclarationFiles(value: js.Any): Self = this.set("_generateDeclarationFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def set_mapRoot(value: js.Any): Self = this.set("_mapRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def set_mapSourceFiles(value: js.Any): Self = this.set("_mapSourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def set_moduleGenTarget(value: js.Any): Self = this.set("_moduleGenTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def set_noImplicitAny(value: js.Any): Self = this.set("_noImplicitAny", value.asInstanceOf[js.Any])
    @scala.inline
    def set_noLib(value: js.Any): Self = this.set("_noLib", value.asInstanceOf[js.Any])
    @scala.inline
    def set_noResolve(value: js.Any): Self = this.set("_noResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def set_outDirOption(value: js.Any): Self = this.set("_outDirOption", value.asInstanceOf[js.Any])
    @scala.inline
    def set_outFileOption(value: js.Any): Self = this.set("_outFileOption", value.asInstanceOf[js.Any])
    @scala.inline
    def set_propagateEnumConstants(value: js.Any): Self = this.set("_propagateEnumConstants", value.asInstanceOf[js.Any])
    @scala.inline
    def set_removeComments(value: js.Any): Self = this.set("_removeComments", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sourceRoot(value: js.Any): Self = this.set("_sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def set_useCaseSensitiveFileResolution(value: js.Any): Self = this.set("_useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def set_watch(value: js.Any): Self = this.set("_watch", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = this.set("allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    @scala.inline
    def setCodeGenTarget(value: () => LanguageVersion): Self = this.set("codeGenTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setCodepage(value: () => Double): Self = this.set("codepage", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateFileLog(value: () => Boolean): Self = this.set("createFileLog", js.Any.fromFunction0(value))
    @scala.inline
    def setGatherDiagnostics(value: () => Boolean): Self = this.set("gatherDiagnostics", js.Any.fromFunction0(value))
    @scala.inline
    def setGenerateDeclarationFiles(value: () => Boolean): Self = this.set("generateDeclarationFiles", js.Any.fromFunction0(value))
    @scala.inline
    def setMapRoot(value: () => String): Self = this.set("mapRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setMapSourceFiles(value: () => Boolean): Self = this.set("mapSourceFiles", js.Any.fromFunction0(value))
    @scala.inline
    def setModuleGenTarget(value: () => ModuleGenTarget): Self = this.set("moduleGenTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setNoImplicitAny(value: () => Boolean): Self = this.set("noImplicitAny", js.Any.fromFunction0(value))
    @scala.inline
    def setNoLib(value: () => Boolean): Self = this.set("noLib", js.Any.fromFunction0(value))
    @scala.inline
    def setNoResolve(value: () => Boolean): Self = this.set("noResolve", js.Any.fromFunction0(value))
    @scala.inline
    def setOutDirOption(value: () => String): Self = this.set("outDirOption", js.Any.fromFunction0(value))
    @scala.inline
    def setOutFileOption(value: () => String): Self = this.set("outFileOption", js.Any.fromFunction0(value))
    @scala.inline
    def setPropagateEnumConstants(value: () => Boolean): Self = this.set("propagateEnumConstants", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveComments(value: () => Boolean): Self = this.set("removeComments", js.Any.fromFunction0(value))
    @scala.inline
    def setSourceRoot(value: () => String): Self = this.set("sourceRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setToCompilationSettings(value: () => js.Any): Self = this.set("toCompilationSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setUseCaseSensitiveFileResolution(value: () => Boolean): Self = this.set("useCaseSensitiveFileResolution", js.Any.fromFunction0(value))
    @scala.inline
    def setWatch(value: () => Boolean): Self = this.set("watch", js.Any.fromFunction0(value))
  }
  
}

