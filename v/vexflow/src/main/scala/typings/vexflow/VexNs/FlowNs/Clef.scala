package typings.vexflow.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Clef")
@js.native
class Clef protected () extends StaveModifier {
  def this(clef: String) = this()
  def this(clef: String, size: String) = this()
  def this(clef: String, size: String, annotation: String) = this()
  def addEndModifier(stave: Stave): Unit = js.native
  def addModifier(stave: Stave): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Clef")
@js.native
object Clef extends js.Object {
  var DEBUG: Boolean = js.native
}

