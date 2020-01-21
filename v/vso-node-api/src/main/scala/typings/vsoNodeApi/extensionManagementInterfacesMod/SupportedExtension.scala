package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedExtension extends js.Object {
  /**
    * Unique Identifier for this extension
    */
  var extension: String
  /**
    * Unique Identifier for this publisher
    */
  var publisher: String
  /**
    * Supported version for this extension
    */
  var version: String
}

object SupportedExtension {
  @scala.inline
  def apply(extension: String, publisher: String, version: String): SupportedExtension = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportedExtension]
  }
}

