package typings.tensorflow

import org.scalablytyped.runtime.StringDictionary
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tensorflowMod {
  type SessionRunInputs = StringDictionary[Tensor | TensorValue]
  type SessionRunOutputs = String | js.Array[String]
  type SessionRunResult = Tensor | TensorMap
  type SessionRunTargets = String | js.Array[String]
  type TensorData = Number
  type TensorMap = StringDictionary[Tensor]
  type TensorValue = TensorData | (js.Array[
    (js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData
  ])
}
