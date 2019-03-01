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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryAlias")(directoryAlias)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("imageUrl")(imageUrl)
    __obj.updateDynamic("inactive")(inactive)
    __obj.updateDynamic("isAadIdentity")(isAadIdentity)
    __obj.updateDynamic("isContainer")(isContainer)
    __obj.updateDynamic("preferredEmailAddress")(preferredEmailAddress)
    __obj.updateDynamic("profileUrl")(profileUrl)
    __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IdentityRefWithEmail]
  }
}

