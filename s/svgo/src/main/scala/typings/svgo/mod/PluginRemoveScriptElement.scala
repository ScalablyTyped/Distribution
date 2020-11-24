package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveScriptElement extends PluginConfig {
  
  var removeScriptElement: Boolean | js.Object = js.native
}
object PluginRemoveScriptElement {
  
  @scala.inline
  def apply(removeScriptElement: Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
  
  @scala.inline
  implicit class PluginRemoveScriptElementOps[Self <: PluginRemoveScriptElement] (val x: Self) extends AnyVal {
    
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
    def setRemoveScriptElement(value: Boolean | js.Object): Self = this.set("removeScriptElement", value.asInstanceOf[js.Any])
  }
}
