package typings.winrt.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVideoEffectsStatics extends StObject {
  
  var videoStabilization: String = js.native
}
object IVideoEffectsStatics {
  
  @scala.inline
  def apply(videoStabilization: String): IVideoEffectsStatics = {
    val __obj = js.Dynamic.literal(videoStabilization = videoStabilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEffectsStatics]
  }
  
  @scala.inline
  implicit class IVideoEffectsStaticsMutableBuilder[Self <: IVideoEffectsStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoStabilization(value: String): Self = StObject.set(x, "videoStabilization", value.asInstanceOf[js.Any])
  }
}
