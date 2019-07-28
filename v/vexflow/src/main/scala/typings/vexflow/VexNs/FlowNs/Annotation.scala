package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Leftshift
import typings.vexflow.VexNs.FlowNs.AnnotationNs.Justify
import typings.vexflow.VexNs.FlowNs.AnnotationNs.VerticalJustify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Annotation")
@js.native
class Annotation protected () extends Modifier {
  def this(text: String) = this()
  def getJustification(): Justify = js.native
  def setFont(family: String, size: Double, weight: String): Annotation = js.native
  def setJustification(justification: Justify): Annotation = js.native
  def setVerticalJustification(just: VerticalJustify): Annotation = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Annotation")
@js.native
object Annotation extends js.Object {
  var DEBUG: Boolean = js.native
  def format(annotations: js.Array[Annotation], state: Anon_Leftshift): Boolean = js.native
}

