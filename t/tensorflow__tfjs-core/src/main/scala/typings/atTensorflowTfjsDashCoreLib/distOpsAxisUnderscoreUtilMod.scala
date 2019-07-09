package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", JSImport.Namespace)
@js.native
object distOpsAxisUnderscoreUtilMod extends js.Object {
  def assertAxesAreInnerMostDims(msg: java.lang.String, axes: js.Array[scala.Double], rank: scala.Double): scala.Unit = js.native
  def axesAreInnerMostDims(axes: js.Array[scala.Double], rank: scala.Double): scala.Boolean = js.native
  def combineLocations(outputLoc: js.Array[scala.Double], reduceLoc: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def computeOutAndReduceShapes(aShape: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Tuple2[js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def expandShapeToKeepDim(shape: js.Array[scala.Double], axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getAxesPermutation(axes: js.Array[scala.Double], rank: scala.Double): js.Array[scala.Double] | scala.Null = js.native
  def getInnerMostAxes(numAxes: scala.Double, rank: scala.Double): js.Array[scala.Double] = js.native
  def getUndoAxesPermutation(axes: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

