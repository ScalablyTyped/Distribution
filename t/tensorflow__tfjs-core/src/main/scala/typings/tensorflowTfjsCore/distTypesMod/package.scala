package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distTypesMod {
  
  type BackendValues = typings.std.Float32Array | typings.std.Int32Array | typings.std.Uint8Array | js.Array[typings.std.Uint8Array]
  
  type FlatVector = (js.Array[scala.Boolean | scala.Double]) | typings.tensorflowTfjsCore.distTypesMod.TypedArray
  
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  
  type ScalarLike = scala.Double | scala.Boolean | java.lang.String | typings.std.Uint8Array
  
  type TensorLike = typings.tensorflowTfjsCore.distTypesMod.TypedArray | scala.Double | scala.Boolean | java.lang.String | (typings.tensorflowTfjsCore.distTypesMod.RecursiveArray[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typings.tensorflowTfjsCore.distTypesMod.TypedArray
  ]) | js.Array[typings.std.Uint8Array]
  
  type TensorLike1D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array])
  
  type TensorLike2D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array]) | scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array
  ])
  
  type TensorLike3D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array]
    ]) | scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array
  ])
  
  type TensorLike4D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array
  ])
  
  type TensorLike5D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array
  ])
  
  type TensorLike6D = typings.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[
            (js.Array[scala.Boolean | scala.Double | java.lang.String]) | typings.std.Uint8Array
          ]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | typings.std.Uint8Array
  ])
  
  type TypedArray = typings.std.Float32Array | typings.std.Int32Array | typings.std.Uint8Array
}
