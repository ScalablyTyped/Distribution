package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabNote")
@js.native
class TabNote protected () extends StemmableNote {
  def this(tab_struct: vexflowLib.Anon_Duration) = this()
  def this(tab_struct: vexflowLib.Anon_Duration, draw_stem: scala.Boolean) = this()
  def addDot(): TabNote = js.native
  def draw(): scala.Unit = js.native
  def drawFlag(): scala.Unit = js.native
  def drawModifiers(): scala.Unit = js.native
  def drawStemThrough(): scala.Unit = js.native
  def getModifierStartXY(position: vexflowLib.VexNs.FlowNs.ModifierNs.Position, index: scala.Double): vexflowLib.Anon_Y = js.native
  def getPositions(): js.Array[vexflowLib.Anon_Str] = js.native
  def getStemY(): scala.Double = js.native
  def getTieLeftX(): scala.Double = js.native
  def getTieRightX(): scala.Double = js.native
  def setGhost(ghost: scala.Boolean): TabNote = js.native
  @JSName("setStave")
  def setStave_TabNote(stave: Stave): TabNote = js.native
  def updateWidth(): scala.Unit = js.native
}

