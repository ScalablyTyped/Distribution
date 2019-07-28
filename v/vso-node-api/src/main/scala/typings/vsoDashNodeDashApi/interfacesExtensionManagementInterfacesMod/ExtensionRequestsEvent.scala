package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublishedExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestsEvent extends js.Object {
  /**
    * The extension which has been requested
    */
  var extension: PublishedExtension
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
    extension: PublishedExtension,
    host: ExtensionHost,
    links: ExtensionRequestUrls,
    requests: js.Array[ExtensionRequest],
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestsEvent = {
    val __obj = js.Dynamic.literal(extension = extension, host = host, links = links, requests = requests, updateType = updateType)
  
    __obj.asInstanceOf[ExtensionRequestsEvent]
  }
}

