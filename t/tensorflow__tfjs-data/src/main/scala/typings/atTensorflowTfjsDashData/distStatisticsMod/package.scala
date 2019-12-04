package typings.atTensorflowTfjsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStatisticsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typings.atTensorflowTfjsDashCore.distTypesMod.Rank

  type DatasetStatistics = StringDictionary[NumericColumnStatistics]
  type ElementArray = Double | js.Array[Double] | Tensor[Rank] | String
  type TabularRecord = StringDictionary[ElementArray]
}
