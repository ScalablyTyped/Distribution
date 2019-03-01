package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMergePaths extends js.Object {
  var mergePaths: scala.Boolean | js.Object
}

object PluginMergePaths {
  @scala.inline
  def apply(mergePaths: scala.Boolean | js.Object): PluginMergePaths = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mergePaths")(mergePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMergePaths]
  }
}

