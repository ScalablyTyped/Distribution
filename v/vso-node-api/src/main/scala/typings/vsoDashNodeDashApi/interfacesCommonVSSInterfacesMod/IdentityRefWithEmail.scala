package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRefWithEmail extends IdentityRef {
  var preferredEmailAddress: String
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
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, preferredEmailAddress = preferredEmailAddress, profileUrl = profileUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[IdentityRefWithEmail]
  }
}

