package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEmptyAttrs extends PluginConfig {
  
  var removeEmptyAttrs: Boolean | js.Object = js.native
}
object PluginRemoveEmptyAttrs {
  
  @scala.inline
  def apply(removeEmptyAttrs: Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
  
  @scala.inline
  implicit class PluginRemoveEmptyAttrsOps[Self <: PluginRemoveEmptyAttrs] (val x: Self) extends AnyVal {
    
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
    def setRemoveEmptyAttrs(value: Boolean | js.Object): Self = this.set("removeEmptyAttrs", value.asInstanceOf[js.Any])
  }
}
