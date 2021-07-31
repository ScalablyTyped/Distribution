package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtilsMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def shapesEqualAllowUndefinedSize(n1: js.Array[Double], n2: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shapesEqualAllowUndefinedSize")(n1.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
