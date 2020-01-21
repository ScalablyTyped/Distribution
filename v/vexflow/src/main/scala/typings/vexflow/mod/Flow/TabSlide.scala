package typings.vexflow.mod.Flow

import typings.vexflow.AnonFirstindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.TabSlide")
@js.native
class TabSlide protected ()
  extends typings.vexflow.Vex.Flow.TabSlide {
  def this(notes: AnonFirstindices) = this()
  def this(notes: AnonFirstindices, direction: Double) = this()
}

/* static members */
@JSImport("vexflow", "Flow.TabSlide")
@js.native
object TabSlide extends js.Object {
  val SLIDE_DOWN: Double = js.native
  val SLIDE_UP: Double = js.native
  def createSlideDown(notes: AnonFirstindices): typings.vexflow.Vex.Flow.TabSlide = js.native
  def createSlideUp(notes: AnonFirstindices): typings.vexflow.Vex.Flow.TabSlide = js.native
}

