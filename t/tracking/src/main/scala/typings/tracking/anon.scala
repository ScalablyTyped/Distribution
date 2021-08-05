package typings.tracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: js.UndefOr[Boolean] = js.undefined
    
    var camera: js.UndefOr[Boolean] = js.undefined
  }
  object Audio {
    
    inline def apply(): Audio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    }
  }
}
