package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotNormal")
@js.native
/**
  * Constructor of GlorotNormal.
  * @param scale
  * @param mode
  * @param distribution
  * @param seed
  */
open class GlorotNormal () extends VarianceScaling {
  def this(args: SeedOnlyInitializerArgs) = this()
}
/* static members */
object GlorotNormal {
  
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotNormal")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/initializers", "GlorotNormal.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
