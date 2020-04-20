package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginReusePaths extends PluginConfig {
  var reusePaths: Boolean | js.Object
}

object PluginReusePaths {
  @scala.inline
  def apply(reusePaths: Boolean | js.Object): PluginReusePaths = {
    val __obj = js.Dynamic.literal(reusePaths = reusePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginReusePaths]
  }
}

