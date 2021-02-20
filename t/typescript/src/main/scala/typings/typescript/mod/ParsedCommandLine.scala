package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedCommandLine extends StObject {
  
  var compileOnSave: js.UndefOr[Boolean] = js.native
  
  var errors: js.Array[Diagnostic] = js.native
  
  var fileNames: js.Array[java.lang.String] = js.native
  
  var options: CompilerOptions = js.native
  
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  
  var raw: js.UndefOr[js.Any] = js.native
  
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.native
  
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.native
}
object ParsedCommandLine {
  
  @scala.inline
  def apply(errors: js.Array[Diagnostic], fileNames: js.Array[java.lang.String], options: CompilerOptions): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCommandLine]
  }
  
  @scala.inline
  implicit class ParsedCommandLineMutableBuilder[Self <: ParsedCommandLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompileOnSaveUndefined: Self = StObject.set(x, "compileOnSave", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFileNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "fileNames", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    
    @scala.inline
    def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = StObject.set(x, "wildcardDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcardDirectoriesUndefined: Self = StObject.set(x, "wildcardDirectories", js.undefined)
  }
}
