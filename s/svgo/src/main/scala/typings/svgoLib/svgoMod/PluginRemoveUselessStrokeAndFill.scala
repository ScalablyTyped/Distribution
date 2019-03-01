package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUselessStrokeAndFill extends js.Object {
  var removeUselessStrokeAndFill: scala.Boolean | js.Object
}

object PluginRemoveUselessStrokeAndFill {
  @scala.inline
  def apply(removeUselessStrokeAndFill: scala.Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeUselessStrokeAndFill")(removeUselessStrokeAndFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
}

