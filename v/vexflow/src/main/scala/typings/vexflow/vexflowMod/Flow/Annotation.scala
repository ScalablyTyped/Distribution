package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Annotation")
@js.native
class Annotation protected ()
  extends typings.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Annotation")
@js.native
object Annotation extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(annotations: js.Array[typings.vexflow.Vex.Flow.Annotation], state: Anon_Leftshift): Boolean = js.native
  type Justify = typings.vexflow.Vex.Flow.Annotation.Justify
  type VerticalJustify = typings.vexflow.Vex.Flow.Annotation.VerticalJustify
}

