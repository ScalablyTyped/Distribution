package typings.vexflow.mod.Flow

import typings.vexflow.AnonLeftshift
import typings.vexflow.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Bend")
@js.native
class Bend protected ()
  extends typings.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[AnonText]) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Bend")
@js.native
object Bend extends js.Object {
  val CATEGORY: String = js.native
  var DOWN: Double = js.native
  var UP: Double = js.native
  def format(bends: js.Array[typings.vexflow.Vex.Flow.Bend], state: AnonLeftshift): Boolean = js.native
}

