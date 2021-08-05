package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmutableCompilationSettings extends StObject {
  
  /* private */ var _allowAutomaticSemicolonInsertion: js.Any
  
  /* private */ var _codeGenTarget: js.Any
  
  /* private */ var _codepage: js.Any
  
  /* private */ var _createFileLog: js.Any
  
  /* private */ var _gatherDiagnostics: js.Any
  
  /* private */ var _generateDeclarationFiles: js.Any
  
  /* private */ var _mapRoot: js.Any
  
  /* private */ var _mapSourceFiles: js.Any
  
  /* private */ var _moduleGenTarget: js.Any
  
  /* private */ var _noImplicitAny: js.Any
  
  /* private */ var _noLib: js.Any
  
  /* private */ var _noResolve: js.Any
  
  /* private */ var _outDirOption: js.Any
  
  /* private */ var _outFileOption: js.Any
  
  /* private */ var _propagateEnumConstants: js.Any
  
  /* private */ var _removeComments: js.Any
  
  /* private */ var _sourceRoot: js.Any
  
  /* private */ var _useCaseSensitiveFileResolution: js.Any
  
  /* private */ var _watch: js.Any
  
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
  
  inline def apply(
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
  
  extension [Self <: ImmutableCompilationSettings](x: Self) {
    
    inline def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    
    inline def setCodeGenTarget(value: () => LanguageVersion): Self = StObject.set(x, "codeGenTarget", js.Any.fromFunction0(value))
    
    inline def setCodepage(value: () => Double): Self = StObject.set(x, "codepage", js.Any.fromFunction0(value))
    
    inline def setCreateFileLog(value: () => Boolean): Self = StObject.set(x, "createFileLog", js.Any.fromFunction0(value))
    
    inline def setGatherDiagnostics(value: () => Boolean): Self = StObject.set(x, "gatherDiagnostics", js.Any.fromFunction0(value))
    
    inline def setGenerateDeclarationFiles(value: () => Boolean): Self = StObject.set(x, "generateDeclarationFiles", js.Any.fromFunction0(value))
    
    inline def setMapRoot(value: () => String): Self = StObject.set(x, "mapRoot", js.Any.fromFunction0(value))
    
    inline def setMapSourceFiles(value: () => Boolean): Self = StObject.set(x, "mapSourceFiles", js.Any.fromFunction0(value))
    
    inline def setModuleGenTarget(value: () => ModuleGenTarget): Self = StObject.set(x, "moduleGenTarget", js.Any.fromFunction0(value))
    
    inline def setNoImplicitAny(value: () => Boolean): Self = StObject.set(x, "noImplicitAny", js.Any.fromFunction0(value))
    
    inline def setNoLib(value: () => Boolean): Self = StObject.set(x, "noLib", js.Any.fromFunction0(value))
    
    inline def setNoResolve(value: () => Boolean): Self = StObject.set(x, "noResolve", js.Any.fromFunction0(value))
    
    inline def setOutDirOption(value: () => String): Self = StObject.set(x, "outDirOption", js.Any.fromFunction0(value))
    
    inline def setOutFileOption(value: () => String): Self = StObject.set(x, "outFileOption", js.Any.fromFunction0(value))
    
    inline def setPropagateEnumConstants(value: () => Boolean): Self = StObject.set(x, "propagateEnumConstants", js.Any.fromFunction0(value))
    
    inline def setRemoveComments(value: () => Boolean): Self = StObject.set(x, "removeComments", js.Any.fromFunction0(value))
    
    inline def setSourceRoot(value: () => String): Self = StObject.set(x, "sourceRoot", js.Any.fromFunction0(value))
    
    inline def setToCompilationSettings(value: () => js.Any): Self = StObject.set(x, "toCompilationSettings", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileResolution(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileResolution", js.Any.fromFunction0(value))
    
    inline def setWatch(value: () => Boolean): Self = StObject.set(x, "watch", js.Any.fromFunction0(value))
    
    inline def set_allowAutomaticSemicolonInsertion(value: js.Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    inline def set_codeGenTarget(value: js.Any): Self = StObject.set(x, "_codeGenTarget", value.asInstanceOf[js.Any])
    
    inline def set_codepage(value: js.Any): Self = StObject.set(x, "_codepage", value.asInstanceOf[js.Any])
    
    inline def set_createFileLog(value: js.Any): Self = StObject.set(x, "_createFileLog", value.asInstanceOf[js.Any])
    
    inline def set_gatherDiagnostics(value: js.Any): Self = StObject.set(x, "_gatherDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_generateDeclarationFiles(value: js.Any): Self = StObject.set(x, "_generateDeclarationFiles", value.asInstanceOf[js.Any])
    
    inline def set_mapRoot(value: js.Any): Self = StObject.set(x, "_mapRoot", value.asInstanceOf[js.Any])
    
    inline def set_mapSourceFiles(value: js.Any): Self = StObject.set(x, "_mapSourceFiles", value.asInstanceOf[js.Any])
    
    inline def set_moduleGenTarget(value: js.Any): Self = StObject.set(x, "_moduleGenTarget", value.asInstanceOf[js.Any])
    
    inline def set_noImplicitAny(value: js.Any): Self = StObject.set(x, "_noImplicitAny", value.asInstanceOf[js.Any])
    
    inline def set_noLib(value: js.Any): Self = StObject.set(x, "_noLib", value.asInstanceOf[js.Any])
    
    inline def set_noResolve(value: js.Any): Self = StObject.set(x, "_noResolve", value.asInstanceOf[js.Any])
    
    inline def set_outDirOption(value: js.Any): Self = StObject.set(x, "_outDirOption", value.asInstanceOf[js.Any])
    
    inline def set_outFileOption(value: js.Any): Self = StObject.set(x, "_outFileOption", value.asInstanceOf[js.Any])
    
    inline def set_propagateEnumConstants(value: js.Any): Self = StObject.set(x, "_propagateEnumConstants", value.asInstanceOf[js.Any])
    
    inline def set_removeComments(value: js.Any): Self = StObject.set(x, "_removeComments", value.asInstanceOf[js.Any])
    
    inline def set_sourceRoot(value: js.Any): Self = StObject.set(x, "_sourceRoot", value.asInstanceOf[js.Any])
    
    inline def set_useCaseSensitiveFileResolution(value: js.Any): Self = StObject.set(x, "_useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    inline def set_watch(value: js.Any): Self = StObject.set(x, "_watch", value.asInstanceOf[js.Any])
  }
}
