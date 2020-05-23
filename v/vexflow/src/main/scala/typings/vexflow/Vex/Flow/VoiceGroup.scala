package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceGroup extends js.Object {
  def addVoice(voice: Voice): Unit
  def getModifierContexts(): js.Array[ModifierContext]
  def getVoices(): js.Array[Voice]
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
}

