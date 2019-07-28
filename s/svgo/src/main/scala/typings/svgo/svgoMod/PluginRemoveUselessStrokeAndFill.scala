package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUselessStrokeAndFill extends PluginConfig {
  var removeUselessStrokeAndFill: Boolean | js.Object
}

object PluginRemoveUselessStrokeAndFill {
  @scala.inline
  def apply(removeUselessStrokeAndFill: Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal(removeUselessStrokeAndFill = removeUselessStrokeAndFill.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
}

