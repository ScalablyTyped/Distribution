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

