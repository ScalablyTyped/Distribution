package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvent extends js.Object {
  /**
    * The extension which has been updated
    */
  var extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension
  /**
    * The current version of the extension that was updated
    */
  var extensionVersion: java.lang.String
  /**
    * Name of the collection for which the extension was requested
    */
  var host: ExtensionHost
  /**
    * Gallery host url
    */
  var links: ExtensionEventUrls
  /**
    * Represents the user who initiated the update
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The type of update that was made
    */
  var updateType: ExtensionUpdateType
}

object ExtensionEvent {
  @scala.inline
  def apply(
    extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension,
    extensionVersion: java.lang.String,
    host: ExtensionHost,
    links: ExtensionEventUrls,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    updateType: ExtensionUpdateType
  ): ExtensionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("extensionVersion")(extensionVersion)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("modifiedBy")(modifiedBy)
    __obj.updateDynamic("updateType")(updateType)
    __obj.asInstanceOf[ExtensionEvent]
  }
}

