package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsLayers.containerMod.ContainerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "LayersModel")
@js.native
class LayersModel protected ()
  extends typings.tensorflowTfjs.mod.LayersModel {
  def this(args: ContainerArgs) = this()
}
/* static members */
object LayersModel {
  
  @JSImport("@tensorflow/tfjs-node", "LayersModel")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-node", "LayersModel.className")
  @js.native
  def className: String = js.native
  @scala.inline
  def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
