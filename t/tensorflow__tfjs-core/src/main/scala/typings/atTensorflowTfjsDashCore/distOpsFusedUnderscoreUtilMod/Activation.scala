package typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.linear
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.relu
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.prelu
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.elu
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.relu6
*/
trait Activation extends js.Object

object Activation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.elu = this.cast("elu")
  @scala.inline
  def linear: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.linear = this.cast("linear")
  @scala.inline
  def prelu: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.prelu = this.cast("prelu")
  @scala.inline
  def relu: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.relu = this.cast("relu")
  @scala.inline
  def relu6: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.relu6 = this.cast("relu6")
}

