package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTie")
@js.native
class StaveTie protected () extends js.Object {
  /**
    * @see https://github.com/0xfe/vexflow/blob/master/src/stavetie.js#L12
    *
    * Notes is a struct that has:
    *
    *  {
    *    first_note: Note,
    *    last_note: Note,
    *    first_indices: [n1, n2, n3],
    *    last_indices: [n1, n2, n3]
    *  }
    * All properties are optional, since ties can span line breaks in which case
    * two ties can be used, each with either "first_note" or "last_note" missing.
    *
    **/
  def this(notes: vexflowLib.Anon_Lastindices) = this()
  def this(notes: vexflowLib.Anon_Lastindices, text: java.lang.String) = this()
  def draw(): scala.Boolean = js.native
  def isPartial(): scala.Boolean = js.native
  def renderText(first_x_px: scala.Double, last_x_px: scala.Double): scala.Unit = js.native
  def renderTie(params: vexflowLib.Anon_Direction): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): StaveTie = js.native
  def setFont(font: vexflowLib.Anon_Weight): StaveTie = js.native
  def setNotes(notes: vexflowLib.Anon_Lastindices): StaveTie = js.native
}

