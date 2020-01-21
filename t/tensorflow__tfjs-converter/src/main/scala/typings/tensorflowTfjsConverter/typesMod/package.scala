package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  type NamedTensorsMap = org.scalablytyped.runtime.StringDictionary[
    js.Array[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]
  type TensorArrayMap = org.scalablytyped.runtime.NumberDictionary[typings.tensorflowTfjsConverter.tensorArrayMod.TensorArray]
}
