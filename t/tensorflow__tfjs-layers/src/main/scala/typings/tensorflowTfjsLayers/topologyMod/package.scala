package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object topologyMod {
  
  type CallHook = js.Function2[
    /* inputs */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* kwargs */ typings.tensorflowTfjsLayers.distTypesMod.Kwargs, 
    scala.Unit
  ]
  
  type Op = js.Function1[
    /* x */ typings.tensorflowTfjsLayers.variablesMod.LayerVariable, 
    typings.tensorflowTfjsLayers.variablesMod.LayerVariable
  ]
}
