package typings.titanium

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the thumbnail callback in response to the
  * [requestThumbnailImagesAtTimes](Titanium.Media.VideoPlayer.requestThumbnailImagesAtTimes)
  * method.
  */
@js.native
trait ThumbnailResponse extends ErrorResponse {
  
  /**
    * Thumbnail image, as a `Blob`.
    */
  var image: js.UndefOr[Blob] = js.native
  
  /**
    * Time offset for the thumbnail, in seconds.
    */
  var time: js.UndefOr[Double] = js.native
}
object ThumbnailResponse {
  
  @scala.inline
  def apply(): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailResponse]
  }
  
  @scala.inline
  implicit class ThumbnailResponseMutableBuilder[Self <: ThumbnailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Blob): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
