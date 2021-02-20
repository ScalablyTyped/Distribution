package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamType extends StObject {
  
  /** The stream identifier for the media stream. */ var returnValue: Double = js.native
  
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType = js.native
}
object StreamType {
  
  @scala.inline
  def apply(returnValue: Double, streamType: NDMediaStreamType): StreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  @scala.inline
  implicit class StreamTypeMutableBuilder[Self <: StreamType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamType(value: NDMediaStreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
  }
}
