package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
class StaveModifier () extends js.Object {
  def addEndModifier(): scala.Unit = js.native
  def addModifier(): scala.Unit = js.native
  def addToStave(stave: Stave, firstGlyph: scala.Boolean): StaveModifier = js.native
  def addToStaveEnd(stave: Stave, firstGlyph: scala.Boolean): StaveModifier = js.native
  def getCategory(): java.lang.String = js.native
  def makeSpacer(padding: scala.Double): vexflowLib.Anon_SetStave = js.native
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: scala.Double): scala.Unit = js.native
  def setPadding(padding: scala.Double): scala.Unit = js.native
}

