package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Barline.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.BarNote")
@js.native
class BarNote () extends Note {
  def addToModifierContext(): BarNote = js.native
  def draw(): Unit = js.native
  def getType(): `type` = js.native
  def setType(`type`: `type`): BarNote = js.native
}

/* static members */
@JSGlobal("Vex.Flow.BarNote")
@js.native
object BarNote extends js.Object {
  var DEBUG: Boolean = js.native
}

