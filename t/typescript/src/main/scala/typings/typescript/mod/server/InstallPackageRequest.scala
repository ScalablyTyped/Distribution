package typings.typescript.mod.server

import typings.typescript.mod.Path
import typings.typescript.typescriptStrings.installPackage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallPackageRequest extends TypingInstallerRequestWithProjectName {
  
  val fileName: Path = js.native
  
  val kind: installPackage = js.native
  
  val packageName: String = js.native
  
  val projectRootPath: Path = js.native
}
object InstallPackageRequest {
  
  @scala.inline
  def apply(
    fileName: Path,
    kind: installPackage,
    packageName: String,
    projectName: String,
    projectRootPath: Path
  ): InstallPackageRequest = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageRequest]
  }
  
  @scala.inline
  implicit class InstallPackageRequestMutableBuilder[Self <: InstallPackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: Path): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: installPackage): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
  }
}
