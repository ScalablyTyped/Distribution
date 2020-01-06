package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.std.Float32Array
  import typings.std.Int32Array
  import typings.std.Uint8Array

  type BackendValues = Float32Array | Int32Array | Uint8Array | js.Array[Uint8Array]
  type DataValues = js.Array[String] | Float32Array | Int32Array | Uint8Array
  type FlatVector = (js.Array[Boolean | Double]) | TypedArray
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  type ScalarLike = Double | Boolean | String | Uint8Array
  type TensorLike = TypedArray | Double | Boolean | String | (RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]) | js.Array[Uint8Array]
  type TensorLike1D = TypedArray | (js.Array[Boolean | Double | String | Uint8Array])
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[Boolean | Double | String | Uint8Array]) | Boolean | Double | String | Uint8Array
  ])
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[Boolean | Double | String | Uint8Array]]) | Boolean | Double | String | Uint8Array
  ])
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[Boolean | Double | String | Uint8Array]]]) | Boolean | Double | String | Uint8Array
  ])
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[js.Array[Boolean | Double | String | Uint8Array]]]]) | Boolean | Double | String | Uint8Array
  ])
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[js.Array[(js.Array[Boolean | Double | String]) | Uint8Array]]]]) | Boolean | Double | String | Uint8Array
  ])
  type TypedArray = Float32Array | Int32Array | Uint8Array
}
