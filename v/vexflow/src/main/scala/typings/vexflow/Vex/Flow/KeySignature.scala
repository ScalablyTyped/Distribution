package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySignature extends StaveModifier {
  def addAccToStave(stave: Stave, acc: Line): Unit = js.native
  def addAccToStave(stave: Stave, acc: Line, next: Line): Unit = js.native
  def addModifier(stave: Stave): KeySignature = js.native
  def addToStave(stave: Stave): KeySignature = js.native
  def cancelKey(spec: String): KeySignature = js.native
  def convertAccLines(clef: String, `type`: String): Unit = js.native
}

