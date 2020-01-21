package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeySignature")
@js.native
class KeySignature_ protected () extends StaveModifier {
  def this(key_spec: String) = this()
  def addAccToStave(stave: Stave, acc: AnonLine): Unit = js.native
  def addAccToStave(stave: Stave, acc: AnonLine, next: AnonLine): Unit = js.native
  def addModifier(stave: Stave): KeySignature_ = js.native
  def addToStave(stave: Stave): KeySignature_ = js.native
  def cancelKey(spec: String): KeySignature_ = js.native
  def convertAccLines(clef: String, `type`: String): Unit = js.native
}

