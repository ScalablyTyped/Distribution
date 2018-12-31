package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestedExtension extends js.Object {
  /**
    * The unique name of the extension
    */
  var extensionName: java.lang.String
  /**
    * A list of each request for the extension
    */
  var extensionRequests: js.Array[ExtensionRequest]
  /**
    * DisplayName of the publisher that owns the extension being published.
    */
  var publisherDisplayName: java.lang.String
  /**
    * Represents the Publisher of the requested extension
    */
  var publisherName: java.lang.String
  /**
    * The total number of requests for an extension
    */
  var requestCount: scala.Double
}

