package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense")
@js.native
class Dense protected () extends Layer {
  def this(args: DenseLayerArgs) = this()
  
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  
  val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  
  var activation: js.Any = js.native
  
  var bias: js.Any = js.native
  
  val biasConstraint: js.Any = js.native
  
  var biasInitializer: js.Any = js.native
  
  val biasRegularizer: js.Any = js.native
  
  var kernel: js.Any = js.native
  
  val kernelConstraint: js.Any = js.native
  
  var kernelInitializer: js.Any = js.native
  
  val kernelRegularizer: js.Any = js.native
  
  var units: js.Any = js.native
  
  var useBias: js.Any = js.native
}
/* static members */
object Dense {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
