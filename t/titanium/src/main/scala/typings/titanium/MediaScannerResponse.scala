package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the [scanMediaFiles](Titanium.Media.Android.scanMediaFiles) callback.
  */
@js.native
trait MediaScannerResponse extends StObject {
  
  /**
    * Path to the media file that was scanned.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * URI to the file if it was scanned and added to the media library, or `null`
    * if the file was not added.
    */
  var uri: js.UndefOr[String] = js.native
}
object MediaScannerResponse {
  
  @scala.inline
  def apply(): MediaScannerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaScannerResponse]
  }
  
  @scala.inline
  implicit class MediaScannerResponseMutableBuilder[Self <: MediaScannerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
