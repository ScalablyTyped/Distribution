package typings.typescript.mod.server

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Path
import typings.typescript.mod.SortedReadonlyArray
import typings.typescript.mod.TypeAcquisition
import typings.typescript.mod.WatchOptions
import typings.typescript.typescriptStrings.discover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverTypings extends TypingInstallerRequestWithProjectName {
  
  val cachePath: js.UndefOr[String] = js.native
  
  val compilerOptions: CompilerOptions = js.native
  
  val fileNames: js.Array[String] = js.native
  
  val kind: discover = js.native
  
  val projectRootPath: Path = js.native
  
  val typeAcquisition: TypeAcquisition = js.native
  
  val unresolvedImports: SortedReadonlyArray[String] = js.native
  
  val watchOptions: js.UndefOr[WatchOptions] = js.native
}
object DiscoverTypings {
  
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions,
    fileNames: js.Array[String],
    kind: discover,
    projectName: String,
    projectRootPath: Path,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String]
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
  
  @scala.inline
  implicit class DiscoverTypingsMutableBuilder[Self <: DiscoverTypings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNames(value: js.Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamesVarargs(value: String*): Self = StObject.set(x, "fileNames", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: discover): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = StObject.set(x, "unresolvedImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
