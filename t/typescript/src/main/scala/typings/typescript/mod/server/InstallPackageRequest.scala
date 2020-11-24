package typings.typescript.mod.server

import typings.typescript.mod.Path
import typings.typescript.typescriptStrings.installPackage
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
  implicit class InstallPackageRequestOps[Self <: InstallPackageRequest] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: Path): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: installPackage): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRootPath(value: Path): Self = this.set("projectRootPath", value.asInstanceOf[js.Any])
  }
}
