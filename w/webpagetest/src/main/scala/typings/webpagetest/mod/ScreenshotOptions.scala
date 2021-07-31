package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOptions extends StObject {
  
  /** returns the page screenshot at the Document Complete point (i.e.: when window.onload was fired) */
  var documentComplete: js.UndefOr[Boolean] = js.undefined
  
  /** returns the full resolution screenshot in PNG format if available */
  var fullResolution: js.UndefOr[Boolean] = js.undefined
  
  /** returns the page screenshot at the Start Render point (i.e.: when something was first displayed on screen) */
  var startRender: js.UndefOr[Boolean] = js.undefined
}
object ScreenshotOptions {
  
  @scala.inline
  def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit class ScreenshotOptionsMutableBuilder[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentComplete(value: Boolean): Self = StObject.set(x, "documentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentCompleteUndefined: Self = StObject.set(x, "documentComplete", js.undefined)
    
    @scala.inline
    def setFullResolution(value: Boolean): Self = StObject.set(x, "fullResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResolutionUndefined: Self = StObject.set(x, "fullResolution", js.undefined)
    
    @scala.inline
    def setStartRender(value: Boolean): Self = StObject.set(x, "startRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRenderUndefined: Self = StObject.set(x, "startRender", js.undefined)
  }
}
