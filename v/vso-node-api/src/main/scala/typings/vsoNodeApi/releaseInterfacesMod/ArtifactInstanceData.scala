package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactInstanceData extends js.Object {
  
  var accountName: String = js.native
  
  var authenticationToken: String = js.native
  
  var tfsUrl: String = js.native
  
  var version: String = js.native
}
object ArtifactInstanceData {
  
  @scala.inline
  def apply(accountName: String, authenticationToken: String, tfsUrl: String, version: String): ArtifactInstanceData = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], authenticationToken = authenticationToken.asInstanceOf[js.Any], tfsUrl = tfsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactInstanceData]
  }
  
  @scala.inline
  implicit class ArtifactInstanceDataOps[Self <: ArtifactInstanceData] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationToken(value: String): Self = this.set("authenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfsUrl(value: String): Self = this.set("tfsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
