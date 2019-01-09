package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveLine")
@js.native
class StaveLine protected () extends js.Object {
  def this(notes: vexflowLib.Anon_Firstindices) = this()
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: vexflowLib.Anon_Arrowheadangle = js.native
  def applyFontStyle(): scala.Unit = js.native
  def applyLineStyle(): scala.Unit = js.native
  def draw(): StaveLine = js.native
  def setContext(context: js.Object): StaveLine = js.native
  def setFont(font: vexflowLib.Anon_FamilySize): StaveLine = js.native
  def setNotes(notes: vexflowLib.Anon_FirstindicesFirstnote): StaveLine = js.native
  def setText(text: java.lang.String): StaveLine = js.native
}

