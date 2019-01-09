package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Annotation")
@js.native
class Annotation protected () extends Modifier {
  def this(text: java.lang.String) = this()
  def getJustification(): vexflowLib.VexNs.FlowNs.AnnotationNs.Justify = js.native
  def setFont(family: java.lang.String, size: scala.Double, weight: java.lang.String): Annotation = js.native
  def setJustification(justification: vexflowLib.VexNs.FlowNs.AnnotationNs.Justify): Annotation = js.native
  def setVerticalJustification(just: vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify): Annotation = js.native
}

@JSGlobal("Vex.Flow.Annotation")
@js.native
object Annotation extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def format(annotations: js.Array[vexflowLib.VexNs.FlowNs.Annotation], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
}

