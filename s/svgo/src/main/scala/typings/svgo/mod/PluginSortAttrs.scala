package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSortAttrs extends PluginConfig {
  var sortAttrs: Boolean | js.Object = js.native
}

object PluginSortAttrs {
  @scala.inline
  def apply(sortAttrs: Boolean | js.Object): PluginSortAttrs = {
    val __obj = js.Dynamic.literal(sortAttrs = sortAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSortAttrs]
  }
  @scala.inline
  implicit class PluginSortAttrsOps[Self <: PluginSortAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSortAttrs(value: Boolean | js.Object): Self = this.set("sortAttrs", value.asInstanceOf[js.Any])
  }
  
}

