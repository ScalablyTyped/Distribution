package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveRasterImages extends PluginConfig {
  
  var removeRasterImages: Boolean | js.Object = js.native
}
object PluginRemoveRasterImages {
  
  @scala.inline
  def apply(removeRasterImages: Boolean | js.Object): PluginRemoveRasterImages = {
    val __obj = js.Dynamic.literal(removeRasterImages = removeRasterImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveRasterImages]
  }
  
  @scala.inline
  implicit class PluginRemoveRasterImagesOps[Self <: PluginRemoveRasterImages] (val x: Self) extends AnyVal {
    
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
    def setRemoveRasterImages(value: Boolean | js.Object): Self = this.set("removeRasterImages", value.asInstanceOf[js.Any])
  }
}
