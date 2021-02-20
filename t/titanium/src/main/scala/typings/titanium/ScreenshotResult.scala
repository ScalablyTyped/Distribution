package typings.titanium

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.Media.takeScreenshot> callback.
  */
@js.native
trait ScreenshotResult extends StObject {
  
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
  implicit class ScreenshotResultMutableBuilder[Self <: ScreenshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: Blob): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
