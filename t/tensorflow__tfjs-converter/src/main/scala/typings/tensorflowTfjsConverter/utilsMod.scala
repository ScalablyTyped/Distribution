package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typings.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cloneTensor(tensor: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneTensor")(tensor.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def getNodeNameAndIndex(inputName: String): js.Tuple2[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeNameAndIndex")(inputName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, Double]]
  @scala.inline
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext): js.Tuple2[String, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeNameAndIndex")(inputName.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, Double]]
  
  @scala.inline
  def getPadding(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")(node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  
  @scala.inline
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamValue")(paramName.asInstanceOf[js.Any], node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  @scala.inline
  def getParamValue(
    paramName: String,
    node: Node,
    tensorMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamValue")(paramName.asInstanceOf[js.Any], node.asInstanceOf[js.Any], tensorMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  
  @scala.inline
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensor")(name.asInstanceOf[js.Any], tensorsMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def getTensor(
    name: String,
    tensorsMap: NamedTensorsMap,
    context: ExecutionContext,
    resourceManager: ResourceManager
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensor")(name.asInstanceOf[js.Any], tensorsMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resourceManager.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def getTensorsForCurrentContenxt(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorsForCurrentContenxt")(name.asInstanceOf[js.Any], tensorsMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  
  @scala.inline
  def parseNodeName(name: String): js.Tuple2[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, Double]]
  
  @scala.inline
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(arr.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
