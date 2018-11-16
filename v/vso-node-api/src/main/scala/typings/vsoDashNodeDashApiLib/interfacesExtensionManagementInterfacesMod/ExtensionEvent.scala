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

