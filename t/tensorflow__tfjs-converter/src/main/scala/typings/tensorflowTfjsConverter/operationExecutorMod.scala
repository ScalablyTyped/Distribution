package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationExecutorMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
  inline def executeOp(
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
}
