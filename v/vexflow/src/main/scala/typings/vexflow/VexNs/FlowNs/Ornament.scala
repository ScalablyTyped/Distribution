package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Ornament")
@js.native
class Ornament protected () extends Modifier {
  def this(`type`: String) = this()
  def setDelayed(delayed: Boolean): Ornament = js.native
  def setLowerAccidental(acc: String): Ornament = js.native
  def setUpperAccidental(acc: String): Ornament = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Ornament")
@js.native
object Ornament extends js.Object {
  var DEBUG: Boolean = js.native
  def format(ornaments: js.Array[Ornament], state: Anon_Leftshift): Boolean = js.native
}

