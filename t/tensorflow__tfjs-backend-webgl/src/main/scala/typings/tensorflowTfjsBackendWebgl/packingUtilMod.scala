package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packingUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/packing_util", "getChannels")
  @js.native
  def getChannels(name: String, rank: Double): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/packing_util", "getSourceCoords")
  @js.native
  def getSourceCoords(rank: Double, dims: js.Array[String]): String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/packing_util", "getVecChannels")
  @js.native
  def getVecChannels(name: String, rank: Double): js.Array[String] = js.native
}
