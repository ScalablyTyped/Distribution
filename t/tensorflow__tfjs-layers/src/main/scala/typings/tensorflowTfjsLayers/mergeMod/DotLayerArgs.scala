package typings.tensorflowTfjsLayers.mergeMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotLayerArgs extends LayerArgs {
  /**
    * Axis or axes along which the dot product will be taken.
    *
    * Integer or an Array of integers.
    */
  var axes: Double | (js.Tuple2[Double, Double]) = js.native
  /**
    * Whether to L2-normalize samples along the dot product axis
    * before taking the dot product.
    *
    * If set to `true`, the output of the dot product isthe cosine
    * proximity between the two samples.
    */
  var normalize: js.UndefOr[Boolean] = js.native
}

object DotLayerArgs {
  @scala.inline
  def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerArgs = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotLayerArgs]
  }
  @scala.inline
  implicit class DotLayerArgsOps[Self <: DotLayerArgs] (val x: Self) extends AnyVal {
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
    def setAxes(value: Double | (js.Tuple2[Double, Double])): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
  
}

