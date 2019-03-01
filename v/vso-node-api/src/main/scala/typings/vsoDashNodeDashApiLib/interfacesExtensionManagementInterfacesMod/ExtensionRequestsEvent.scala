package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestsEvent extends js.Object {
  /**
    * The extension which has been requested
    */
  var extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls
  /**
    * The extension request object
    */
  var requests: js.Array[ExtensionRequest]
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType
}

object ExtensionRequestsEvent {
  @scala.inline
  def apply(
    extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension,
    host: ExtensionHost,
    links: ExtensionRequestUrls,
    requests: js.Array[ExtensionRequest],
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("requests")(requests)
    __obj.updateDynamic("updateType")(updateType)
    __obj.asInstanceOf[ExtensionRequestsEvent]
  }
}

