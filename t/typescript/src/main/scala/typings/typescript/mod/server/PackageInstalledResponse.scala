package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageInstalledResponse extends ProjectResponse {
  
  @JSName("kind")
  val kind_PackageInstalledResponse: ActionPackageInstalled = js.native
  
  val message: String = js.native
  
  val success: Boolean = js.native
}
object PackageInstalledResponse {
  
  @scala.inline
  def apply(kind: ActionPackageInstalled, message: String, projectName: String, success: Boolean): PackageInstalledResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInstalledResponse]
  }
  
  @scala.inline
  implicit class PackageInstalledResponseMutableBuilder[Self <: PackageInstalledResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: ActionPackageInstalled): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
