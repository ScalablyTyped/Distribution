package typings.vexflow.Vex.Flow

import typings.vexflow.AnonAccidentalChange
import typings.vexflow.AnonAccidentalNote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeyManager")
@js.native
class KeyManager protected () extends js.Object {
  def this(key: String) = this()
  def getAccidental(key: String): AnonAccidentalNote = js.native
  def getKey(): String = js.native
  def reset(): KeyManager = js.native
  def selectNote(note: String): AnonAccidentalChange = js.native
  def setKey(key: String): KeyManager = js.native
}

