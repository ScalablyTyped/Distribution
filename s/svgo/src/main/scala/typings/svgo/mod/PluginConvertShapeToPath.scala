package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConvertShapeToPath extends PluginConfig {
  
  var convertShapeToPath: Boolean | js.Object = js.native
}
object PluginConvertShapeToPath {
  
  @scala.inline
  def apply(convertShapeToPath: Boolean | js.Object): PluginConvertShapeToPath = {
    val __obj = js.Dynamic.literal(convertShapeToPath = convertShapeToPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertShapeToPath]
  }
  
  @scala.inline
  implicit class PluginConvertShapeToPathOps[Self <: PluginConvertShapeToPath] (val x: Self) extends AnyVal {
    
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
    def setConvertShapeToPath(value: Boolean | js.Object): Self = this.set("convertShapeToPath", value.asInstanceOf[js.Any])
  }
}
