package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat_util", "assertParamsConsistent")
  @js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat_util", "computeOutShape")
  @js.native
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = js.native
}
