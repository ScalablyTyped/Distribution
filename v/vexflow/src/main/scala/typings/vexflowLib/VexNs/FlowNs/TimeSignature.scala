package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TimeSignature")
@js.native
class TimeSignature protected () extends StaveModifier {
  def this(timeSpec: java.lang.String) = this()
  def this(timeSpec: java.lang.String, customPadding: scala.Double) = this()
  def addEndModifier(stave: Stave): scala.Unit = js.native
  def addModifier(stave: Stave): scala.Unit = js.native
  def getTimeSig(): vexflowLib.Anon_Glyph = js.native
  def makeTimeSignatureGlyph(topNums: js.Array[scala.Double], botNums: js.Array[scala.Double]): Glyph = js.native
  def parseTimeSpec(timeSpec: java.lang.String): vexflowLib.Anon_Glyph = js.native
}

