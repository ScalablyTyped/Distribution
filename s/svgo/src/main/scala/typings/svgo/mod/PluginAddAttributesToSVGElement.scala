package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginAddAttributesToSVGElement extends PluginConfig {
  
  var addAttributesToSVGElement: Boolean | js.Object = js.native
}
object PluginAddAttributesToSVGElement {
  
  @scala.inline
  def apply(addAttributesToSVGElement: Boolean | js.Object): PluginAddAttributesToSVGElement = {
    val __obj = js.Dynamic.literal(addAttributesToSVGElement = addAttributesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddAttributesToSVGElement]
  }
  
  @scala.inline
  implicit class PluginAddAttributesToSVGElementOps[Self <: PluginAddAttributesToSVGElement] (val x: Self) extends AnyVal {
    
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
    def setAddAttributesToSVGElement(value: Boolean | js.Object): Self = this.set("addAttributesToSVGElement", value.asInstanceOf[js.Any])
  }
}
