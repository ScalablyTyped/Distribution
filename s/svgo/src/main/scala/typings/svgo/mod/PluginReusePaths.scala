package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginReusePaths extends PluginConfig {
  
  var reusePaths: Boolean | js.Object = js.native
}
object PluginReusePaths {
  
  @scala.inline
  def apply(reusePaths: Boolean | js.Object): PluginReusePaths = {
    val __obj = js.Dynamic.literal(reusePaths = reusePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginReusePaths]
  }
  
  @scala.inline
  implicit class PluginReusePathsOps[Self <: PluginReusePaths] (val x: Self) extends AnyVal {
    
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
    def setReusePaths(value: Boolean | js.Object): Self = this.set("reusePaths", value.asInstanceOf[js.Any])
  }
}
