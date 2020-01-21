package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.AnonCodeLine
import typings.vexflow.AnonGlyph
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
  def getTimeSig(): AnonGlyph = js.native
  def makeTimeSignatureGlyph(topNums: js.Array[Double], botNums: js.Array[Double]): Glyph = js.native
  def parseTimeSpec(timeSpec: String): AnonGlyph = js.native
}

@JSGlobal("Vex.Flow.TimeSignature")
@js.native
object TimeSignature extends js.Object {
  @js.native
  object glyphs extends /* name */ StringDictionary[AnonCodeLine]
  
}

