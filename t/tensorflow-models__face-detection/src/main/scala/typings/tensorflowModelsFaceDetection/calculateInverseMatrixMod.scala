package typings.tensorflowModelsFaceDetection

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateInverseMatrixMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/calculate_inverse_matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToMatrix4x4(array: ArrayLike[Double]): Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToMatrix4x4")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix4x4]
  
  inline def calculateInverseMatrix(matrix: Matrix4x4): Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateInverseMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix4x4]
  
  inline def matrix4x4ToArray(matrix: Matrix4x4): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("matrix4x4ToArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  type Matrix4x4 = js.Tuple4[Matrix4x4Row, Matrix4x4Row, Matrix4x4Row, Matrix4x4Row]
  
  type Matrix4x4Row = js.Tuple4[Double, Double, Double, Double]
}
