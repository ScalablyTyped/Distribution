package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityRefWithEmail extends IdentityRef {
  
  var preferredEmailAddress: String = js.native
}
object IdentityRefWithEmail {
  
  @scala.inline
  def apply(
    directoryAlias: String,
    displayName: String,
    id: String,
    imageUrl: String,
    inactive: Boolean,
    isAadIdentity: Boolean,
    isContainer: Boolean,
    preferredEmailAddress: String,
    profileUrl: String,
    uniqueName: String,
    url: String
  ): IdentityRefWithEmail = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isAadIdentity = isAadIdentity.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityRefWithEmail]
  }
  
  @scala.inline
  implicit class IdentityRefWithEmailMutableBuilder[Self <: IdentityRefWithEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferredEmailAddress(value: String): Self = StObject.set(x, "preferredEmailAddress", value.asInstanceOf[js.Any])
  }
}
