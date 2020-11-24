package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveUselessStrokeAndFill extends PluginConfig {
  
  var removeUselessStrokeAndFill: Boolean | js.Object = js.native
}
object PluginRemoveUselessStrokeAndFill {
  
  @scala.inline
  def apply(removeUselessStrokeAndFill: Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal(removeUselessStrokeAndFill = removeUselessStrokeAndFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
  
  @scala.inline
  implicit class PluginRemoveUselessStrokeAndFillOps[Self <: PluginRemoveUselessStrokeAndFill] (val x: Self) extends AnyVal {
    
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
    def setRemoveUselessStrokeAndFill(value: Boolean | js.Object): Self = this.set("removeUselessStrokeAndFill", value.asInstanceOf[js.Any])
  }
}
