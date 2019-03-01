package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestEvent extends js.Object {
  /**
    * The extension which has been requested
    */
  var extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost
  /**
    * Name of the collection for which the extension was requested
    */
  var hostName: java.lang.String
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls
  /**
    * The extension request object
    */
  var request: ExtensionRequest
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType
}

object ExtensionRequestEvent {
  @scala.inline
  def apply(
    extension: vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtension,
    host: ExtensionHost,
    hostName: java.lang.String,
    links: ExtensionRequestUrls,
    request: ExtensionRequest,
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("hostName")(hostName)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("updateType")(updateType)
    __obj.asInstanceOf[ExtensionRequestEvent]
  }
}

