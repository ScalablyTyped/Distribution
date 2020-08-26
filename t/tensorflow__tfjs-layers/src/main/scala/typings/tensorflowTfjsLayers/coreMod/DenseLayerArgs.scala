package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DenseLayerArgs extends LayerArgs {
  /**
    * Activation function to use.
    *
    * If unspecified, no activation is applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint for the bias vector.
    */
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * If specified, defines inputShape as `[inputDim]`.
    */
  var inputDim: js.UndefOr[Double] = js.native
  /**
    * Constraint for the kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the dense kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the dense kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /** Positive integer, dimensionality of the output space. */
  var units: Double = js.native
  /** Whether to apply a bias. */
  var useBias: js.UndefOr[Boolean] = js.native
}

object DenseLayerArgs {
  @scala.inline
  def apply(units: Double): DenseLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerArgs]
  }
  @scala.inline
  implicit class DenseLayerArgsOps[Self <: DenseLayerArgs] (val x: Self) extends AnyVal {
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
    def setUnits(value: Double): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivation(value: ActivationIdentifier): Self = this.set("activation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    @scala.inline
    def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("activityRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityRegularizer: Self = this.set("activityRegularizer", js.undefined)
    @scala.inline
    def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("biasConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBiasConstraint: Self = this.set("biasConstraint", js.undefined)
    @scala.inline
    def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = this.set("biasInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBiasInitializer: Self = this.set("biasInitializer", js.undefined)
    @scala.inline
    def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("biasRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBiasRegularizer: Self = this.set("biasRegularizer", js.undefined)
    @scala.inline
    def setInputDim(value: Double): Self = this.set("inputDim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDim: Self = this.set("inputDim", js.undefined)
    @scala.inline
    def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("kernelConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelConstraint: Self = this.set("kernelConstraint", js.undefined)
    @scala.inline
    def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = this.set("kernelInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelInitializer: Self = this.set("kernelInitializer", js.undefined)
    @scala.inline
    def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("kernelRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelRegularizer: Self = this.set("kernelRegularizer", js.undefined)
    @scala.inline
    def setUseBias(value: Boolean): Self = this.set("useBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBias: Self = this.set("useBias", js.undefined)
  }
  
}

