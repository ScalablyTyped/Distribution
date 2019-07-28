package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Allvoices
import typings.vexflow.Anon_Leftshift
import typings.vexflow.VexNs.FlowNs.StrokeNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stroke")
@js.native
class Stroke protected () extends Modifier {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Anon_Allvoices) = this()
  def addEndNote(note: Note): Stroke = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Stroke")
@js.native
object Stroke extends js.Object {
  def format(strokes: js.Array[Stroke], state: Anon_Leftshift): Boolean = js.native
}

