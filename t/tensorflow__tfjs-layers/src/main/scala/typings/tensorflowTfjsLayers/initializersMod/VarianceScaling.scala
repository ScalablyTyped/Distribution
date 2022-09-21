package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "VarianceScaling")
@js.native
open class VarianceScaling protected () extends Initializer {
  /**
    * Constructor of VarianceScaling.
    * @throws ValueError for invalid value in scale.
    */
  def this(args: VarianceScalingArgs) = this()
  
  /* private */ var distribution: Any = js.native
  
  /* private */ var mode: Any = js.native
  
  /* private */ var scale: Any = js.native
  
  /* private */ var seed: Any = js.native
}
/* static members */
object VarianceScaling {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "VarianceScaling")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "VarianceScaling.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
