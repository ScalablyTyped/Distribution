package typings.vexflow.Vex.Flow

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
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}

