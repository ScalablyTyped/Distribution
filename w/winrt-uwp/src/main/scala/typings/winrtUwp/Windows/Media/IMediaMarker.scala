package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a marker at specific location in a media stream time-line. */
@js.native
trait IMediaMarker extends StObject {
  
  /** Gets the type of the media marker. */
  var mediaMarkerType: String = js.native
  
  /** Gets the text associated with the marker. */
  var text: String = js.native
  
  /** Gets the offset in the media time-line that the marker occurs. */
  var time: Double = js.native
}
object IMediaMarker {
  
  @scala.inline
  def apply(mediaMarkerType: String, text: String, time: Double): IMediaMarker = {
    val __obj = js.Dynamic.literal(mediaMarkerType = mediaMarkerType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaMarker]
  }
  
  @scala.inline
  implicit class IMediaMarkerMutableBuilder[Self <: IMediaMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaMarkerType(value: String): Self = StObject.set(x, "mediaMarkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
