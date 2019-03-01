package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupAttrs extends js.Object {
  var cleanupAttrs: scala.Boolean | js.Object
}

object PluginCleanupAttrs {
  @scala.inline
  def apply(cleanupAttrs: scala.Boolean | js.Object): PluginCleanupAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanupAttrs")(cleanupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupAttrs]
  }
}

