package typings.typescript.mod.server

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
  implicit class PackageInstalledResponseOps[Self <: PackageInstalledResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: ActionPackageInstalled): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

