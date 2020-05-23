package typings.vexflow.Vex.Flow

import typings.vexflow.anon.AccidentalNote
import typings.vexflow.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyManager extends js.Object {
  def getAccidental(key: String): AccidentalNote
  def getKey(): String
  def reset(): KeyManager
  def selectNote(note: String): Change
  def setKey(key: String): KeyManager
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
}

