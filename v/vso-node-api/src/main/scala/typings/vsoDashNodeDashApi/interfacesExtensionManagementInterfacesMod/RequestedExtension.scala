package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestedExtension extends js.Object {
  /**
    * The unique name of the extension
    */
  var extensionName: String
  /**
    * A list of each request for the extension
    */
  var extensionRequests: js.Array[ExtensionRequest]
  /**
    * DisplayName of the publisher that owns the extension being published.
    */
  var publisherDisplayName: String
  /**
    * Represents the Publisher of the requested extension
    */
  var publisherName: String
  /**
    * The total number of requests for an extension
    */
  var requestCount: Double
}

object RequestedExtension {
  @scala.inline
  def apply(
    extensionName: String,
    extensionRequests: js.Array[ExtensionRequest],
    publisherDisplayName: String,
    publisherName: String,
    requestCount: Double
  ): RequestedExtension = {
    val __obj = js.Dynamic.literal(extensionName = extensionName, extensionRequests = extensionRequests, publisherDisplayName = publisherDisplayName, publisherName = publisherName, requestCount = requestCount)
  
    __obj.asInstanceOf[RequestedExtension]
  }
}

