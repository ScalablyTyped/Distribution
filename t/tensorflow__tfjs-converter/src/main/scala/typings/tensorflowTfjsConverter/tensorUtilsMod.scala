package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtilsMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: js.Array[Double], shapeB: Double, errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: Double, shapeB: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: Double, shapeB: js.Array[Double], errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: Double, shapeB: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatchAllowUndefinedSize(shapeA: Double, shapeB: Double, errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatchAllowUndefinedSize")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fullDefinedShape(elementShape: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fullDefinedShape")(elementShape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def fullDefinedShape(elementShape: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fullDefinedShape")(elementShape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def inferElementShape(
    listElementShape: js.Array[Double],
    tensors: js.Array[Tensor[Rank]],
    elementShape: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferElementShape")(listElementShape.asInstanceOf[js.Any], tensors.asInstanceOf[js.Any], elementShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def inferElementShape(listElementShape: js.Array[Double], tensors: js.Array[Tensor[Rank]], elementShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferElementShape")(listElementShape.asInstanceOf[js.Any], tensors.asInstanceOf[js.Any], elementShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def inferElementShape(listElementShape: Double, tensors: js.Array[Tensor[Rank]], elementShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferElementShape")(listElementShape.asInstanceOf[js.Any], tensors.asInstanceOf[js.Any], elementShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def inferElementShape(listElementShape: Double, tensors: js.Array[Tensor[Rank]], elementShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferElementShape")(listElementShape.asInstanceOf[js.Any], tensors.asInstanceOf[js.Any], elementShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def mergeElementShape(elementShapeA: js.Array[Double], elementShapeB: js.Array[Double]): Double | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeElementShape")(elementShapeA.asInstanceOf[js.Any], elementShapeB.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Double]]
  inline def mergeElementShape(elementShapeA: js.Array[Double], elementShapeB: Double): Double | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeElementShape")(elementShapeA.asInstanceOf[js.Any], elementShapeB.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Double]]
  inline def mergeElementShape(elementShapeA: Double, elementShapeB: js.Array[Double]): Double | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeElementShape")(elementShapeA.asInstanceOf[js.Any], elementShapeB.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Double]]
  inline def mergeElementShape(elementShapeA: Double, elementShapeB: Double): Double | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeElementShape")(elementShapeA.asInstanceOf[js.Any], elementShapeB.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Double]]
}
