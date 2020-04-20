package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveRasterImages extends PluginConfig {
  var removeRasterImages: Boolean | js.Object
}

object PluginRemoveRasterImages {
  @scala.inline
  def apply(removeRasterImages: Boolean | js.Object): PluginRemoveRasterImages = {
    val __obj = js.Dynamic.literal(removeRasterImages = removeRasterImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveRasterImages]
  }
}

