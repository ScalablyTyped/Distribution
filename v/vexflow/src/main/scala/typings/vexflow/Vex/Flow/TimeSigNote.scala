package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TimeSigNote")
@js.native
class TimeSigNote protected () extends Note {
  def this(timeSpec: String, customPadding: Double) = this()
  def addToModifierContext(): TimeSigNote = js.native
  def draw(): Unit = js.native
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}

