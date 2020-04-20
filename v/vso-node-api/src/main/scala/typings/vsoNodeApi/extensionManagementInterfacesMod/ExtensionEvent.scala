package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvent extends js.Object {
  /**
    * The extension which has been updated
    */
  var extension: PublishedExtension
  /**
    * The current version of the extension that was updated
    */
  var extensionVersion: String
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
  var modifiedBy: IdentityRef
  /**
    * The type of update that was made
    */
  var updateType: ExtensionUpdateType
}

object ExtensionEvent {
  @scala.inline
  def apply(
    extension: PublishedExtension,
    extensionVersion: String,
    host: ExtensionHost,
    links: ExtensionEventUrls,
    modifiedBy: IdentityRef,
    updateType: ExtensionUpdateType
  ): ExtensionEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], extensionVersion = extensionVersion.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
}

