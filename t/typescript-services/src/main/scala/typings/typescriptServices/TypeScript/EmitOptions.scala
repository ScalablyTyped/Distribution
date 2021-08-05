package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitOptions extends StObject {
  
  /* private */ var _commonDirectoryPath: js.Any
  
  /* private */ var _diagnostic: js.Any
  
  /* private */ var _outputDirectory: js.Any
  
  /* private */ var _settings: js.Any
  
  /* private */ var _sharedOutputFile: js.Any
  
  /* private */ var _sourceMapRootDirectory: js.Any
  
  /* private */ var _sourceRootDirectory: js.Any
  
  def commonDirectoryPath(): String
  
  def compilationSettings(): ImmutableCompilationSettings
  
  /* private */ def determineCommonDirectoryPath(compiler: js.Any): js.Any
  
  def diagnostic(): Diagnostic
  
  def outputDirectory(): String
  
  def resolvePath(path: String): String
  
  def sharedOutputFile(): String
  
  def sourceMapRootDirectory(): String
  
  def sourceRootDirectory(): String
}
object EmitOptions {
  
  inline def apply(
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
  
  extension [Self <: EmitOptions](x: Self) {
    
    inline def setCommonDirectoryPath(value: () => String): Self = StObject.set(x, "commonDirectoryPath", js.Any.fromFunction0(value))
    
    inline def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = StObject.set(x, "compilationSettings", js.Any.fromFunction0(value))
    
    inline def setDetermineCommonDirectoryPath(value: js.Any => js.Any): Self = StObject.set(x, "determineCommonDirectoryPath", js.Any.fromFunction1(value))
    
    inline def setDiagnostic(value: () => Diagnostic): Self = StObject.set(x, "diagnostic", js.Any.fromFunction0(value))
    
    inline def setOutputDirectory(value: () => String): Self = StObject.set(x, "outputDirectory", js.Any.fromFunction0(value))
    
    inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
    
    inline def setSharedOutputFile(value: () => String): Self = StObject.set(x, "sharedOutputFile", js.Any.fromFunction0(value))
    
    inline def setSourceMapRootDirectory(value: () => String): Self = StObject.set(x, "sourceMapRootDirectory", js.Any.fromFunction0(value))
    
    inline def setSourceRootDirectory(value: () => String): Self = StObject.set(x, "sourceRootDirectory", js.Any.fromFunction0(value))
    
    inline def set_commonDirectoryPath(value: js.Any): Self = StObject.set(x, "_commonDirectoryPath", value.asInstanceOf[js.Any])
    
    inline def set_diagnostic(value: js.Any): Self = StObject.set(x, "_diagnostic", value.asInstanceOf[js.Any])
    
    inline def set_outputDirectory(value: js.Any): Self = StObject.set(x, "_outputDirectory", value.asInstanceOf[js.Any])
    
    inline def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    
    inline def set_sharedOutputFile(value: js.Any): Self = StObject.set(x, "_sharedOutputFile", value.asInstanceOf[js.Any])
    
    inline def set_sourceMapRootDirectory(value: js.Any): Self = StObject.set(x, "_sourceMapRootDirectory", value.asInstanceOf[js.Any])
    
    inline def set_sourceRootDirectory(value: js.Any): Self = StObject.set(x, "_sourceRootDirectory", value.asInstanceOf[js.Any])
  }
}
