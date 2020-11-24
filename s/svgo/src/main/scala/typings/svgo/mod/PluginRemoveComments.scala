package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveComments extends PluginConfig {
  
  var removeComments: Boolean | js.Object = js.native
}
object PluginRemoveComments {
  
  @scala.inline
  def apply(removeComments: Boolean | js.Object): PluginRemoveComments = {
    val __obj = js.Dynamic.literal(removeComments = removeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveComments]
  }
  
  @scala.inline
  implicit class PluginRemoveCommentsOps[Self <: PluginRemoveComments] (val x: Self) extends AnyVal {
    
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
    def setRemoveComments(value: Boolean | js.Object): Self = this.set("removeComments", value.asInstanceOf[js.Any])
  }
}
