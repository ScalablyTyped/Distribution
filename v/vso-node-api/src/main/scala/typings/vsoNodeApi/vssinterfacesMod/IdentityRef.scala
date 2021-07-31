package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityRef extends StObject {
  
  var directoryAlias: String
  
  var displayName: String
  
  var id: String
  
  var imageUrl: String
  
  var inactive: Boolean
  
  var isAadIdentity: Boolean
  
  var isContainer: Boolean
  
  var profileUrl: String
  
  var uniqueName: String
  
  var url: String
}
object IdentityRef {
  
  @scala.inline
  def apply(
    directoryAlias: String,
    displayName: String,
    id: String,
    imageUrl: String,
    inactive: Boolean,
    isAadIdentity: Boolean,
    isContainer: Boolean,
    profileUrl: String,
    uniqueName: String,
    url: String
  ): IdentityRef = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isAadIdentity = isAadIdentity.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityRef]
  }
  
  @scala.inline
  implicit class IdentityRefMutableBuilder[Self <: IdentityRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryAlias(value: String): Self = StObject.set(x, "directoryAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAadIdentity(value: Boolean): Self = StObject.set(x, "isAadIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContainer(value: Boolean): Self = StObject.set(x, "isContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
