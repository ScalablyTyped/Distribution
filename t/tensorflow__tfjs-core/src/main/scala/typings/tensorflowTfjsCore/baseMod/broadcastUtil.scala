package typings.tensorflowTfjsCore.baseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastUtil {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "broadcast_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAndGetBroadcastShape")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroadcastDims")(inShape.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReductionAxes")(inShape.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
