package typings.vexflow.Vex.Flow

import typings.vexflow.AnonFret
import typings.vexflow.AnonPositions
import typings.vexflow.AnonX
import typings.vexflow.Vex.Flow.Modifier.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabNote")
@js.native
class TabNote protected () extends StemmableNote {
  def this(tab_struct: AnonPositions) = this()
  def this(tab_struct: AnonPositions, draw_stem: Boolean) = this()
  def addDot(): TabNote = js.native
  def draw(): Unit = js.native
  def drawFlag(): Unit = js.native
  def drawModifiers(): Unit = js.native
  def drawStemThrough(): Unit = js.native
  def getModifierStartXY(position: Position, index: Double): AnonX = js.native
  def getPositions(): js.Array[AnonFret] = js.native
  def getStemY(): Double = js.native
  def getTieLeftX(): Double = js.native
  def getTieRightX(): Double = js.native
  def setGhost(ghost: Boolean): TabNote = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
  def updateWidth(): Unit = js.native
}

