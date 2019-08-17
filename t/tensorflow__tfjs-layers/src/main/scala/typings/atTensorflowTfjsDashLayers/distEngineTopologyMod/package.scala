package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineTopologyMod {
  import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
  import typings.atTensorflowTfjsDashLayers.distTypesMod.Kwargs
  import typings.atTensorflowTfjsDashLayers.distVariablesMod.LayerVariable

  type CallHook = js.Function2[/* inputs */ Tensor[Rank] | js.Array[Tensor[Rank]], /* kwargs */ Kwargs, Unit]
  type Op = js.Function1[/* x */ LayerVariable, LayerVariable]
}
