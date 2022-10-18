package typings.tensorflowTfjsLayers.distInitializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotUniform")
@js.native
/**
  * Constructor of GlorotUniform
  * @param scale
  * @param mode
  * @param distribution
  * @param seed
  */
open class GlorotUniform () extends VarianceScaling {
  def this(args: SeedOnlyInitializerArgs) = this()
}
/* static members */
object GlorotUniform {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotUniform")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotUniform.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
