package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveStyleElement extends PluginConfig {
  
  var removeStyleElement: Boolean | js.Object = js.native
}
object PluginRemoveStyleElement {
  
  @scala.inline
  def apply(removeStyleElement: Boolean | js.Object): PluginRemoveStyleElement = {
    val __obj = js.Dynamic.literal(removeStyleElement = removeStyleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveStyleElement]
  }
  
  @scala.inline
  implicit class PluginRemoveStyleElementOps[Self <: PluginRemoveStyleElement] (val x: Self) extends AnyVal {
    
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
    def setRemoveStyleElement(value: Boolean | js.Object): Self = this.set("removeStyleElement", value.asInstanceOf[js.Any])
  }
}
