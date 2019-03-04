package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionIdentifier extends js.Object {
  /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
  var extensionName: java.lang.String
  /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
  var publisherName: java.lang.String
}

object ExtensionIdentifier {
  @scala.inline
  def apply(extensionName: java.lang.String, publisherName: java.lang.String): ExtensionIdentifier = {
    val __obj = js.Dynamic.literal(extensionName = extensionName, publisherName = publisherName)
  
    __obj.asInstanceOf[ExtensionIdentifier]
  }
}

