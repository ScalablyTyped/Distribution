package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataItem extends js.Object {
  /**
    * The count of the metadata item
    */
  var count: Double
  /**
    * The name of the metadata item
    */
  var name: String
}

object MetadataItem {
  @scala.inline
  def apply(count: Double, name: String): MetadataItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataItem]
  }
}

