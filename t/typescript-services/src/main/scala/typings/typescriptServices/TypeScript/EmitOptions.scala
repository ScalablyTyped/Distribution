package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitOptions extends StObject {
  
  /* private */ var _commonDirectoryPath: Any
  
  /* private */ var _diagnostic: Any
  
  /* private */ var _outputDirectory: Any
  
  /* private */ var _settings: Any
  
  /* private */ var _sharedOutputFile: Any
  
  /* private */ var _sourceMapRootDirectory: Any
  
  /* private */ var _sourceRootDirectory: Any
  
  def commonDirectoryPath(): String
  
  def compilationSettings(): ImmutableCompilationSettings
  
  /* private */ def determineCommonDirectoryPath(compiler: Any): Any
  
  def diagnostic(): Diagnostic
  
  def outputDirectory(): String
  
  def resolvePath(path: String): String
  
  def sharedOutputFile(): String
  
  def sourceMapRootDirectory(): String
  
  def sourceRootDirectory(): String
}
object EmitOptions {
  
  inline def apply(
    _commonDirectoryPath: Any,
    _diagnostic: Any,
    _outputDirectory: Any,
    _settings: Any,
    _sharedOutputFile: Any,
    _sourceMapRootDirectory: Any,
    _sourceRootDirectory: Any,
    commonDirectoryPath: () => String,
    compilationSettings: () => ImmutableCompilationSettings,
    determineCommonDirectoryPath: Any => Any,
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
  implicit open class MutableBuilder[Self <: EmitOptions] (val x: Self) extends AnyVal {
    
    inline def setCommonDirectoryPath(value: () => String): Self = StObject.set(x, "commonDirectoryPath", js.Any.fromFunction0(value))
    
    inline def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = StObject.set(x, "compilationSettings", js.Any.fromFunction0(value))
    
    inline def setDetermineCommonDirectoryPath(value: Any => Any): Self = StObject.set(x, "determineCommonDirectoryPath", js.Any.fromFunction1(value))
    
    inline def setDiagnostic(value: () => Diagnostic): Self = StObject.set(x, "diagnostic", js.Any.fromFunction0(value))
    
    inline def setOutputDirectory(value: () => String): Self = StObject.set(x, "outputDirectory", js.Any.fromFunction0(value))
    
    inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
    
    inline def setSharedOutputFile(value: () => String): Self = StObject.set(x, "sharedOutputFile", js.Any.fromFunction0(value))
    
    inline def setSourceMapRootDirectory(value: () => String): Self = StObject.set(x, "sourceMapRootDirectory", js.Any.fromFunction0(value))
    
    inline def setSourceRootDirectory(value: () => String): Self = StObject.set(x, "sourceRootDirectory", js.Any.fromFunction0(value))
    
    inline def set_commonDirectoryPath(value: Any): Self = StObject.set(x, "_commonDirectoryPath", value.asInstanceOf[js.Any])
    
    inline def set_diagnostic(value: Any): Self = StObject.set(x, "_diagnostic", value.asInstanceOf[js.Any])
    
    inline def set_outputDirectory(value: Any): Self = StObject.set(x, "_outputDirectory", value.asInstanceOf[js.Any])
    
    inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    
    inline def set_sharedOutputFile(value: Any): Self = StObject.set(x, "_sharedOutputFile", value.asInstanceOf[js.Any])
    
    inline def set_sourceMapRootDirectory(value: Any): Self = StObject.set(x, "_sourceMapRootDirectory", value.asInstanceOf[js.Any])
    
    inline def set_sourceRootDirectory(value: Any): Self = StObject.set(x, "_sourceRootDirectory", value.asInstanceOf[js.Any])
  }
}
