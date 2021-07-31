package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationSettings extends StObject {
  
  var allowAutomaticSemicolonInsertion: Boolean
  
  var codeGenTarget: LanguageVersion
  
  var codepage: Double
  
  var createFileLog: Boolean
  
  var gatherDiagnostics: Boolean
  
  var generateDeclarationFiles: Boolean
  
  var mapRoot: String
  
  var mapSourceFiles: Boolean
  
  var moduleGenTarget: ModuleGenTarget
  
  var noImplicitAny: Boolean
  
  var noLib: Boolean
  
  var noResolve: Boolean
  
  var outDirOption: String
  
  var outFileOption: String
  
  var propagateEnumConstants: Boolean
  
  var removeComments: Boolean
  
  var sourceRoot: String
  
  var useCaseSensitiveFileResolution: Boolean
  
  var watch: Boolean
}
object CompilationSettings {
  
  @scala.inline
  def apply(
    allowAutomaticSemicolonInsertion: Boolean,
    codeGenTarget: LanguageVersion,
    codepage: Double,
    createFileLog: Boolean,
    gatherDiagnostics: Boolean,
    generateDeclarationFiles: Boolean,
    mapRoot: String,
    mapSourceFiles: Boolean,
    moduleGenTarget: ModuleGenTarget,
    noImplicitAny: Boolean,
    noLib: Boolean,
    noResolve: Boolean,
    outDirOption: String,
    outFileOption: String,
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    sourceRoot: String,
    useCaseSensitiveFileResolution: Boolean,
    watch: Boolean
  ): CompilationSettings = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], codeGenTarget = codeGenTarget.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], createFileLog = createFileLog.asInstanceOf[js.Any], gatherDiagnostics = gatherDiagnostics.asInstanceOf[js.Any], generateDeclarationFiles = generateDeclarationFiles.asInstanceOf[js.Any], mapRoot = mapRoot.asInstanceOf[js.Any], mapSourceFiles = mapSourceFiles.asInstanceOf[js.Any], moduleGenTarget = moduleGenTarget.asInstanceOf[js.Any], noImplicitAny = noImplicitAny.asInstanceOf[js.Any], noLib = noLib.asInstanceOf[js.Any], noResolve = noResolve.asInstanceOf[js.Any], outDirOption = outDirOption.asInstanceOf[js.Any], outFileOption = outFileOption.asInstanceOf[js.Any], propagateEnumConstants = propagateEnumConstants.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationSettings]
  }
  
  @scala.inline
  implicit class CompilationSettingsMutableBuilder[Self <: CompilationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAutomaticSemicolonInsertion(value: Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeGenTarget(value: LanguageVersion): Self = StObject.set(x, "codeGenTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepage(value: Double): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFileLog(value: Boolean): Self = StObject.set(x, "createFileLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatherDiagnostics(value: Boolean): Self = StObject.set(x, "gatherDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDeclarationFiles(value: Boolean): Self = StObject.set(x, "generateDeclarationFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapRoot(value: String): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapSourceFiles(value: Boolean): Self = StObject.set(x, "mapSourceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleGenTarget(value: ModuleGenTarget): Self = StObject.set(x, "moduleGenTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoImplicitAny(value: Boolean): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLib(value: Boolean): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResolve(value: Boolean): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDirOption(value: String): Self = StObject.set(x, "outDirOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFileOption(value: String): Self = StObject.set(x, "outFileOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateEnumConstants(value: Boolean): Self = StObject.set(x, "propagateEnumConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCaseSensitiveFileResolution(value: Boolean): Self = StObject.set(x, "useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
