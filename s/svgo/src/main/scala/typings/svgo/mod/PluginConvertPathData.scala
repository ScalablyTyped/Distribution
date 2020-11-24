package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConvertPathData extends PluginConfig {
  
  var convertPathData: Boolean | js.Object = js.native
}
object PluginConvertPathData {
  
  @scala.inline
  def apply(convertPathData: Boolean | js.Object): PluginConvertPathData = {
    val __obj = js.Dynamic.literal(convertPathData = convertPathData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertPathData]
  }
  
  @scala.inline
  implicit class PluginConvertPathDataOps[Self <: PluginConvertPathData] (val x: Self) extends AnyVal {
    
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
    def setConvertPathData(value: Boolean | js.Object): Self = this.set("convertPathData", value.asInstanceOf[js.Any])
  }
}
