package typings.titanium

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.Media.takeScreenshot> callback.
  */
@js.native
trait ScreenshotResult extends js.Object {
  
  /**
    * The screenshot image.
    */
  var media: js.UndefOr[Blob] = js.native
}
object ScreenshotResult {
  
  @scala.inline
  def apply(): ScreenshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotResult]
  }
  
  @scala.inline
  implicit class ScreenshotResultOps[Self <: ScreenshotResult] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: Blob): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
}
