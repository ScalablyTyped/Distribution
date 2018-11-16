package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Curve")
@js.native
class Curve protected () extends js.Object {
  def this(from: Note, to: Note) = this()
  def this(from: Note, to: Note, options: vexflowLib.Anon_Cps) = this()
  def draw(): scala.Boolean = js.native
  def isPartial(): scala.Boolean = js.native
  def renderCurve(params: vexflowLib.Anon_DirectionFirsty): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Curve = js.native
  def setNotes(from: Note, to: Note): Curve = js.native
}

@JSGlobal("Vex.Flow.Curve")
@js.native
object Curve extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

