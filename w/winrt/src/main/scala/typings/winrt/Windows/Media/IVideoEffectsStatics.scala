package typings.winrt.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVideoEffectsStatics extends StObject {
  
  var videoStabilization: String
}
object IVideoEffectsStatics {
  
  inline def apply(videoStabilization: String): IVideoEffectsStatics = {
    val __obj = js.Dynamic.literal(videoStabilization = videoStabilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEffectsStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVideoEffectsStatics] (val x: Self) extends AnyVal {
    
    inline def setVideoStabilization(value: String): Self = StObject.set(x, "videoStabilization", value.asInstanceOf[js.Any])
  }
}
