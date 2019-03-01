package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveRasterImages extends js.Object {
  var removeRasterImages: scala.Boolean | js.Object
}

object PluginRemoveRasterImages {
  @scala.inline
  def apply(removeRasterImages: scala.Boolean | js.Object): PluginRemoveRasterImages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeRasterImages")(removeRasterImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveRasterImages]
  }
}

