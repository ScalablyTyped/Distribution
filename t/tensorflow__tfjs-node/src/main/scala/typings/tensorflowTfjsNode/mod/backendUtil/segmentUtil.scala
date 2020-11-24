package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.segmentUtilMod.GatherOpShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "backend_util.segment_util")
@js.native
object segmentUtil extends js.Object {
  
  def collectGatherOpShapeInfo(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = js.native
  
  def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
  
  def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
}
