package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distTypesMod {
  
  type Kwargs = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type LossOrMetricFn = js.Function2[
    /* yTrue */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* yPred */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type RegularizerFn = js.Function0[typings.tensorflowTfjsCore.distTensorMod.Scalar]
  
  type RnnStepFunction = js.Function2[
    /* inputs */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* states */ js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    js.Tuple2[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
      js.Array[
        typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  
  type TensorOrArrayOrMap = typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
}
