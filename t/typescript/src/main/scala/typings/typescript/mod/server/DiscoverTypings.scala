package typings.typescript.mod.server

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Path
import typings.typescript.mod.SortedReadonlyArray
import typings.typescript.mod.TypeAcquisition
import typings.typescript.mod.WatchOptions
import typings.typescript.typescriptStrings.discover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverTypings
  extends StObject
     with TypingInstallerRequestWithProjectName {
  
  val cachePath: js.UndefOr[String] = js.undefined
  
  val compilerOptions: CompilerOptions
  
  val fileNames: js.Array[String]
  
  val kind: discover
  
  val projectRootPath: Path
  
  val typeAcquisition: TypeAcquisition
  
  val unresolvedImports: SortedReadonlyArray[String]
  
  val watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object DiscoverTypings {
  
  inline def apply(
    compilerOptions: CompilerOptions,
    fileNames: js.Array[String],
    projectName: String,
    projectRootPath: Path,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String]
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = "discover", projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoverTypings] (val x: Self) extends AnyVal {
    
    inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
    
    inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setFileNames(value: js.Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesVarargs(value: String*): Self = StObject.set(x, "fileNames", js.Array(value*))
    
    inline def setKind(value: discover): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = StObject.set(x, "unresolvedImports", value.asInstanceOf[js.Any])
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
