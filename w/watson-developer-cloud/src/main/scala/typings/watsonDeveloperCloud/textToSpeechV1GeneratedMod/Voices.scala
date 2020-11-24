package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Voices. */
@js.native
trait Voices extends js.Object {
  
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
  implicit class VoicesOps[Self <: Voices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVoicesVarargs(value: Voice*): Self = this.set("voices", js.Array(value :_*))
    
    @scala.inline
    def setVoices(value: js.Array[Voice]): Self = this.set("voices", value.asInstanceOf[js.Any])
  }
}
