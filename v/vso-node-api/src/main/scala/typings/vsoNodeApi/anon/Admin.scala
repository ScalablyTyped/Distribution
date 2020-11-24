package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Admin extends js.Object {
  
  var admin: scala.Double = js.native
  
  var createPublisher: scala.Double = js.native
  
  var deleteExtension: scala.Double = js.native
  
  var deletePublisher: scala.Double = js.native
  
  var editSettings: scala.Double = js.native
  
  var managePermissions: scala.Double = js.native
  
  var privateRead: scala.Double = js.native
  
  var publishExtension: scala.Double = js.native
  
  var read: scala.Double = js.native
  
  var trustedPartner: scala.Double = js.native
  
  var updateExtension: scala.Double = js.native
  
  var viewPermissions: scala.Double = js.native
}
object Admin {
  
  @scala.inline
  def apply(
    admin: scala.Double,
    createPublisher: scala.Double,
    deleteExtension: scala.Double,
    deletePublisher: scala.Double,
    editSettings: scala.Double,
    managePermissions: scala.Double,
    privateRead: scala.Double,
    publishExtension: scala.Double,
    read: scala.Double,
    trustedPartner: scala.Double,
    updateExtension: scala.Double,
    viewPermissions: scala.Double
  ): Admin = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], createPublisher = createPublisher.asInstanceOf[js.Any], deleteExtension = deleteExtension.asInstanceOf[js.Any], deletePublisher = deletePublisher.asInstanceOf[js.Any], editSettings = editSettings.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], privateRead = privateRead.asInstanceOf[js.Any], publishExtension = publishExtension.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], trustedPartner = trustedPartner.asInstanceOf[js.Any], updateExtension = updateExtension.asInstanceOf[js.Any], viewPermissions = viewPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Admin]
  }
  
  @scala.inline
  implicit class AdminOps[Self <: Admin] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: scala.Double): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePublisher(value: scala.Double): Self = this.set("createPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteExtension(value: scala.Double): Self = this.set("deleteExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePublisher(value: scala.Double): Self = this.set("deletePublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditSettings(value: scala.Double): Self = this.set("editSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagePermissions(value: scala.Double): Self = this.set("managePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateRead(value: scala.Double): Self = this.set("privateRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishExtension(value: scala.Double): Self = this.set("publishExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: scala.Double): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedPartner(value: scala.Double): Self = this.set("trustedPartner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExtension(value: scala.Double): Self = this.set("updateExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPermissions(value: scala.Double): Self = this.set("viewPermissions", value.asInstanceOf[js.Any])
  }
}
