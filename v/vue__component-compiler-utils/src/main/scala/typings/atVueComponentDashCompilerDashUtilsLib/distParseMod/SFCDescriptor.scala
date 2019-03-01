package typings
package atVueComponentDashCompilerDashUtilsLib.distParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCDescriptor extends js.Object {
  var customBlocks: js.Array[SFCCustomBlock]
  var script: SFCBlock | scala.Null
  var styles: js.Array[SFCBlock]
  var template: SFCBlock | scala.Null
}

object SFCDescriptor {
  @scala.inline
  def apply(
    customBlocks: js.Array[SFCCustomBlock],
    styles: js.Array[SFCBlock],
    script: SFCBlock = null,
    template: SFCBlock = null
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customBlocks")(customBlocks)
    __obj.updateDynamic("styles")(styles)
    if (script != null) __obj.updateDynamic("script")(script)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[SFCDescriptor]
  }
}

