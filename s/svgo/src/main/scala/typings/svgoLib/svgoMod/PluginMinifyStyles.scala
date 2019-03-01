package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMinifyStyles extends js.Object {
  var minifyStyles: scala.Boolean | js.Object
}

object PluginMinifyStyles {
  @scala.inline
  def apply(minifyStyles: scala.Boolean | js.Object): PluginMinifyStyles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("minifyStyles")(minifyStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMinifyStyles]
  }
}

