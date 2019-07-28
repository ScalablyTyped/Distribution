package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionIdentifier extends js.Object {
  /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
  var extensionName: String
  /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
  var publisherName: String
}

object ExtensionIdentifier {
  @scala.inline
  def apply(extensionName: String, publisherName: String): ExtensionIdentifier = {
    val __obj = js.Dynamic.literal(extensionName = extensionName, publisherName = publisherName)
  
    __obj.asInstanceOf[ExtensionIdentifier]
  }
}

