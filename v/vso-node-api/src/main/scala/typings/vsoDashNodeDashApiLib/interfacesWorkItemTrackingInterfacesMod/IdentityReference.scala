package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityReference
  extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef {
  /**
    * Legacy back-compat property. This has been the WIT specific value from Constants. Will be hidden (but exists) on the client unless they are targeting the newest version
    */
  var name: java.lang.String
}

object IdentityReference {
  @scala.inline
  def apply(
    directoryAlias: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    imageUrl: java.lang.String,
    inactive: scala.Boolean,
    isAadIdentity: scala.Boolean,
    isContainer: scala.Boolean,
    name: java.lang.String,
    profileUrl: java.lang.String,
    uniqueName: java.lang.String,
    url: java.lang.String
  ): IdentityReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryAlias")(directoryAlias)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("imageUrl")(imageUrl)
    __obj.updateDynamic("inactive")(inactive)
    __obj.updateDynamic("isAadIdentity")(isAadIdentity)
    __obj.updateDynamic("isContainer")(isContainer)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("profileUrl")(profileUrl)
    __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IdentityReference]
  }
}

