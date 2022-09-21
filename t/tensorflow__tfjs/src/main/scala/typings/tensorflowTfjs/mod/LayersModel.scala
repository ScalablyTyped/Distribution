package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsLayers.containerMod.ContainerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "LayersModel")
@js.native
open class LayersModel protected ()
  extends typings.tensorflowTfjsLayers.mod.LayersModel {
  def this(args: ContainerArgs) = this()
}
/* static members */
object LayersModel {
  
  @JSImport("@tensorflow/tfjs", "LayersModel")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs", "LayersModel.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
