package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineTopologyMod {
  type CallHook = js.Function2[
    /* inputs */ atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]), 
    /* kwargs */ atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs, 
    scala.Unit
  ]
  type Op = js.Function1[
    /* x */ atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable, 
    atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable
  ]
}
