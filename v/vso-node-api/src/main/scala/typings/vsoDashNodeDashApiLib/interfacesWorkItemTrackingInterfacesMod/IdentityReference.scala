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
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, name = name, profileUrl = profileUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[IdentityReference]
  }
}

