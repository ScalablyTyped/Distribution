package typings.atTensorflowTfjsDashCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
  - typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64
*/
trait NumericDataType extends js.Object

object NumericDataType {
  @scala.inline
  def bool: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32 = this.cast("int32")
}

