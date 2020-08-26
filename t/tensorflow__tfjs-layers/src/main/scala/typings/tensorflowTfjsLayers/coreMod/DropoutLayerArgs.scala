package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropoutLayerArgs extends LayerArgs {
  /**
    * Integer array representing the shape of the binary dropout mask that will
    * be multiplied with the input.
    *
    * For instance, if your inputs have shape `(batchSize, timesteps, features)`
    * and you want the dropout mask to be the same for all timesteps, you can use
    * `noise_shape=(batch_size, 1, features)`.
    */
  var noiseShape: js.UndefOr[js.Array[Double]] = js.native
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double = js.native
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.native
}

object DropoutLayerArgs {
  @scala.inline
  def apply(rate: Double): DropoutLayerArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropoutLayerArgs]
  }
  @scala.inline
  implicit class DropoutLayerArgsOps[Self <: DropoutLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoiseShapeVarargs(value: Double*): Self = this.set("noiseShape", js.Array(value :_*))
    @scala.inline
    def setNoiseShape(value: js.Array[Double]): Self = this.set("noiseShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoiseShape: Self = this.set("noiseShape", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

