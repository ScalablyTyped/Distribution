package typings.vexflow.mod.Flow

import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Ornament")
@js.native
class Ornament protected ()
  extends typings.vexflow.Vex.Flow.Ornament {
  def this(`type`: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Ornament")
@js.native
object Ornament extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(ornaments: js.Array[typings.vexflow.Vex.Flow.Ornament], state: Leftshift): Boolean = js.native
}

