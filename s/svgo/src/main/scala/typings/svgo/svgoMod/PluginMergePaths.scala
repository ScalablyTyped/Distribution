package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMergePaths extends PluginConfig {
  var mergePaths: Boolean | js.Object
}

object PluginMergePaths {
  @scala.inline
  def apply(mergePaths: Boolean | js.Object): PluginMergePaths = {
    val __obj = js.Dynamic.literal(mergePaths = mergePaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMergePaths]
  }
}

