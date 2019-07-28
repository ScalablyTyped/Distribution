package typings.vexflow.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TimeSigNote")
@js.native
class TimeSigNote protected () extends Note {
  def this(timeSpec: String, customPadding: Double) = this()
  def addToModifierContext(): TimeSigNote = js.native
  def draw(): Unit = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
}

