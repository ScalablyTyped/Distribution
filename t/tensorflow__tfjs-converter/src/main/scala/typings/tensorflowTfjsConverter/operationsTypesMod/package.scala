package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object operationsTypesMod {
  
  type InternalOpAsyncExecutor = js.Function4[
    /* node */ typings.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    /* resourceManager */ js.UndefOr[typings.tensorflowTfjsConverter.resourceManagerMod.ResourceManager], 
    js.Promise[
      js.Array[
        typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  
  type InternalOpExecutor = js.Function3[
    /* node */ typings.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ])
  ]
  
  type OpExecutor = js.Function1[
    /* node */ typings.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  
  type ValueType = java.lang.String | (js.Array[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | scala.Double | scala.Boolean | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
}
