package typings.wordpressCustomizeBrowser.croppedImageControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSelectOptions extends js.Object {
  
  var aspectRatio: js.UndefOr[String] = js.native
  
  var handles: Boolean = js.native
  
  var imageHeight: Double = js.native
  
  var imageWidth: Double = js.native
  
  var instance: Boolean = js.native
  
  var keys: Boolean = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var persistent: Boolean = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
object ImageSelectOptions {
  
  @scala.inline
  def apply(
    handles: Boolean,
    imageHeight: Double,
    imageWidth: Double,
    instance: Boolean,
    keys: Boolean,
    persistent: Boolean,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): ImageSelectOptions = {
    val __obj = js.Dynamic.literal(handles = handles.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSelectOptions]
  }
  
  @scala.inline
  implicit class ImageSelectOptionsOps[Self <: ImageSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setHandles(value: Boolean): Self = this.set("handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: Boolean): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
}
