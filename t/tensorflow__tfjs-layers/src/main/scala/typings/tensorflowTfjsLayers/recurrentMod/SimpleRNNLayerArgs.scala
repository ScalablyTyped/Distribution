package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
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
trait SimpleRNNLayerArgs extends BaseRNNLayerArgs {
  /**
    * Activation function to use.
    *
    * Defaults to  hyperbolic tangent (`tanh`)
    *
    * If you pass `null`, no activation will be applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  /**
    * Constraint function applied to the bias vector.
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
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[Double] = js.native
  /**
    * Constraint function applied to the kernel weights matrix.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the recurrentKernel weights matrix.
    */
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[Double] = js.native
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the recurrentKernel weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Positive integer, dimensionality of the output space.
    */
  var units: Double = js.native
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[Boolean] = js.native
}

object SimpleRNNLayerArgs {
  @scala.inline
  def apply(units: Double): SimpleRNNLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerArgs]
  }
  @scala.inline
  implicit class SimpleRNNLayerArgsOps[Self <: SimpleRNNLayerArgs] (val x: Self) extends AnyVal {
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
    def setDropout(value: Double): Self = this.set("dropout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropout: Self = this.set("dropout", js.undefined)
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
    def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("recurrentConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrentConstraint: Self = this.set("recurrentConstraint", js.undefined)
    @scala.inline
    def setRecurrentDropout(value: Double): Self = this.set("recurrentDropout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrentDropout: Self = this.set("recurrentDropout", js.undefined)
    @scala.inline
    def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = this.set("recurrentInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrentInitializer: Self = this.set("recurrentInitializer", js.undefined)
    @scala.inline
    def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("recurrentRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrentRegularizer: Self = this.set("recurrentRegularizer", js.undefined)
    @scala.inline
    def setUseBias(value: Boolean): Self = this.set("useBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBias: Self = this.set("useBias", js.undefined)
  }
  
}

