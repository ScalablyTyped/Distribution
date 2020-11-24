package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_utils", JSImport.Namespace)
@js.native
object tensorUtilsMod extends js.Object {
  
  def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = js.native
  def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = js.native
  
  def shapesEqualAllowUndefinedSize(n1: js.Array[Double], n2: js.Array[Double]): Boolean = js.native
}
