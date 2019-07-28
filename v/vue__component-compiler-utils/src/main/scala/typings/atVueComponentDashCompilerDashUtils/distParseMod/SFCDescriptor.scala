package typings.atVueComponentDashCompilerDashUtils.distParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCDescriptor extends js.Object {
  var customBlocks: js.Array[SFCCustomBlock]
  var script: SFCBlock | Null
  var styles: js.Array[SFCBlock]
  var template: SFCBlock | Null
}

object SFCDescriptor {
  @scala.inline
  def apply(
    customBlocks: js.Array[SFCCustomBlock],
    styles: js.Array[SFCBlock],
    script: SFCBlock = null,
    template: SFCBlock = null
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks, styles = styles)
    if (script != null) __obj.updateDynamic("script")(script)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[SFCDescriptor]
  }
}

