package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense")
@js.native
open class Dense protected () extends Layer {
  def this(args: DenseLayerArgs) = this()
  
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  
  val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  
  /* private */ var activation: Any = js.native
  
  /* private */ var bias: Any = js.native
  
  /* private */ val biasConstraint: Any = js.native
  
  /* private */ var biasInitializer: Any = js.native
  
  /* private */ val biasRegularizer: Any = js.native
  
  /* private */ var kernel: Any = js.native
  
  /* private */ val kernelConstraint: Any = js.native
  
  /* private */ var kernelInitializer: Any = js.native
  
  /* private */ val kernelRegularizer: Any = js.native
  
  /* private */ var units: Any = js.native
  
  /* private */ var useBias: Any = js.native
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
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
