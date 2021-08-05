package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamType extends StObject {
  
  /** The stream identifier for the media stream. */ var returnValue: Double
  
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType
}
object StreamType {
  
  inline def apply(returnValue: Double, streamType: NDMediaStreamType): StreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  extension [Self <: StreamType](x: Self) {
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setStreamType(value: NDMediaStreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
  }
}
