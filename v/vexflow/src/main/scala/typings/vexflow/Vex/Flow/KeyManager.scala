package typings.vexflow.Vex.Flow

import typings.vexflow.anon.AccidentalNote
import typings.vexflow.anon.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyManager extends StObject {
  
  def getAccidental(key: String): AccidentalNote = js.native
  
  def getKey(): String = js.native
  
  def reset(): KeyManager = js.native
  
  def selectNote(note: String): Change = js.native
  
  def setKey(key: String): KeyManager = js.native
}
object KeyManager {
  
  @scala.inline
  def apply(
    getAccidental: String => AccidentalNote,
    getKey: () => String,
    reset: () => KeyManager,
    selectNote: String => Change,
    setKey: String => KeyManager
  ): KeyManager = {
    val __obj = js.Dynamic.literal(getAccidental = js.Any.fromFunction1(getAccidental), getKey = js.Any.fromFunction0(getKey), reset = js.Any.fromFunction0(reset), selectNote = js.Any.fromFunction1(selectNote), setKey = js.Any.fromFunction1(setKey))
    __obj.asInstanceOf[KeyManager]
  }
  
  @scala.inline
  implicit class KeyManagerMutableBuilder[Self <: KeyManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAccidental(value: String => AccidentalNote): Self = StObject.set(x, "getAccidental", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKey(value: () => String): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => KeyManager): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectNote(value: String => Change): Self = StObject.set(x, "selectNote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKey(value: String => KeyManager): Self = StObject.set(x, "setKey", js.Any.fromFunction1(value))
  }
}
