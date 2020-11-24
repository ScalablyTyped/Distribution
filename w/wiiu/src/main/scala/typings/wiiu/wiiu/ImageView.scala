package typings.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageView extends js.Object {
  
  def end(): Boolean = js.native
  
  def getErrorCode(): Double = js.native
  
  var viewMode: Double = js.native
}
object ImageView {
  
  @scala.inline
  def apply(end: () => Boolean, getErrorCode: () => Double, viewMode: Double): ImageView = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getErrorCode = js.Any.fromFunction0(getErrorCode), viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView]
  }
  
  @scala.inline
  implicit class ImageViewOps[Self <: ImageView] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Boolean): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewMode(value: Double): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
