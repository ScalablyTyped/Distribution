package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packingUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/packing_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getChannels(name: String, rank: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChannels")(name.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getSourceCoords(rank: Double, dims: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceCoords")(rank.asInstanceOf[js.Any], dims.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getVecChannels(name: String, rank: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVecChannels")(name.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
