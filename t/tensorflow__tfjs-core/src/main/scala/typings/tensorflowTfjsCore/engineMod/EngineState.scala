package typings.tensorflowTfjsCore.engineMod

import typings.std.WeakMap
import typings.tensorflowTfjsCore.anon.Backend
import typings.tensorflowTfjsCore.tapeMod.TapeNode
import typings.tensorflowTfjsCore.tensorTypesMod.NamedVariableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineState extends js.Object {
  var activeProfile: ProfileInfo = js.native
  var activeScope: ScopeState = js.native
  var activeTape: js.Array[TapeNode] = js.native
  var gradientDepth: Double = js.native
  var kernelDepth: Double = js.native
  var nextScopeId: Double = js.native
  var nextTapeNodeId: Double = js.native
  var numBytes: Double = js.native
  var numDataBuffers: Double = js.native
  /**
    * Keeps track of the number of data moves during a kernel execution. We
    * maintain a stack since kernels can call other kernels, recursively.
    */
  var numDataMovesStack: js.Array[Double] = js.native
  var numStringTensors: Double = js.native
  var numTensors: Double = js.native
  var profiling: Boolean = js.native
  var registeredVariables: NamedVariableMap = js.native
  var scopeStack: js.Array[ScopeState] = js.native
  var tensorInfo: WeakMap[js.Object, Backend] = js.native
  def dispose(): Unit = js.native
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
    tensorInfo: WeakMap[js.Object, Backend]
  ): EngineState = {
    val __obj = js.Dynamic.literal(activeProfile = activeProfile.asInstanceOf[js.Any], activeScope = activeScope.asInstanceOf[js.Any], activeTape = activeTape.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth.asInstanceOf[js.Any], kernelDepth = kernelDepth.asInstanceOf[js.Any], nextScopeId = nextScopeId.asInstanceOf[js.Any], nextTapeNodeId = nextTapeNodeId.asInstanceOf[js.Any], numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numDataMovesStack = numDataMovesStack.asInstanceOf[js.Any], numStringTensors = numStringTensors.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], profiling = profiling.asInstanceOf[js.Any], registeredVariables = registeredVariables.asInstanceOf[js.Any], scopeStack = scopeStack.asInstanceOf[js.Any], tensorInfo = tensorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineState]
  }
  @scala.inline
  implicit class EngineStateOps[Self <: EngineState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveProfile(value: ProfileInfo): Self = this.set("activeProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveScope(value: ScopeState): Self = this.set("activeScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveTapeVarargs(value: TapeNode*): Self = this.set("activeTape", js.Array(value :_*))
    @scala.inline
    def setActiveTape(value: js.Array[TapeNode]): Self = this.set("activeTape", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGradientDepth(value: Double): Self = this.set("gradientDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernelDepth(value: Double): Self = this.set("kernelDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextScopeId(value: Double): Self = this.set("nextScopeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextTapeNodeId(value: Double): Self = this.set("nextTapeNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumBytes(value: Double): Self = this.set("numBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumDataBuffers(value: Double): Self = this.set("numDataBuffers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumDataMovesStackVarargs(value: Double*): Self = this.set("numDataMovesStack", js.Array(value :_*))
    @scala.inline
    def setNumDataMovesStack(value: js.Array[Double]): Self = this.set("numDataMovesStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumStringTensors(value: Double): Self = this.set("numStringTensors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumTensors(value: Double): Self = this.set("numTensors", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfiling(value: Boolean): Self = this.set("profiling", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisteredVariables(value: NamedVariableMap): Self = this.set("registeredVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeStackVarargs(value: ScopeState*): Self = this.set("scopeStack", js.Array(value :_*))
    @scala.inline
    def setScopeStack(value: js.Array[ScopeState]): Self = this.set("scopeStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTensorInfo(value: WeakMap[js.Object, Backend]): Self = this.set("tensorInfo", value.asInstanceOf[js.Any])
  }
  
}

