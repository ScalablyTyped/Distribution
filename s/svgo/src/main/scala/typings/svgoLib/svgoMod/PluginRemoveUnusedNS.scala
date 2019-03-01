package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUnusedNS extends js.Object {
  var removeUnusedNS: scala.Boolean | js.Object
}

object PluginRemoveUnusedNS {
  @scala.inline
  def apply(removeUnusedNS: scala.Boolean | js.Object): PluginRemoveUnusedNS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeUnusedNS")(removeUnusedNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnusedNS]
  }
}

