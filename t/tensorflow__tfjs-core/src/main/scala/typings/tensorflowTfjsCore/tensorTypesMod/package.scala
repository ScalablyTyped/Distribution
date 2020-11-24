package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tensorTypesMod {
  
  type GradSaveFunc = js.Function1[
    /* save */ js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    scala.Unit
  ]
  
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type NamedVariableMap = org.scalablytyped.runtime.StringDictionary[
    typings.tensorflowTfjsCore.distTensorMod.Variable[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.tensorflowTfjsCore.tensorTypesMod.TensorContainerObject
    - typings.tensorflowTfjsCore.tensorTypesMod.TensorContainerArray
    - typings.std.Float32Array
    - typings.std.Int32Array
    - typings.std.Uint8Array
  */
  type TensorContainer = typings.tensorflowTfjsCore.tensorTypesMod._TensorContainer | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | scala.Unit | java.lang.String | scala.Double | scala.Boolean | typings.std.Float32Array | typings.std.Int32Array | typings.std.Uint8Array
}
