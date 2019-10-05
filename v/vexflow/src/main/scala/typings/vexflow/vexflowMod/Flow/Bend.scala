package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_Leftshift
import typings.vexflow.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Bend")
@js.native
class Bend protected ()
  extends typings.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Anon_Text]) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Bend")
@js.native
object Bend extends js.Object {
  val CATEGORY: String = js.native
  var DOWN: Double = js.native
  var UP: Double = js.native
  def format(bends: js.Array[typings.vexflow.Vex.Flow.Bend], state: Anon_Leftshift): Boolean = js.native
}

