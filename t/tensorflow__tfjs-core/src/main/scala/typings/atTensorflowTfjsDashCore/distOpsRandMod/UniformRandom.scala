package typings.atTensorflowTfjsDashCore.distOpsRandMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand", "UniformRandom")
@js.native
class UniformRandom () extends RandomBase {
  def this(min: Double) = this()
  def this(min: Double, max: Double) = this()
  def this(min: Double, max: Double, dtype: float32) = this()
  def this(min: Double, max: Double, dtype: int32) = this()
  def this(min: Double, max: Double, dtype: float32, seed: String) = this()
  def this(min: Double, max: Double, dtype: float32, seed: Double) = this()
  def this(min: Double, max: Double, dtype: int32, seed: String) = this()
  def this(min: Double, max: Double, dtype: int32, seed: Double) = this()
  /** Handles proper rounding for non floating point numbers. */
  var canReturnFloat: js.Any = js.native
  var convertValue: js.Any = js.native
  var dtype: js.UndefOr[js.Any] = js.native
  var min: js.Any = js.native
  var random: js.Any = js.native
  var range: js.Any = js.native
  /* CompleteClass */
  override def nextValue(): Double = js.native
}

