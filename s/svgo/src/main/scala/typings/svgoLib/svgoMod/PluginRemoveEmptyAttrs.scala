package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveEmptyAttrs extends js.Object {
  var removeEmptyAttrs: scala.Boolean | js.Object
}

object PluginRemoveEmptyAttrs {
  @scala.inline
  def apply(removeEmptyAttrs: scala.Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
}

