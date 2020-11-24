package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.anon.Fret
import typings.vexflow.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabNote extends StemmableNote {
  
  def addDot(): TabNote = js.native
  
  def draw(): Unit = js.native
  
  def drawFlag(): Unit = js.native
  
  def drawModifiers(): Unit = js.native
  
  def drawStemThrough(): Unit = js.native
  
  def getModifierStartXY(position: Position, index: Double): X = js.native
  
  def getPositions(): js.Array[Fret] = js.native
  
  def getStemY(): Double = js.native
  
  def getTieLeftX(): Double = js.native
  
  def getTieRightX(): Double = js.native
  
  def setGhost(ghost: Boolean): TabNote = js.native
  
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
  
  def updateWidth(): Unit = js.native
}
