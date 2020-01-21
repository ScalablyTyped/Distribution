package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operationsTypesMod {
  type InternalOpExecutor = js.Function3[
    /* node */ typings.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type OpExecutor = js.Function1[
    /* node */ typings.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type ValueType = java.lang.String | (js.Array[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | scala.Double | scala.Boolean | typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
}
