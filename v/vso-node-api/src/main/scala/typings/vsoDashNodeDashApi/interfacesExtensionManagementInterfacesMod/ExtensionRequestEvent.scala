package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublishedExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestEvent extends js.Object {
  /**
    * The extension which has been requested
    */
  var extension: PublishedExtension
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost
  /**
    * Name of the collection for which the extension was requested
    */
  var hostName: String
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
    extension: PublishedExtension,
    host: ExtensionHost,
    hostName: String,
    links: ExtensionRequestUrls,
    request: ExtensionRequest,
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionRequestEvent]
  }
}

