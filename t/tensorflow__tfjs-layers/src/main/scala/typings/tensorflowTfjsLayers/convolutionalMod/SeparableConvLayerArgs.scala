package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparableConvLayerArgs extends ConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal
    * to `filtersIn * depthMultiplier`. Default: 1.
    */
  var depthMultiplier: js.UndefOr[Double] = js.native
  /**
    * Constraint function applied to the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the depthwise kernel matrix.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the pointwise kernel matrix.
    */
  var pointwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the pointwise kernel matrix.
    */
  var pointwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the pointwise kernel matrix.
    */
  var pointwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
}

object SeparableConvLayerArgs {
  @scala.inline
  def apply(filters: Double, kernelSize: Double | js.Array[Double]): SeparableConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerArgs]
  }
  @scala.inline
  implicit class SeparableConvLayerArgsOps[Self <: SeparableConvLayerArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPointwiseConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("pointwiseConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointwiseConstraint: Self = this.set("pointwiseConstraint", js.undefined)
    @scala.inline
    def setPointwiseInitializer(value: InitializerIdentifier | Initializer): Self = this.set("pointwiseInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointwiseInitializer: Self = this.set("pointwiseInitializer", js.undefined)
    @scala.inline
    def setPointwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("pointwiseRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointwiseRegularizer: Self = this.set("pointwiseRegularizer", js.undefined)
  }
  
}

