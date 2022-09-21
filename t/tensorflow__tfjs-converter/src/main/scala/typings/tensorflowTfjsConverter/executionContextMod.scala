package typings.tensorflowTfjsConverter

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionContextMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/execution_context", "ExecutionContext")
  @js.native
  open class ExecutionContext () extends StObject {
    def this(weightMap: NamedTensorsMap) = this()
    def this(weightMap: Unit, tensorArrayMap: TensorArrayMap) = this()
    def this(weightMap: NamedTensorsMap, tensorArrayMap: TensorArrayMap) = this()
    def this(weightMap: Unit, tensorArrayMap: Unit, tensorListMap: TensorListMap) = this()
    def this(weightMap: Unit, tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap) = this()
    def this(weightMap: NamedTensorsMap, tensorArrayMap: Unit, tensorListMap: TensorListMap) = this()
    def this(weightMap: NamedTensorsMap, tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap) = this()
    def this(
      weightMap: Unit,
      tensorArrayMap: Unit,
      tensorListMap: Unit,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: Unit,
      tensorArrayMap: Unit,
      tensorListMap: TensorListMap,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: Unit,
      tensorArrayMap: TensorArrayMap,
      tensorListMap: Unit,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: Unit,
      tensorArrayMap: TensorArrayMap,
      tensorListMap: TensorListMap,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: NamedTensorsMap,
      tensorArrayMap: Unit,
      tensorListMap: Unit,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: NamedTensorsMap,
      tensorArrayMap: Unit,
      tensorListMap: TensorListMap,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: NamedTensorsMap,
      tensorArrayMap: TensorArrayMap,
      tensorListMap: Unit,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    def this(
      weightMap: NamedTensorsMap,
      tensorArrayMap: TensorArrayMap,
      tensorListMap: TensorListMap,
      functionMap: StringDictionary[FunctionExecutor]
    ) = this()
    
    /* private */ var _currentContextIds: Any = js.native
    
    def addTensorArray(tensorArray: TensorArray): Unit = js.native
    
    def addTensorList(tensorList: TensorList): Unit = js.native
    
    /* private */ var contextIdforContexts: Any = js.native
    
    /* private */ var contexts: Any = js.native
    
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
    
    /* private */ var generateCurrentContextIds: Any = js.native
    
    def getTensorArray(id: Double): TensorArray = js.native
    
    def getTensorList(id: Double): TensorList = js.native
    
    def getWeight(name: String): js.Array[Tensor[Rank]] = js.native
    
    /* private */ var lastId: Any = js.native
    
    /* private */ var newFrame: Any = js.native
    
    /**
      * Enter the next iteration of a loop, the iteration id of last context is
      * increased.
      */
    def nextIteration(): Unit = js.native
    
    /* private */ var rootContext: Any = js.native
    
    val tensorArrayMap: TensorArrayMap = js.native
    
    val tensorListMap: TensorListMap = js.native
    
    val weightMap: NamedTensorsMap = js.native
  }
  
  trait ExecutionContextInfo extends StObject {
    
    var frameName: String
    
    var id: Double
    
    var iterationId: Double
  }
  object ExecutionContextInfo {
    
    inline def apply(frameName: String, id: Double, iterationId: Double): ExecutionContextInfo = {
      val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContextInfo]
    }
    
    extension [Self <: ExecutionContextInfo](x: Self) {
      
      inline def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    }
  }
}
