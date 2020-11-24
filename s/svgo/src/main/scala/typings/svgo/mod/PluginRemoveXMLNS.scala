package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveXMLNS extends PluginConfig {
  
  var removeXMLNS: Boolean | js.Object = js.native
}
object PluginRemoveXMLNS {
  
  @scala.inline
  def apply(removeXMLNS: Boolean | js.Object): PluginRemoveXMLNS = {
    val __obj = js.Dynamic.literal(removeXMLNS = removeXMLNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLNS]
  }
  
  @scala.inline
  implicit class PluginRemoveXMLNSOps[Self <: PluginRemoveXMLNS] (val x: Self) extends AnyVal {
    
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
    def setRemoveXMLNS(value: Boolean | js.Object): Self = this.set("removeXMLNS", value.asInstanceOf[js.Any])
  }
}
