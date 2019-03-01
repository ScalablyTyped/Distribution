package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupNumericValues extends js.Object {
  var cleanupNumericValues: scala.Boolean | js.Object
}

object PluginCleanupNumericValues {
  @scala.inline
  def apply(cleanupNumericValues: scala.Boolean | js.Object): PluginCleanupNumericValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanupNumericValues")(cleanupNumericValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupNumericValues]
  }
}

