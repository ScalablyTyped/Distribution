package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type HashTableMap = org.scalablytyped.runtime.NumberDictionary[typings.tensorflowTfjsConverter.hashTableMod.HashTable]
  
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type NamedTensorsMap = org.scalablytyped.runtime.StringDictionary[
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]
  
  type TensorArrayMap = org.scalablytyped.runtime.NumberDictionary[typings.tensorflowTfjsConverter.tensorArrayMod.TensorArray]
  
  type TensorListMap = org.scalablytyped.runtime.NumberDictionary[typings.tensorflowTfjsConverter.tensorListMod.TensorList]
}
