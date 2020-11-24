package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenshotOptions extends js.Object {
  
  /** returns the page screenshot at the Document Complete point (i.e.: when window.onload was fired) */
  var documentComplete: js.UndefOr[Boolean] = js.native
  
  /** returns the full resolution screenshot in PNG format if available */
  var fullResolution: js.UndefOr[Boolean] = js.native
  
  /** returns the page screenshot at the Start Render point (i.e.: when something was first displayed on screen) */
  var startRender: js.UndefOr[Boolean] = js.native
}
object ScreenshotOptions {
  
  @scala.inline
  def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit class ScreenshotOptionsOps[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
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
    def setDocumentComplete(value: Boolean): Self = this.set("documentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentComplete: Self = this.set("documentComplete", js.undefined)
    
    @scala.inline
    def setFullResolution(value: Boolean): Self = this.set("fullResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullResolution: Self = this.set("fullResolution", js.undefined)
    
    @scala.inline
    def setStartRender(value: Boolean): Self = this.set("startRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRender: Self = this.set("startRender", js.undefined)
  }
}
