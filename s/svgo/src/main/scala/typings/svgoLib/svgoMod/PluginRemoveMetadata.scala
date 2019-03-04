package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveMetadata extends js.Object {
  var removeMetadata: scala.Boolean | js.Object
}

object PluginRemoveMetadata {
  @scala.inline
  def apply(removeMetadata: scala.Boolean | js.Object): PluginRemoveMetadata = {
    val __obj = js.Dynamic.literal(removeMetadata = removeMetadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveMetadata]
  }
}

