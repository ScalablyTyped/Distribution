package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_Arrowheadangle
import typings.vexflow.Anon_FamilySize
import typings.vexflow.Anon_Firstindices
import typings.vexflow.Anon_FirstindicesFirstnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveLine")
@js.native
class StaveLine_ protected () extends js.Object {
  def this(notes: Anon_Firstindices) = this()
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Anon_Arrowheadangle = js.native
  def applyFontStyle(): Unit = js.native
  def applyLineStyle(): Unit = js.native
  def draw(): StaveLine = js.native
  def setContext(context: js.Object): StaveLine = js.native
  def setFont(font: Anon_FamilySize): StaveLine = js.native
  def setNotes(notes: Anon_FirstindicesFirstnote): StaveLine = js.native
  def setText(text: String): StaveLine = js.native
}

