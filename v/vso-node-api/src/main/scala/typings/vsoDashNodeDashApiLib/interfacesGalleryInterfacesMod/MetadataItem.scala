package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataItem extends js.Object {
  /**
    * The count of the metadata item
    */
  var count: scala.Double
  /**
    * The name of the metadata item
    */
  var name: java.lang.String
}

object MetadataItem {
  @scala.inline
  def apply(count: scala.Double, name: java.lang.String): MetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MetadataItem]
  }
}

