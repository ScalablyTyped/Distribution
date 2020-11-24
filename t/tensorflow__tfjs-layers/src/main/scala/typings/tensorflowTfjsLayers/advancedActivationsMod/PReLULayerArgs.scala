package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PReLULayerArgs extends LayerArgs {
  
  /**
    * Constraint for the learnable alpha.
    */
  var alphaConstraint: js.UndefOr[Constraint] = js.native
  
  /**
    * Initializer for the learnable alpha.
    */
  var alphaInitializer: js.UndefOr[Initializer | InitializerIdentifier] = js.native
  
  /**
    * Regularizer for the learnable alpha.
    */
  var alphaRegularizer: js.UndefOr[Regularizer] = js.native
  
  /**
    * The axes along which to share learnable parameters for the activation
    * function. For example, if the incoming feature maps are from a 2D
    * convolution with output shape `[numExamples, height, width, channels]`,
    * and you wish to share parameters across space (height and width) so that
    * each filter channels has only one set of parameters, set
    * `shared_axes: [1, 2]`.
    */
  var sharedAxes: js.UndefOr[Double | js.Array[Double]] = js.native
}
object PReLULayerArgs {
  
  @scala.inline
  def apply(): PReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PReLULayerArgs]
  }
  
  @scala.inline
  implicit class PReLULayerArgsOps[Self <: PReLULayerArgs] (val x: Self) extends AnyVal {
    
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
    def setAlphaConstraint(value: Constraint): Self = this.set("alphaConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaConstraint: Self = this.set("alphaConstraint", js.undefined)
    
    @scala.inline
    def setAlphaInitializer(value: Initializer | InitializerIdentifier): Self = this.set("alphaInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaInitializer: Self = this.set("alphaInitializer", js.undefined)
    
    @scala.inline
    def setAlphaRegularizer(value: Regularizer): Self = this.set("alphaRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaRegularizer: Self = this.set("alphaRegularizer", js.undefined)
    
    @scala.inline
    def setSharedAxesVarargs(value: Double*): Self = this.set("sharedAxes", js.Array(value :_*))
    
    @scala.inline
    def setSharedAxes(value: Double | js.Array[Double]): Self = this.set("sharedAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedAxes: Self = this.set("sharedAxes", js.undefined)
  }
}
