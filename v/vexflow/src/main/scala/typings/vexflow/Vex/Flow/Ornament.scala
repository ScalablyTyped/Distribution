package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLeftshift
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
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(ornaments: js.Array[Ornament], state: AnonLeftshift): Boolean = js.native
}

