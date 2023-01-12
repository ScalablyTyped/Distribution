package typings.wegameApi.anon

import typings.wegameApi.wx.types.AudioSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSources extends StObject {
  
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[AudioSourceType]
}
object AudioSources {
  
  inline def apply(audioSources: js.Array[AudioSourceType]): AudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioSources] (val x: Self) extends AnyVal {
    
    inline def setAudioSources(value: js.Array[AudioSourceType]): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
    
    inline def setAudioSourcesVarargs(value: AudioSourceType*): Self = StObject.set(x, "audioSources", js.Array(value*))
  }
}
