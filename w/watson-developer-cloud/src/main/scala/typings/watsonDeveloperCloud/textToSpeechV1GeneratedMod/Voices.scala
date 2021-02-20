package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Voices. */
@js.native
trait Voices extends StObject {
  
  /** A list of available voices. */
  var voices: js.Array[Voice] = js.native
}
object Voices {
  
  @scala.inline
  def apply(voices: js.Array[Voice]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
  
  @scala.inline
  implicit class VoicesMutableBuilder[Self <: Voices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoices(value: js.Array[Voice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicesVarargs(value: Voice*): Self = StObject.set(x, "voices", js.Array(value :_*))
  }
}
