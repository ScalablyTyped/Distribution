package typings.atTensorflowTfjsDashCore.distEngineMod

import typings.atTensorflowTfjsDashCore.Anon_Backend
import typings.atTensorflowTfjsDashCore.distTapeMod.TapeNode
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedVariableMap
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineState extends js.Object {
  var activeProfile: ProfileInfo
  var activeScope: ScopeState
  var activeTape: js.Array[TapeNode]
  var gradientDepth: Double
  var kernelDepth: Double
  var nextScopeId: Double
  var nextTapeNodeId: Double
  var numBytes: Double
  var numDataBuffers: Double
  /**
    * Keeps track of the number of data moves during a kernel execution. We
    * maintain a stack since kernels can call other kernels, recursively.
    */
  var numDataMovesStack: js.Array[Double]
  var numStringTensors: Double
  var numTensors: Double
  var profiling: Boolean
  var registeredVariables: NamedVariableMap
  var scopeStack: js.Array[ScopeState]
  var tensorInfo: WeakMap[js.Object, Anon_Backend]
  def dispose(): Unit
}

object EngineState {
  @scala.inline
  def apply(
    activeProfile: ProfileInfo,
    activeScope: ScopeState,
    activeTape: js.Array[TapeNode],
    dispose: () => Unit,
    gradientDepth: Double,
    kernelDepth: Double,
    nextScopeId: Double,
    nextTapeNodeId: Double,
    numBytes: Double,
    numDataBuffers: Double,
    numDataMovesStack: js.Array[Double],
    numStringTensors: Double,
    numTensors: Double,
    profiling: Boolean,
    registeredVariables: NamedVariableMap,
    scopeStack: js.Array[ScopeState],
    tensorInfo: WeakMap[js.Object, Anon_Backend]
  ): EngineState = {
    val __obj = js.Dynamic.literal(activeProfile = activeProfile, activeScope = activeScope, activeTape = activeTape, dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth, kernelDepth = kernelDepth, nextScopeId = nextScopeId, nextTapeNodeId = nextTapeNodeId, numBytes = numBytes, numDataBuffers = numDataBuffers, numDataMovesStack = numDataMovesStack, numStringTensors = numStringTensors, numTensors = numTensors, profiling = profiling, registeredVariables = registeredVariables, scopeStack = scopeStack, tensorInfo = tensorInfo)
  
    __obj.asInstanceOf[EngineState]
  }
}

