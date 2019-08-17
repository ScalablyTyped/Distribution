package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcDataTypesMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import typings.atTensorflowTfjsDashConverter.distSrcExecutorTensorUnderscoreArrayMod.TensorArray
  import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typings.atTensorflowTfjsDashCore.distTypesMod.Rank

  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  type NamedTensorsMap = StringDictionary[js.Array[Tensor[Rank]]]
  type TensorArrayMap = NumberDictionary[TensorArray]
}
