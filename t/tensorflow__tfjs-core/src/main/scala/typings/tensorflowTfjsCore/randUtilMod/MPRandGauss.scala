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
  def this(mean: Double, stdDeviation: Double, dtype: float32 | int32) = this()
  def this(mean: Double, stdDeviation: Double, dtype: js.UndefOr[float32 | int32], truncated: Boolean) = this()
  def this(
    mean: Double,
    stdDeviation: Double,
    dtype: js.UndefOr[float32 | int32],
    truncated: js.UndefOr[scala.Nothing],
    seed: Double
  ) = this()
  def this(
    mean: Double,
    stdDeviation: Double,
    dtype: js.UndefOr[float32 | int32],
    truncated: Boolean,
    seed: Double
  ) = this()
  /** Handles proper rounding for non-floating-point numbers. */
  var convertValue: js.Any = js.native
  var dtype: js.Any = js.native
  /** Returns true if less than 2-standard-deviations from the mean. */
  var isValidTruncated: js.Any = js.native
  var lower: js.Any = js.native
  var mean: js.Any = js.native
  var nextVal: js.Any = js.native
  var random: js.Any = js.native
  var stdDev: js.Any = js.native
  var truncated: js.Any = js.native
  var upper: js.Any = js.native
}

