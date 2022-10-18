package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.anon.FnCall
import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.distExecutorExecutionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.distExecutorResourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Node
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsOperationExecutorMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
  inline def executeOp(
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: Unit,
    tidy: FnCall
  ): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any], tidy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
  inline def executeOp(
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
  inline def executeOp(
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager,
    tidy: FnCall
  ): js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeOp")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any], tidy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]] | js.Promise[js.Array[Tensor[Rank]]]]
}
