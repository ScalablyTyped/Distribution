package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/broadcast_util", "assertAndGetBroadcastShape")
  @js.native
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/broadcast_util", "getBroadcastDims")
  @js.native
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/broadcast_util", "getReductionAxes")
  @js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
}
