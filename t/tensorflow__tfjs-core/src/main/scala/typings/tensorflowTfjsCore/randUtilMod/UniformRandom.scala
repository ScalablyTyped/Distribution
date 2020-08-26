package typings.tensorflowTfjsCore.randUtilMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/rand_util", "UniformRandom")
@js.native
class UniformRandom () extends RandomBase {
  def this(min: Double) = this()
  def this(min: js.UndefOr[scala.Nothing], max: Double) = this()
  def this(min: Double, max: Double) = this()
  def this(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dtype: float32 | int32) = this()
  def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: float32 | int32) = this()
  def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: float32 | int32) = this()
  def this(min: Double, max: Double, dtype: float32 | int32) = this()
  def this(
    min: js.UndefOr[scala.Nothing],
    max: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[float32 | int32],
    seed: String
  ) = this()
  def this(
    min: js.UndefOr[scala.Nothing],
    max: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[float32 | int32],
    seed: Double
  ) = this()
  def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: js.UndefOr[float32 | int32], seed: String) = this()
  def this(min: js.UndefOr[scala.Nothing], max: Double, dtype: js.UndefOr[float32 | int32], seed: Double) = this()
  def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: js.UndefOr[float32 | int32], seed: String) = this()
  def this(min: Double, max: js.UndefOr[scala.Nothing], dtype: js.UndefOr[float32 | int32], seed: Double) = this()
  def this(min: Double, max: Double, dtype: js.UndefOr[float32 | int32], seed: String) = this()
  def this(min: Double, max: Double, dtype: js.UndefOr[float32 | int32], seed: Double) = this()
  /** Handles proper rounding for non floating point numbers. */
  var canReturnFloat: js.Any = js.native
  var convertValue: js.Any = js.native
  var dtype: js.Any = js.native
  var min: js.Any = js.native
  var random: js.Any = js.native
  var range: js.Any = js.native
}

