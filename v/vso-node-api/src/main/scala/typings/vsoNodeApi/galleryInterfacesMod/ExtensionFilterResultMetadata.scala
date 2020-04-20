package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFilterResultMetadata extends js.Object {
  /**
    * The metadata items for the category
    */
  var metadataItems: js.Array[MetadataItem]
  /**
    * Defines the category of metadata items
    */
  var metadataType: String
}

object ExtensionFilterResultMetadata {
  @scala.inline
  def apply(metadataItems: js.Array[MetadataItem], metadataType: String): ExtensionFilterResultMetadata = {
    val __obj = js.Dynamic.literal(metadataItems = metadataItems.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResultMetadata]
  }
}

