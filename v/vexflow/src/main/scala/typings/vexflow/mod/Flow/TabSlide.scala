package typings.vexflow.mod.Flow

import typings.vexflow.anon.Firstindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.TabSlide")
@js.native
class TabSlide protected ()
  extends typings.vexflow.Vex.Flow.TabSlide {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, direction: Double) = this()
}

/* static members */
@JSImport("vexflow", "Flow.TabSlide")
@js.native
object TabSlide extends js.Object {
  val SLIDE_DOWN: Double = js.native
  val SLIDE_UP: Double = js.native
  def createSlideDown(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = js.native
  def createSlideUp(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = js.native
}

