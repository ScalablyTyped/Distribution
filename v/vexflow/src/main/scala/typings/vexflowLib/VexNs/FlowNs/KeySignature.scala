package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeySignature")
@js.native
class KeySignature protected () extends StaveModifier {
  def this(key_spec: java.lang.String) = this()
  def addAccToStave(stave: Stave, acc: vexflowLib.Anon_Line): scala.Unit = js.native
  def addAccToStave(stave: Stave, acc: vexflowLib.Anon_Line, next: vexflowLib.Anon_Line): scala.Unit = js.native
  def addModifier(stave: Stave): KeySignature = js.native
  def addToStave(stave: Stave): KeySignature = js.native
  def cancelKey(spec: java.lang.String): KeySignature = js.native
  def convertAccLines(clef: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
}

