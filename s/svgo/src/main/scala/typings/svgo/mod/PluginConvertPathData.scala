package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertPathData extends PluginConfig {
  var convertPathData: Boolean | js.Object
}

object PluginConvertPathData {
  @scala.inline
  def apply(convertPathData: Boolean | js.Object): PluginConvertPathData = {
    val __obj = js.Dynamic.literal(convertPathData = convertPathData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginConvertPathData]
  }
}

