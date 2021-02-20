package typings.tracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Audio extends StObject {
    
    var audio: js.UndefOr[Boolean] = js.native
    
    var camera: js.UndefOr[Boolean] = js.native
  }
  object Audio {
    
    @scala.inline
    def apply(): Audio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    }
  }
}
