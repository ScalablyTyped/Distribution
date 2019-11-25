package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtensionQuery extends js.Object {
  var assetTypes: js.Array[String]
  var monikers: js.Array[ExtensionIdentifier]
}

object InstalledExtensionQuery {
  @scala.inline
  def apply(assetTypes: js.Array[String], monikers: js.Array[ExtensionIdentifier]): InstalledExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes.asInstanceOf[js.Any], monikers = monikers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstalledExtensionQuery]
  }
}

