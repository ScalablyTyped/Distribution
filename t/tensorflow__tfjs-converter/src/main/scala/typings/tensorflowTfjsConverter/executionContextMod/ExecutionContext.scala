package typings.tensorflowTfjsConverter.executionContextMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.tensorflowTfjsConverter.executorTypesMod.FunctionExecutor
import typings.tensorflowTfjsConverter.tensorArrayMod.TensorArray
import typings.tensorflowTfjsConverter.tensorListMod.TensorList
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.typesMod.TensorArrayMap
import typings.tensorflowTfjsConverter.typesMod.TensorListMap
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/execution_context", "ExecutionContext")
@js.native
class ExecutionContext () extends js.Object {
  def this(weightMap: NamedTensorsMap) = this()
  def this(weightMap: js.UndefOr[scala.Nothing], tensorArrayMap: TensorArrayMap) = this()
  def this(weightMap: NamedTensorsMap, tensorArrayMap: TensorArrayMap) = this()
  def this(
    weightMap: js.UndefOr[scala.Nothing],
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: TensorListMap
  ) = this()
  def this(weightMap: js.UndefOr[scala.Nothing], tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: TensorListMap
  ) = this()
  def this(weightMap: NamedTensorsMap, tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap) = this()
  def this(
    weightMap: js.UndefOr[scala.Nothing],
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: js.UndefOr[scala.Nothing],
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: js.UndefOr[scala.Nothing],
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: TensorListMap,
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: js.UndefOr[scala.Nothing],
    tensorArrayMap: TensorArrayMap,
    tensorListMap: js.UndefOr[scala.Nothing],
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: js.UndefOr[scala.Nothing],
    tensorArrayMap: TensorArrayMap,
    tensorListMap: TensorListMap,
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: js.UndefOr[scala.Nothing],
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: js.UndefOr[scala.Nothing],
    tensorListMap: TensorListMap,
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: TensorArrayMap,
    tensorListMap: js.UndefOr[scala.Nothing],
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  def this(
    weightMap: NamedTensorsMap,
    tensorArrayMap: TensorArrayMap,
    tensorListMap: TensorListMap,
    functionMap: StringDictionary[FunctionExecutor]
  ) = this()
  
  var _currentContextIds: js.Any = js.native
  
  def addTensorArray(tensorArray: TensorArray): Unit = js.native
  
  def addTensorList(tensorList: TensorList): Unit = js.native
  
  var contextIdforContexts: js.Any = js.native
  
  var contexts: js.Any = js.native
  
  /**
    * Set the current context
    * @param contexts: ExecutionContextInfo[] the current path of execution
    * frames
    */
  var currentContext: js.Array[ExecutionContextInfo] = js.native
  
  /**
    * Returns the current context in string format.
    */
  val currentContextId: String = js.native
  
  /**
    * Returns the current context and all parent contexts in string format.
    * This allow access to the nodes in the current and parent frames.
    */
  val currentContextIds: js.Array[String] = js.native
  
  def dispose(keepIds: Set[Double]): Unit = js.native
  
  /**
    * Enter a new frame, a new context is pushed on the current context list.
    * @param frameId new frame id
    */
  def enterFrame(frameId: String): Unit = js.native
  
  /**
    * Exit the current frame, the last context is removed from the current
    * context list.
    */
  def exitFrame(): Unit = js.native
  
  val functionMap: StringDictionary[FunctionExecutor] = js.native
  
  var generateCurrentContextIds: js.Any = js.native
  
  def getTensorArray(id: Double): TensorArray = js.native
  
  def getTensorList(id: Double): TensorList = js.native
  
  def getWeight(name: String): js.Array[Tensor[Rank]] = js.native
  
  var lastId: js.Any = js.native
  
  var newFrame: js.Any = js.native
  
  /**
    * Enter the next iteration of a loop, the iteration id of last context is
    * increased.
    */
  def nextIteration(): Unit = js.native
  
  var rootContext: js.Any = js.native
  
  val tensorArrayMap: TensorArrayMap = js.native
  
  val tensorListMap: TensorListMap = js.native
  
  val weightMap: NamedTensorsMap = js.native
}
