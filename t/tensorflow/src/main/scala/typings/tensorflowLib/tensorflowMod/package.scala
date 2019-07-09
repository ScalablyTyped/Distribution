package typings
package tensorflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tensorflowMod {
  type SessionRunInputs = org.scalablytyped.runtime.StringDictionary[Tensor | TensorValue]
  type SessionRunOutputs = java.lang.String | js.Array[java.lang.String]
  type SessionRunResult = Tensor | TensorMap
  type SessionRunTargets = java.lang.String | js.Array[java.lang.String]
  type TensorData = stdLib.Number
  type TensorMap = org.scalablytyped.runtime.StringDictionary[Tensor]
  type TensorValue = TensorData | (js.Array[
    (js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData
  ])
}
