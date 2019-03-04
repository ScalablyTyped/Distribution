package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRefWithEmail extends IdentityRef {
  var preferredEmailAddress: java.lang.String
}

object IdentityRefWithEmail {
  @scala.inline
  def apply(
    directoryAlias: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    imageUrl: java.lang.String,
    inactive: scala.Boolean,
    isAadIdentity: scala.Boolean,
    isContainer: scala.Boolean,
    preferredEmailAddress: java.lang.String,
    profileUrl: java.lang.String,
    uniqueName: java.lang.String,
    url: java.lang.String
  ): IdentityRefWithEmail = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, preferredEmailAddress = preferredEmailAddress, profileUrl = profileUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[IdentityRefWithEmail]
  }
}

