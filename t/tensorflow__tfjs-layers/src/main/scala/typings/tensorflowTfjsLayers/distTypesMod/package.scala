package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Kwargs = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LossOrMetricFn = js.Function2[
    /* yTrue */ typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* yPred */ typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  type RegularizerFn = js.Function0[typings.tensorflowTfjsCore.tensorMod.Scalar]
  type RnnStepFunction = js.Function2[
    /* inputs */ typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* states */ js.Array[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    js.Tuple2[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank], 
      js.Array[
        typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  type TensorOrArrayOrMap = typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
}
