package typings.vexflow.Vex.Flow

import typings.vexflow.anon.AccidentalNote
import typings.vexflow.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyManager extends js.Object {
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
  implicit class KeyManagerOps[Self <: KeyManager] (val x: Self) extends AnyVal {
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
    def setGetAccidental(value: String => AccidentalNote): Self = this.set("getAccidental", js.Any.fromFunction1(value))
    @scala.inline
    def setGetKey(value: () => String): Self = this.set("getKey", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => KeyManager): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectNote(value: String => Change): Self = this.set("selectNote", js.Any.fromFunction1(value))
    @scala.inline
    def setSetKey(value: String => KeyManager): Self = this.set("setKey", js.Any.fromFunction1(value))
  }
  
}

