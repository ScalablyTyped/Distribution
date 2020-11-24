package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceGroup extends js.Object {
  
  def addVoice(voice: Voice): Unit = js.native
  
  def getModifierContexts(): js.Array[ModifierContext] = js.native
  
  def getVoices(): js.Array[Voice] = js.native
}
object VoiceGroup {
  
  @scala.inline
  def apply(
    addVoice: Voice => Unit,
    getModifierContexts: () => js.Array[ModifierContext],
    getVoices: () => js.Array[Voice]
  ): VoiceGroup = {
    val __obj = js.Dynamic.literal(addVoice = js.Any.fromFunction1(addVoice), getModifierContexts = js.Any.fromFunction0(getModifierContexts), getVoices = js.Any.fromFunction0(getVoices))
    __obj.asInstanceOf[VoiceGroup]
  }
  
  @scala.inline
  implicit class VoiceGroupOps[Self <: VoiceGroup] (val x: Self) extends AnyVal {
    
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
    def setAddVoice(value: Voice => Unit): Self = this.set("addVoice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModifierContexts(value: () => js.Array[ModifierContext]): Self = this.set("getModifierContexts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVoices(value: () => js.Array[Voice]): Self = this.set("getVoices", js.Any.fromFunction0(value))
  }
}
