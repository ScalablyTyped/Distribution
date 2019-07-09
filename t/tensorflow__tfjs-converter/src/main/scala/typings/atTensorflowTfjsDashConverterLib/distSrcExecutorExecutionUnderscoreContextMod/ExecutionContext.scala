package typings
package atTensorflowTfjsDashConverterLib.distSrcExecutorExecutionUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/execution_context", "ExecutionContext")
@js.native
class ExecutionContext protected () extends js.Object {
  def this(weightMap: atTensorflowTfjsDashConverterLib.distSrcDataTypesMod.NamedTensorsMap, tensorArrayMap: atTensorflowTfjsDashConverterLib.distSrcDataTypesMod.TensorArrayMap) = this()
  var _currentContextIds: js.Any = js.native
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
  val currentContextId: java.lang.String = js.native
  /**
    * Returns the current context and all parent contexts in string format.
    * This allow access to the nodes in the current and parent frames.
    */
  val currentContextIds: js.Array[java.lang.String] = js.native
  var generateCurrentContextIds: js.Any = js.native
  var lastId: js.Any = js.native
  var newFrame: js.Any = js.native
  var rootContext: js.Any = js.native
  val tensorArrayMap: atTensorflowTfjsDashConverterLib.distSrcDataTypesMod.TensorArrayMap = js.native
  val weightMap: atTensorflowTfjsDashConverterLib.distSrcDataTypesMod.NamedTensorsMap = js.native
  def addTensorArray(tensorArray: atTensorflowTfjsDashConverterLib.distSrcExecutorTensorUnderscoreArrayMod.TensorArray): scala.Unit = js.native
  /**
    * Enter a new frame, a new context is pushed on the current context list.
    * @param frameId new frame id
    */
  def enterFrame(frameId: java.lang.String): scala.Unit = js.native
  /**
    * Exit the current frame, the last context is removed from the current
    * context list.
    */
  def exitFrame(): scala.Unit = js.native
  def getTensorArray(id: scala.Double): atTensorflowTfjsDashConverterLib.distSrcExecutorTensorUnderscoreArrayMod.TensorArray = js.native
  def getWeight(name: java.lang.String): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  /**
    * Enter the next iteration of a loop, the iteration id of last context is
    * increased.
    */
  def nextIteration(): scala.Unit = js.native
}

