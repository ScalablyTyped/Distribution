package typings.vexflow.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.ClefNote")
@js.native
class ClefNote protected () extends Note {
  def this(clef: String) = this()
  def this(clef: String, size: String) = this()
  def this(clef: String, size: String, annotation: String) = this()
  def addToModifierContext(): ClefNote = js.native
  def draw(): Unit = js.native
  def getClef(): String = js.native
  def setClef(clef: String): ClefNote = js.native
  def setClef(clef: String, size: String): ClefNote = js.native
  def setClef(clef: String, size: String, annotation: String): ClefNote = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
}

