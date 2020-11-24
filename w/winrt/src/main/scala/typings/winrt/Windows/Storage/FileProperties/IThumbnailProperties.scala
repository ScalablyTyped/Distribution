package typings.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThumbnailProperties extends js.Object {
  
  var originalHeight: Double = js.native
  
  var originalWidth: Double = js.native
  
  var returnedSmallerCachedSize: Boolean = js.native
  
  var `type`: ThumbnailType = js.native
}
object IThumbnailProperties {
  
  @scala.inline
  def apply(
    originalHeight: Double,
    originalWidth: Double,
    returnedSmallerCachedSize: Boolean,
    `type`: ThumbnailType
  ): IThumbnailProperties = {
    val __obj = js.Dynamic.literal(originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbnailProperties]
  }
  
  @scala.inline
  implicit class IThumbnailPropertiesOps[Self <: IThumbnailProperties] (val x: Self) extends AnyVal {
    
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
    def setOriginalHeight(value: Double): Self = this.set("originalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalWidth(value: Double): Self = this.set("originalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnedSmallerCachedSize(value: Boolean): Self = this.set("returnedSmallerCachedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ThumbnailType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
