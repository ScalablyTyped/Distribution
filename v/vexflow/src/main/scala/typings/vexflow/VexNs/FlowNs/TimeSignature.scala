package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Glyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TimeSignature")
@js.native
class TimeSignature protected () extends StaveModifier {
  def this(timeSpec: String) = this()
  def this(timeSpec: String, customPadding: Double) = this()
  def addEndModifier(stave: Stave): Unit = js.native
  def addModifier(stave: Stave): Unit = js.native
  def getTimeSig(): Anon_Glyph = js.native
  def makeTimeSignatureGlyph(topNums: js.Array[Double], botNums: js.Array[Double]): Glyph = js.native
  def parseTimeSpec(timeSpec: String): Anon_Glyph = js.native
}

