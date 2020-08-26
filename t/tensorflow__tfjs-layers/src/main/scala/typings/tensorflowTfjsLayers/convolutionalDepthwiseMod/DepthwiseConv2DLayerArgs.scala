package typings.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.convolutionalMod.BaseConvLayerArgs
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthwiseConv2DLayerArgs extends BaseConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal to
    * `filtersIn * depthMultiplier`.
    * Default: 1.
    */
  var depthMultiplier: js.UndefOr[Double] = js.native
  /**
    * Constraint for the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the depthwise kernel matrix.
    * Default: GlorotNormal.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regulzarizer function for the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * An integer or Array of 2 integers, specifying the width and height of the
    * 2D convolution window. Can be a single integer to specify the same value
    * for all spatial dimensions.
    */
  @JSName("kernelSize")
  var kernelSize_DepthwiseConv2DLayerArgs: Double | (js.Tuple2[Double, Double]) = js.native
}

object DepthwiseConv2DLayerArgs {
  @scala.inline
  def apply(kernelSize: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerArgs = {
    val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2DLayerArgs]
  }
  @scala.inline
  implicit class DepthwiseConv2DLayerArgsOps[Self <: DepthwiseConv2DLayerArgs] (val x: Self) extends AnyVal {
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
    def setKernelSize(value: Double | (js.Tuple2[Double, Double])): Self = this.set("kernelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthMultiplier(value: Double): Self = this.set("depthMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthMultiplier: Self = this.set("depthMultiplier", js.undefined)
    @scala.inline
    def setDepthwiseConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("depthwiseConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthwiseConstraint: Self = this.set("depthwiseConstraint", js.undefined)
    @scala.inline
    def setDepthwiseInitializer(value: InitializerIdentifier | Initializer): Self = this.set("depthwiseInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthwiseInitializer: Self = this.set("depthwiseInitializer", js.undefined)
    @scala.inline
    def setDepthwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("depthwiseRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthwiseRegularizer: Self = this.set("depthwiseRegularizer", js.undefined)
  }
  
}

