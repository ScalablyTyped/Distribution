package typings.tensorflowTfjsCore.randUtilMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "MPRandGauss")
@js.native
class MPRandGauss protected () extends RandomBase {
  def this(mean: Double, stdDeviation: Double) = this()
  def this(mean: Double, stdDeviation: Double, dtype: float32) = this()
  def this(mean: Double, stdDeviation: Double, dtype: int32) = this()
  def this(mean: Double, stdDeviation: Double, dtype: float32, truncated: Boolean) = this()
  def this(mean: Double, stdDeviation: Double, dtype: int32, truncated: Boolean) = this()
  def this(mean: Double, stdDeviation: Double, dtype: float32, truncated: Boolean, seed: Double) = this()
  def this(mean: Double, stdDeviation: Double, dtype: int32, truncated: Boolean, seed: Double) = this()
  /** Handles proper rounding for non-floating-point numbers. */
  var convertValue: js.Any = js.native
  var dtype: js.UndefOr[js.Any] = js.native
  /** Returns true if less than 2-standard-deviations from the mean. */
  var isValidTruncated: js.Any = js.native
  var lower: js.UndefOr[js.Any] = js.native
  var mean: js.Any = js.native
  var nextVal: js.Any = js.native
  var random: js.Any = js.native
  var stdDev: js.Any = js.native
  var truncated: js.UndefOr[js.Any] = js.native
  var upper: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override def nextValue(): Double = js.native
}

