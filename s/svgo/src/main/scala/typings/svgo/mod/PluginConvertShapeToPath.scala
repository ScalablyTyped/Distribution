package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertShapeToPath extends PluginConfig {
  var convertShapeToPath: Boolean | js.Object
}

object PluginConvertShapeToPath {
  @scala.inline
  def apply(convertShapeToPath: Boolean | js.Object): PluginConvertShapeToPath = {
    val __obj = js.Dynamic.literal(convertShapeToPath = convertShapeToPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginConvertShapeToPath]
  }
}

