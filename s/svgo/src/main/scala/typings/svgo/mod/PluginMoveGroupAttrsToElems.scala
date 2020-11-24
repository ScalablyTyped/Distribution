package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMoveGroupAttrsToElems extends PluginConfig {
  
  var moveGroupAttrsToElems: Boolean | js.Object = js.native
}
object PluginMoveGroupAttrsToElems {
  
  @scala.inline
  def apply(moveGroupAttrsToElems: Boolean | js.Object): PluginMoveGroupAttrsToElems = {
    val __obj = js.Dynamic.literal(moveGroupAttrsToElems = moveGroupAttrsToElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveGroupAttrsToElems]
  }
  
  @scala.inline
  implicit class PluginMoveGroupAttrsToElemsOps[Self <: PluginMoveGroupAttrsToElems] (val x: Self) extends AnyVal {
    
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
    def setMoveGroupAttrsToElems(value: Boolean | js.Object): Self = this.set("moveGroupAttrsToElems", value.asInstanceOf[js.Any])
  }
}
