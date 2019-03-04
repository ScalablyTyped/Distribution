package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRef extends js.Object {
  var directoryAlias: java.lang.String
  var displayName: java.lang.String
  var id: java.lang.String
  var imageUrl: java.lang.String
  var inactive: scala.Boolean
  var isAadIdentity: scala.Boolean
  var isContainer: scala.Boolean
  var profileUrl: java.lang.String
  var uniqueName: java.lang.String
  var url: java.lang.String
}

object IdentityRef {
  @scala.inline
  def apply(
    directoryAlias: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    imageUrl: java.lang.String,
    inactive: scala.Boolean,
    isAadIdentity: scala.Boolean,
    isContainer: scala.Boolean,
    profileUrl: java.lang.String,
    uniqueName: java.lang.String,
    url: java.lang.String
  ): IdentityRef = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, profileUrl = profileUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[IdentityRef]
  }
}

