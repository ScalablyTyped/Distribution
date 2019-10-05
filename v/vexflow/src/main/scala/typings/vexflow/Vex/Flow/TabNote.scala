package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_DotsDurationPositions
import typings.vexflow.Anon_Fret
import typings.vexflow.Anon_X
import typings.vexflow.Vex.Flow.Modifier.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabNote")
@js.native
class TabNote protected () extends StemmableNote {
  def this(tab_struct: Anon_DotsDurationPositions) = this()
  def this(tab_struct: Anon_DotsDurationPositions, draw_stem: Boolean) = this()
  def addDot(): TabNote = js.native
  def draw(): Unit = js.native
  def drawFlag(): Unit = js.native
  def drawModifiers(): Unit = js.native
  def drawStemThrough(): Unit = js.native
  def getModifierStartXY(position: Position, index: Double): Anon_X = js.native
  def getPositions(): js.Array[Anon_Fret] = js.native
  def getStemY(): Double = js.native
  def getTieLeftX(): Double = js.native
  def getTieRightX(): Double = js.native
  def setGhost(ghost: Boolean): TabNote = js.native
  @JSName("setStave")
  def setStave_TabNote(stave: Stave): TabNote = js.native
  def updateWidth(): Unit = js.native
}

