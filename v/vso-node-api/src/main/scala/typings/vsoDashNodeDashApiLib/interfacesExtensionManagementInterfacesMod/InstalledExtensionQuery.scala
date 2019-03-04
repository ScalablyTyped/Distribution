package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtensionQuery extends js.Object {
  var assetTypes: js.Array[java.lang.String]
  var monikers: js.Array[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionIdentifier]
}

object InstalledExtensionQuery {
  @scala.inline
  def apply(
    assetTypes: js.Array[java.lang.String],
    monikers: js.Array[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionIdentifier]
  ): InstalledExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes, monikers = monikers)
  
    __obj.asInstanceOf[InstalledExtensionQuery]
  }
}

