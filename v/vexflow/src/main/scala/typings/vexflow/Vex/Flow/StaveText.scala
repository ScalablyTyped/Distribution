package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveText extends Modifier {
  def draw(stave: Stave): StaveText = js.native
  def setFont(font: Weight): Unit = js.native
  def setShiftX(x: Double): StaveText = js.native
  def setShiftY(y: Double): StaveText = js.native
  def setStaveText(text: String): StaveText = js.native
  def setText(text: String): Unit = js.native
}

