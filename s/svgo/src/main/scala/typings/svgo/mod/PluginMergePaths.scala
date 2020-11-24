package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMergePaths extends PluginConfig {
  
  var mergePaths: Boolean | js.Object = js.native
}
object PluginMergePaths {
  
  @scala.inline
  def apply(mergePaths: Boolean | js.Object): PluginMergePaths = {
    val __obj = js.Dynamic.literal(mergePaths = mergePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMergePaths]
  }
  
  @scala.inline
  implicit class PluginMergePathsOps[Self <: PluginMergePaths] (val x: Self) extends AnyVal {
    
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
    def setMergePaths(value: Boolean | js.Object): Self = this.set("mergePaths", value.asInstanceOf[js.Any])
  }
}
