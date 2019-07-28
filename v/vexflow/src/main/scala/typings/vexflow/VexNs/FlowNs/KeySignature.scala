package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeySignature")
@js.native
class KeySignature protected () extends StaveModifier {
  def this(key_spec: String) = this()
  def addAccToStave(stave: Stave, acc: Anon_Line): Unit = js.native
  def addAccToStave(stave: Stave, acc: Anon_Line, next: Anon_Line): Unit = js.native
  def addModifier(stave: Stave): KeySignature = js.native
  def addToStave(stave: Stave): KeySignature = js.native
  def cancelKey(spec: String): KeySignature = js.native
  def convertAccLines(clef: String, `type`: String): Unit = js.native
}

