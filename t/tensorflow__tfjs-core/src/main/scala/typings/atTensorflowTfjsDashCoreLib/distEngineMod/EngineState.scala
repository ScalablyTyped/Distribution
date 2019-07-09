package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineState extends js.Object {
  var activeProfile: ProfileInfo
  var activeScope: ScopeState
  var activeTape: js.Array[atTensorflowTfjsDashCoreLib.distTapeMod.TapeNode]
  var gradientDepth: scala.Double
  var kernelDepth: scala.Double
  var nextScopeId: scala.Double
  var nextTapeNodeId: scala.Double
  var numBytes: scala.Double
  var numDataBuffers: scala.Double
  var numStringTensors: scala.Double
  var numTensors: scala.Double
  var profiling: scala.Boolean
  var registeredVariables: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedVariableMap
  var scopeStack: js.Array[ScopeState]
  var tensorInfo: stdLib.WeakMap[js.Object, atTensorflowTfjsDashCoreLib.Anon_Backend]
  def dispose(): scala.Unit
}

object EngineState {
  @scala.inline
  def apply(
    activeProfile: ProfileInfo,
    activeScope: ScopeState,
    activeTape: js.Array[atTensorflowTfjsDashCoreLib.distTapeMod.TapeNode],
    dispose: () => scala.Unit,
    gradientDepth: scala.Double,
    kernelDepth: scala.Double,
    nextScopeId: scala.Double,
    nextTapeNodeId: scala.Double,
    numBytes: scala.Double,
    numDataBuffers: scala.Double,
    numStringTensors: scala.Double,
    numTensors: scala.Double,
    profiling: scala.Boolean,
    registeredVariables: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedVariableMap,
    scopeStack: js.Array[ScopeState],
    tensorInfo: stdLib.WeakMap[js.Object, atTensorflowTfjsDashCoreLib.Anon_Backend]
  ): EngineState = {
    val __obj = js.Dynamic.literal(activeProfile = activeProfile, activeScope = activeScope, activeTape = activeTape, dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth, kernelDepth = kernelDepth, nextScopeId = nextScopeId, nextTapeNodeId = nextTapeNodeId, numBytes = numBytes, numDataBuffers = numDataBuffers, numStringTensors = numStringTensors, numTensors = numTensors, profiling = profiling, registeredVariables = registeredVariables, scopeStack = scopeStack, tensorInfo = tensorInfo)
  
    __obj.asInstanceOf[EngineState]
  }
}

