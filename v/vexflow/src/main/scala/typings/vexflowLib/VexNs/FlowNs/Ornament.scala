package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Ornament")
@js.native
class Ornament protected () extends Modifier {
  def this(`type`: java.lang.String) = this()
  def setDelayed(delayed: scala.Boolean): Ornament = js.native
  def setLowerAccidental(acc: java.lang.String): Ornament = js.native
  def setUpperAccidental(acc: java.lang.String): Ornament = js.native
}

@JSGlobal("Vex.Flow.Ornament")
@js.native
object Ornament extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def format(ornaments: js.Array[vexflowLib.VexNs.FlowNs.Ornament], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
}

