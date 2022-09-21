package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedCommandLine extends StObject {
  
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
  
  var errors: js.Array[Diagnostic]
  
  var fileNames: js.Array[java.lang.String]
  
  var options: CompilerOptions
  
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  
  var raw: js.UndefOr[Any] = js.undefined
  
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.undefined
}
object ParsedCommandLine {
  
  inline def apply(errors: js.Array[Diagnostic], fileNames: js.Array[java.lang.String], options: CompilerOptions): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCommandLine]
  }
  
  extension [Self <: ParsedCommandLine](x: Self) {
    
    inline def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    inline def setCompileOnSaveUndefined: Self = StObject.set(x, "compileOnSave", js.undefined)
    
    inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFileNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "fileNames", js.Array(value*))
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    inline def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    inline def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value*))
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    
    inline def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = StObject.set(x, "wildcardDirectories", value.asInstanceOf[js.Any])
    
    inline def setWildcardDirectoriesUndefined: Self = StObject.set(x, "wildcardDirectories", js.undefined)
  }
}
