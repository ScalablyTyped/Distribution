package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_AccidentalChange
import typings.vexflow.Anon_AccidentalNote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeyManager")
@js.native
class KeyManager protected () extends js.Object {
  def this(key: String) = this()
  def getAccidental(key: String): Anon_AccidentalNote = js.native
  def getKey(): String = js.native
  def reset(): KeyManager = js.native
  def selectNote(note: String): Anon_AccidentalChange = js.native
  def setKey(key: String): KeyManager = js.native
}

