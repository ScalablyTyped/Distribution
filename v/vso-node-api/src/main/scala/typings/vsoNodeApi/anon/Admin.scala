package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Admin extends StObject {
  
  var admin: scala.Double
  
  var createPublisher: scala.Double
  
  var deleteExtension: scala.Double
  
  var deletePublisher: scala.Double
  
  var editSettings: scala.Double
  
  var managePermissions: scala.Double
  
  var privateRead: scala.Double
  
  var publishExtension: scala.Double
  
  var read: scala.Double
  
  var trustedPartner: scala.Double
  
  var updateExtension: scala.Double
  
  var viewPermissions: scala.Double
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
  implicit class AdminMutableBuilder[Self <: Admin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: scala.Double): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePublisher(value: scala.Double): Self = StObject.set(x, "createPublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteExtension(value: scala.Double): Self = StObject.set(x, "deleteExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePublisher(value: scala.Double): Self = StObject.set(x, "deletePublisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditSettings(value: scala.Double): Self = StObject.set(x, "editSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagePermissions(value: scala.Double): Self = StObject.set(x, "managePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateRead(value: scala.Double): Self = StObject.set(x, "privateRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishExtension(value: scala.Double): Self = StObject.set(x, "publishExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: scala.Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedPartner(value: scala.Double): Self = StObject.set(x, "trustedPartner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExtension(value: scala.Double): Self = StObject.set(x, "updateExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPermissions(value: scala.Double): Self = StObject.set(x, "viewPermissions", value.asInstanceOf[js.Any])
  }
}
