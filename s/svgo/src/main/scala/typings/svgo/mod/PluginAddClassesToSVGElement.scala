package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginAddClassesToSVGElement extends PluginConfig {
  
  var addClassesToSVGElement: Boolean | js.Object = js.native
}
object PluginAddClassesToSVGElement {
  
  @scala.inline
  def apply(addClassesToSVGElement: Boolean | js.Object): PluginAddClassesToSVGElement = {
    val __obj = js.Dynamic.literal(addClassesToSVGElement = addClassesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddClassesToSVGElement]
  }
  
  @scala.inline
  implicit class PluginAddClassesToSVGElementOps[Self <: PluginAddClassesToSVGElement] (val x: Self) extends AnyVal {
    
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
    def setAddClassesToSVGElement(value: Boolean | js.Object): Self = this.set("addClassesToSVGElement", value.asInstanceOf[js.Any])
  }
}
