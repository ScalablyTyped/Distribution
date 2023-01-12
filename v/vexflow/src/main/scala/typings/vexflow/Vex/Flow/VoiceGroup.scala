package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceGroup extends StObject {
  
  def addVoice(voice: Voice): Unit
  
  def getModifierContexts(): js.Array[ModifierContext]
  
  def getVoices(): js.Array[Voice]
}
object VoiceGroup {
  
  inline def apply(
    addVoice: Voice => Unit,
    getModifierContexts: () => js.Array[ModifierContext],
    getVoices: () => js.Array[Voice]
  ): VoiceGroup = {
    val __obj = js.Dynamic.literal(addVoice = js.Any.fromFunction1(addVoice), getModifierContexts = js.Any.fromFunction0(getModifierContexts), getVoices = js.Any.fromFunction0(getVoices))
    __obj.asInstanceOf[VoiceGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceGroup] (val x: Self) extends AnyVal {
    
    inline def setAddVoice(value: Voice => Unit): Self = StObject.set(x, "addVoice", js.Any.fromFunction1(value))
    
    inline def setGetModifierContexts(value: () => js.Array[ModifierContext]): Self = StObject.set(x, "getModifierContexts", js.Any.fromFunction0(value))
    
    inline def setGetVoices(value: () => js.Array[Voice]): Self = StObject.set(x, "getVoices", js.Any.fromFunction0(value))
  }
}
