package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveElementsByAttr extends PluginConfig {
  
  var removeElementsByAttr: Boolean | js.Object = js.native
}
object PluginRemoveElementsByAttr {
  
  @scala.inline
  def apply(removeElementsByAttr: Boolean | js.Object): PluginRemoveElementsByAttr = {
    val __obj = js.Dynamic.literal(removeElementsByAttr = removeElementsByAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveElementsByAttr]
  }
  
  @scala.inline
  implicit class PluginRemoveElementsByAttrOps[Self <: PluginRemoveElementsByAttr] (val x: Self) extends AnyVal {
    
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
    def setRemoveElementsByAttr(value: Boolean | js.Object): Self = this.set("removeElementsByAttr", value.asInstanceOf[js.Any])
  }
}
