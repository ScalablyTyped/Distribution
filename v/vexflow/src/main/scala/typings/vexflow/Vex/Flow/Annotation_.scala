package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Annotation.Justify
import typings.vexflow.Vex.Flow.Annotation.VerticalJustify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Annotation")
@js.native
class Annotation_ protected () extends Modifier {
  def this(text: String) = this()
  def getJustification(): Justify = js.native
  def setFont(family: String, size: Double, weight: String): Annotation = js.native
  def setJustification(justification: Justify): Annotation = js.native
  def setVerticalJustification(just: VerticalJustify): Annotation = js.native
}

