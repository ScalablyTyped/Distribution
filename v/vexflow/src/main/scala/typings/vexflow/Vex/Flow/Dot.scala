package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Dot")
@js.native
class Dot () extends Modifier {
   //inconsistent type: void -> Dot
  def setDotShiftY(y: Double): Dot = js.native
  @JSName("setNote")
  def setNote_Unit(note: Note): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Dot")
@js.native
object Dot extends js.Object {
  val CATEGORY: String = js.native
  def format(dots: Double, state: Anon_Leftshift): Unit = js.native
}

