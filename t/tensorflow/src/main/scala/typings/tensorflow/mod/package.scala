package typings.tensorflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SessionRunInputs = org.scalablytyped.runtime.StringDictionary[typings.tensorflow.mod.Tensor_ | typings.tensorflow.mod.TensorValue]
  
  type SessionRunOutputs = java.lang.String | js.Array[java.lang.String]
  
  type SessionRunResult = typings.tensorflow.mod.Tensor_ | typings.tensorflow.mod.TensorMap
  
  type SessionRunTargets = java.lang.String | js.Array[java.lang.String]
  
  type TensorData = typings.std.Number
  
  type TensorMap = org.scalablytyped.runtime.StringDictionary[typings.tensorflow.mod.Tensor_]
  
  type TensorValue = typings.tensorflow.mod.TensorData | (js.Array[
    (js.Array[
      (js.Array[js.Array[typings.tensorflow.mod.TensorData] | typings.tensorflow.mod.TensorData]) | typings.tensorflow.mod.TensorData
    ]) | typings.tensorflow.mod.TensorData
  ])
}
