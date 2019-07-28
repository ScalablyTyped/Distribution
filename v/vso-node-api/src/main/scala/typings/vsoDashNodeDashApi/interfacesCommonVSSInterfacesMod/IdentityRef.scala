package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRef extends js.Object {
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
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, profileUrl = profileUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[IdentityRef]
  }
}

