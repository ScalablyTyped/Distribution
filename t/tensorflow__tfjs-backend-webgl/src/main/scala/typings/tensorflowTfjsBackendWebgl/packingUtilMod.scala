package typings.tensorflowTfjsBackendWebgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/packing_util", JSImport.Namespace)
@js.native
object packingUtilMod extends js.Object {
  
  def getChannels(name: String, rank: Double): js.Array[String] = js.native
  
  def getSourceCoords(rank: Double, dims: js.Array[String]): String = js.native
  
  def getVecChannels(name: String, rank: Double): js.Array[String] = js.native
}
