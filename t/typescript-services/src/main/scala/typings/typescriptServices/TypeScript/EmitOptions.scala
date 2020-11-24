package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitOptions extends js.Object {
  
  var _commonDirectoryPath: js.Any = js.native
  
  var _diagnostic: js.Any = js.native
  
  var _outputDirectory: js.Any = js.native
  
  var _settings: js.Any = js.native
  
  var _sharedOutputFile: js.Any = js.native
  
  var _sourceMapRootDirectory: js.Any = js.native
  
  var _sourceRootDirectory: js.Any = js.native
  
  def commonDirectoryPath(): String = js.native
  
  def compilationSettings(): ImmutableCompilationSettings = js.native
  
  /* private */ def determineCommonDirectoryPath(compiler: js.Any): js.Any = js.native
  
  def diagnostic(): Diagnostic = js.native
  
  def outputDirectory(): String = js.native
  
  def resolvePath(path: String): String = js.native
  
  def sharedOutputFile(): String = js.native
  
  def sourceMapRootDirectory(): String = js.native
  
  def sourceRootDirectory(): String = js.native
}
object EmitOptions {
  
  @scala.inline
  def apply(
    _commonDirectoryPath: js.Any,
    _diagnostic: js.Any,
    _outputDirectory: js.Any,
    _settings: js.Any,
    _sharedOutputFile: js.Any,
    _sourceMapRootDirectory: js.Any,
    _sourceRootDirectory: js.Any,
    commonDirectoryPath: () => String,
    compilationSettings: () => ImmutableCompilationSettings,
    determineCommonDirectoryPath: js.Any => js.Any,
    diagnostic: () => Diagnostic,
    outputDirectory: () => String,
    resolvePath: String => String,
    sharedOutputFile: () => String,
    sourceMapRootDirectory: () => String,
    sourceRootDirectory: () => String
  ): EmitOptions = {
    val __obj = js.Dynamic.literal(_commonDirectoryPath = _commonDirectoryPath.asInstanceOf[js.Any], _diagnostic = _diagnostic.asInstanceOf[js.Any], _outputDirectory = _outputDirectory.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _sharedOutputFile = _sharedOutputFile.asInstanceOf[js.Any], _sourceMapRootDirectory = _sourceMapRootDirectory.asInstanceOf[js.Any], _sourceRootDirectory = _sourceRootDirectory.asInstanceOf[js.Any], commonDirectoryPath = js.Any.fromFunction0(commonDirectoryPath), compilationSettings = js.Any.fromFunction0(compilationSettings), determineCommonDirectoryPath = js.Any.fromFunction1(determineCommonDirectoryPath), diagnostic = js.Any.fromFunction0(diagnostic), outputDirectory = js.Any.fromFunction0(outputDirectory), resolvePath = js.Any.fromFunction1(resolvePath), sharedOutputFile = js.Any.fromFunction0(sharedOutputFile), sourceMapRootDirectory = js.Any.fromFunction0(sourceMapRootDirectory), sourceRootDirectory = js.Any.fromFunction0(sourceRootDirectory))
    __obj.asInstanceOf[EmitOptions]
  }
  
  @scala.inline
  implicit class EmitOptionsOps[Self <: EmitOptions] (val x: Self) extends AnyVal {
    
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
    def set_commonDirectoryPath(value: js.Any): Self = this.set("_commonDirectoryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_diagnostic(value: js.Any): Self = this.set("_diagnostic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_outputDirectory(value: js.Any): Self = this.set("_outputDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sharedOutputFile(value: js.Any): Self = this.set("_sharedOutputFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceMapRootDirectory(value: js.Any): Self = this.set("_sourceMapRootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceRootDirectory(value: js.Any): Self = this.set("_sourceRootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonDirectoryPath(value: () => String): Self = this.set("commonDirectoryPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = this.set("compilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetermineCommonDirectoryPath(value: js.Any => js.Any): Self = this.set("determineCommonDirectoryPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiagnostic(value: () => Diagnostic): Self = this.set("diagnostic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutputDirectory(value: () => String): Self = this.set("outputDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolvePath(value: String => String): Self = this.set("resolvePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSharedOutputFile(value: () => String): Self = this.set("sharedOutputFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceMapRootDirectory(value: () => String): Self = this.set("sourceMapRootDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceRootDirectory(value: () => String): Self = this.set("sourceRootDirectory", js.Any.fromFunction0(value))
  }
}
