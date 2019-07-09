package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type DataValues = js.Array[java.lang.String] | stdLib.Int32Array | stdLib.Float32Array | stdLib.Uint8Array
  type FlatVector = (js.Array[scala.Boolean | scala.Double]) | TypedArray
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  type ScalarLike = scala.Double | scala.Boolean | java.lang.String
  type TensorLike = TypedArray | scala.Double | scala.Boolean | java.lang.String | (RecursiveArray[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | TypedArray
  ])
  type TensorLike1D = TypedArray | (js.Array[scala.Boolean | scala.Double | java.lang.String])
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.Boolean | scala.Double | java.lang.String
  ])
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[scala.Boolean | scala.Double | java.lang.String]]) | scala.Boolean | scala.Double | java.lang.String
  ])
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[scala.Boolean | scala.Double | java.lang.String]]]) | scala.Boolean | scala.Double | java.lang.String
  ])
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[js.Array[scala.Boolean | scala.Double | java.lang.String]]]]) | scala.Boolean | scala.Double | java.lang.String
  ])
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[
      js.Array[js.Array[js.Array[js.Array[scala.Boolean | scala.Double | java.lang.String]]]]
    ]) | scala.Boolean | scala.Double | java.lang.String
  ])
  type TypedArray = stdLib.Float32Array | stdLib.Int32Array | stdLib.Uint8Array
}
