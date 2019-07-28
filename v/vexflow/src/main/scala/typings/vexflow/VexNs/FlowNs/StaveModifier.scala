package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
class StaveModifier () extends js.Object {
  def addEndModifier(): Unit = js.native
  def addModifier(): Unit = js.native
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def getCategory(): String = js.native
  def getPadding(index: Double): Double = js.native
  def getPosition(): Double = js.native
  def getWidth(): Double = js.native
  def makeSpacer(padding: Double): Anon_GetContext = js.native
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit = js.native
  def setPadding(padding: Double): Unit = js.native
}

