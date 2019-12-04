package typings.atTensorflowTfjsDashCore.distOpsRandMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand", "RandGamma")
@js.native
class RandGamma protected () extends RandomGamma {
  def this(alpha: Double, beta: Double, dtype: float32) = this()
  def this(alpha: Double, beta: Double, dtype: int32) = this()
  def this(alpha: Double, beta: Double, dtype: float32, seed: Double) = this()
  def this(alpha: Double, beta: Double, dtype: int32, seed: Double) = this()
  var alpha: js.Any = js.native
  var beta: js.Any = js.native
  var c: js.Any = js.native
  /** Handles proper rounding for non-floating-point numbers. */
  var convertValue: js.Any = js.native
  var d: js.Any = js.native
  var dtype: js.UndefOr[js.Any] = js.native
  var randn: js.Any = js.native
  var randu: js.Any = js.native
  /* CompleteClass */
  override def nextValue(): Double = js.native
}

