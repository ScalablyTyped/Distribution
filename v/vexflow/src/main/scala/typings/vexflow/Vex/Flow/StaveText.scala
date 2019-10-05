package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_FamilySizeWeight
import typings.vexflow.Anon_Justification
import typings.vexflow.Vex.Flow.Modifier.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveText")
@js.native
class StaveText protected () extends Modifier {
  def this(text: String, position: Position) = this()
  def this(text: String, position: Position, options: Anon_Justification) = this()
  def draw(stave: Stave): StaveText = js.native
  def setFont(font: Anon_FamilySizeWeight): Unit = js.native
  def setShiftX(x: Double): StaveText = js.native
  def setShiftY(y: Double): StaveText = js.native
  def setStaveText(text: String): StaveText = js.native
  def setText(text: String): Unit = js.native
}

