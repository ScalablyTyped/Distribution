package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the capabilities of a debug adapter. */
trait Capabilities extends StObject {
  
  /** The set of additional module information exposed by the debug adapter. */
  var additionalModuleColumns: js.UndefOr[js.Array[ColumnDescriptor]] = js.undefined
  
  /** The set of characters that should trigger completion in a REPL. If not specified, the UI should assume the `.` character. */
  var completionTriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Available exception filter options for the `setExceptionBreakpoints` request. */
  var exceptionBreakpointFilters: js.UndefOr[js.Array[ExceptionBreakpointsFilter]] = js.undefined
  
  /** The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request. */
  var supportSuspendDebuggee: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request. */
  var supportTerminateDebuggee: js.UndefOr[Boolean] = js.undefined
  
  /** Checksum algorithms supported by the debug adapter. */
  var supportedChecksumAlgorithms: js.UndefOr[js.Array[ChecksumAlgorithm]] = js.undefined
  
  /** The debug adapter supports the `breakpointLocations` request. */
  var supportsBreakpointLocationsRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `cancel` request. */
  var supportsCancelRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `clipboard` context value in the `evaluate` request. */
  var supportsClipboardContext: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `completions` request. */
  var supportsCompletionsRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports conditional breakpoints. */
  var supportsConditionalBreakpoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `configurationDone` request. */
  var supportsConfigurationDoneRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports data breakpoints. */
  var supportsDataBreakpoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the delayed loading of parts of the stack, which requires that both the `startFrame` and `levels` arguments and the `totalFrames` result of the `StackTrace` request are supported. */
  var supportsDelayedStackTraceLoading: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `disassemble` request. */
  var supportsDisassembleRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports a (side effect free) evaluate request for data hovers. */
  var supportsEvaluateForHovers: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports `filterOptions` as an argument on the `setExceptionBreakpoints` request. */
  var supportsExceptionFilterOptions: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `exceptionInfo` request. */
  var supportsExceptionInfoRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports `exceptionOptions` on the setExceptionBreakpoints request. */
  var supportsExceptionOptions: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports function breakpoints. */
  var supportsFunctionBreakpoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `gotoTargets` request. */
  var supportsGotoTargetsRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports breakpoints that break execution after a specified number of hits. */
  var supportsHitConditionalBreakpoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports adding breakpoints based on instruction references. */
  var supportsInstructionBreakpoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `loadedSources` request. */
  var supportsLoadedSourcesRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports logpoints by interpreting the `logMessage` attribute of the `SourceBreakpoint`. */
  var supportsLogPoints: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `modules` request. */
  var supportsModulesRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `readMemory` request. */
  var supportsReadMemoryRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports restarting a frame. */
  var supportsRestartFrame: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `restart` request. In this case a client should not implement `restart` by terminating and relaunching the adapter but by calling the RestartRequest. */
  var supportsRestartRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `setExpression` request. */
  var supportsSetExpression: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports setting a variable to a value. */
  var supportsSetVariable: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `singleThread` property on the execution requests (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`). */
  var supportsSingleThreadExecutionRequests: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports stepping back via the `stepBack` and `reverseContinue` requests. */
  var supportsStepBack: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `stepInTargets` request. */
  var supportsStepInTargetsRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports stepping granularities (argument `granularity`) for the stepping requests. */
  var supportsSteppingGranularity: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `terminate` request. */
  var supportsTerminateRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `terminateThreads` request. */
  var supportsTerminateThreadsRequest: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports a `format` attribute on the stackTraceRequest, variablesRequest, and evaluateRequest. */
  var supportsValueFormattingOptions: js.UndefOr[Boolean] = js.undefined
  
  /** The debug adapter supports the `writeMemory` request. */
  var supportsWriteMemoryRequest: js.UndefOr[Boolean] = js.undefined
}
object Capabilities {
  
  inline def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  
  extension [Self <: Capabilities](x: Self) {
    
    inline def setAdditionalModuleColumns(value: js.Array[ColumnDescriptor]): Self = StObject.set(x, "additionalModuleColumns", value.asInstanceOf[js.Any])
    
    inline def setAdditionalModuleColumnsUndefined: Self = StObject.set(x, "additionalModuleColumns", js.undefined)
    
    inline def setAdditionalModuleColumnsVarargs(value: ColumnDescriptor*): Self = StObject.set(x, "additionalModuleColumns", js.Array(value*))
    
    inline def setCompletionTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "completionTriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setCompletionTriggerCharactersUndefined: Self = StObject.set(x, "completionTriggerCharacters", js.undefined)
    
    inline def setCompletionTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "completionTriggerCharacters", js.Array(value*))
    
    inline def setExceptionBreakpointFilters(value: js.Array[ExceptionBreakpointsFilter]): Self = StObject.set(x, "exceptionBreakpointFilters", value.asInstanceOf[js.Any])
    
    inline def setExceptionBreakpointFiltersUndefined: Self = StObject.set(x, "exceptionBreakpointFilters", js.undefined)
    
    inline def setExceptionBreakpointFiltersVarargs(value: ExceptionBreakpointsFilter*): Self = StObject.set(x, "exceptionBreakpointFilters", js.Array(value*))
    
    inline def setSupportSuspendDebuggee(value: Boolean): Self = StObject.set(x, "supportSuspendDebuggee", value.asInstanceOf[js.Any])
    
    inline def setSupportSuspendDebuggeeUndefined: Self = StObject.set(x, "supportSuspendDebuggee", js.undefined)
    
    inline def setSupportTerminateDebuggee(value: Boolean): Self = StObject.set(x, "supportTerminateDebuggee", value.asInstanceOf[js.Any])
    
    inline def setSupportTerminateDebuggeeUndefined: Self = StObject.set(x, "supportTerminateDebuggee", js.undefined)
    
    inline def setSupportedChecksumAlgorithms(value: js.Array[ChecksumAlgorithm]): Self = StObject.set(x, "supportedChecksumAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSupportedChecksumAlgorithmsUndefined: Self = StObject.set(x, "supportedChecksumAlgorithms", js.undefined)
    
    inline def setSupportedChecksumAlgorithmsVarargs(value: ChecksumAlgorithm*): Self = StObject.set(x, "supportedChecksumAlgorithms", js.Array(value*))
    
    inline def setSupportsBreakpointLocationsRequest(value: Boolean): Self = StObject.set(x, "supportsBreakpointLocationsRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsBreakpointLocationsRequestUndefined: Self = StObject.set(x, "supportsBreakpointLocationsRequest", js.undefined)
    
    inline def setSupportsCancelRequest(value: Boolean): Self = StObject.set(x, "supportsCancelRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsCancelRequestUndefined: Self = StObject.set(x, "supportsCancelRequest", js.undefined)
    
    inline def setSupportsClipboardContext(value: Boolean): Self = StObject.set(x, "supportsClipboardContext", value.asInstanceOf[js.Any])
    
    inline def setSupportsClipboardContextUndefined: Self = StObject.set(x, "supportsClipboardContext", js.undefined)
    
    inline def setSupportsCompletionsRequest(value: Boolean): Self = StObject.set(x, "supportsCompletionsRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsCompletionsRequestUndefined: Self = StObject.set(x, "supportsCompletionsRequest", js.undefined)
    
    inline def setSupportsConditionalBreakpoints(value: Boolean): Self = StObject.set(x, "supportsConditionalBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsConditionalBreakpointsUndefined: Self = StObject.set(x, "supportsConditionalBreakpoints", js.undefined)
    
    inline def setSupportsConfigurationDoneRequest(value: Boolean): Self = StObject.set(x, "supportsConfigurationDoneRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsConfigurationDoneRequestUndefined: Self = StObject.set(x, "supportsConfigurationDoneRequest", js.undefined)
    
    inline def setSupportsDataBreakpoints(value: Boolean): Self = StObject.set(x, "supportsDataBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsDataBreakpointsUndefined: Self = StObject.set(x, "supportsDataBreakpoints", js.undefined)
    
    inline def setSupportsDelayedStackTraceLoading(value: Boolean): Self = StObject.set(x, "supportsDelayedStackTraceLoading", value.asInstanceOf[js.Any])
    
    inline def setSupportsDelayedStackTraceLoadingUndefined: Self = StObject.set(x, "supportsDelayedStackTraceLoading", js.undefined)
    
    inline def setSupportsDisassembleRequest(value: Boolean): Self = StObject.set(x, "supportsDisassembleRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsDisassembleRequestUndefined: Self = StObject.set(x, "supportsDisassembleRequest", js.undefined)
    
    inline def setSupportsEvaluateForHovers(value: Boolean): Self = StObject.set(x, "supportsEvaluateForHovers", value.asInstanceOf[js.Any])
    
    inline def setSupportsEvaluateForHoversUndefined: Self = StObject.set(x, "supportsEvaluateForHovers", js.undefined)
    
    inline def setSupportsExceptionFilterOptions(value: Boolean): Self = StObject.set(x, "supportsExceptionFilterOptions", value.asInstanceOf[js.Any])
    
    inline def setSupportsExceptionFilterOptionsUndefined: Self = StObject.set(x, "supportsExceptionFilterOptions", js.undefined)
    
    inline def setSupportsExceptionInfoRequest(value: Boolean): Self = StObject.set(x, "supportsExceptionInfoRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsExceptionInfoRequestUndefined: Self = StObject.set(x, "supportsExceptionInfoRequest", js.undefined)
    
    inline def setSupportsExceptionOptions(value: Boolean): Self = StObject.set(x, "supportsExceptionOptions", value.asInstanceOf[js.Any])
    
    inline def setSupportsExceptionOptionsUndefined: Self = StObject.set(x, "supportsExceptionOptions", js.undefined)
    
    inline def setSupportsFunctionBreakpoints(value: Boolean): Self = StObject.set(x, "supportsFunctionBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsFunctionBreakpointsUndefined: Self = StObject.set(x, "supportsFunctionBreakpoints", js.undefined)
    
    inline def setSupportsGotoTargetsRequest(value: Boolean): Self = StObject.set(x, "supportsGotoTargetsRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsGotoTargetsRequestUndefined: Self = StObject.set(x, "supportsGotoTargetsRequest", js.undefined)
    
    inline def setSupportsHitConditionalBreakpoints(value: Boolean): Self = StObject.set(x, "supportsHitConditionalBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsHitConditionalBreakpointsUndefined: Self = StObject.set(x, "supportsHitConditionalBreakpoints", js.undefined)
    
    inline def setSupportsInstructionBreakpoints(value: Boolean): Self = StObject.set(x, "supportsInstructionBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsInstructionBreakpointsUndefined: Self = StObject.set(x, "supportsInstructionBreakpoints", js.undefined)
    
    inline def setSupportsLoadedSourcesRequest(value: Boolean): Self = StObject.set(x, "supportsLoadedSourcesRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsLoadedSourcesRequestUndefined: Self = StObject.set(x, "supportsLoadedSourcesRequest", js.undefined)
    
    inline def setSupportsLogPoints(value: Boolean): Self = StObject.set(x, "supportsLogPoints", value.asInstanceOf[js.Any])
    
    inline def setSupportsLogPointsUndefined: Self = StObject.set(x, "supportsLogPoints", js.undefined)
    
    inline def setSupportsModulesRequest(value: Boolean): Self = StObject.set(x, "supportsModulesRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsModulesRequestUndefined: Self = StObject.set(x, "supportsModulesRequest", js.undefined)
    
    inline def setSupportsReadMemoryRequest(value: Boolean): Self = StObject.set(x, "supportsReadMemoryRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsReadMemoryRequestUndefined: Self = StObject.set(x, "supportsReadMemoryRequest", js.undefined)
    
    inline def setSupportsRestartFrame(value: Boolean): Self = StObject.set(x, "supportsRestartFrame", value.asInstanceOf[js.Any])
    
    inline def setSupportsRestartFrameUndefined: Self = StObject.set(x, "supportsRestartFrame", js.undefined)
    
    inline def setSupportsRestartRequest(value: Boolean): Self = StObject.set(x, "supportsRestartRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsRestartRequestUndefined: Self = StObject.set(x, "supportsRestartRequest", js.undefined)
    
    inline def setSupportsSetExpression(value: Boolean): Self = StObject.set(x, "supportsSetExpression", value.asInstanceOf[js.Any])
    
    inline def setSupportsSetExpressionUndefined: Self = StObject.set(x, "supportsSetExpression", js.undefined)
    
    inline def setSupportsSetVariable(value: Boolean): Self = StObject.set(x, "supportsSetVariable", value.asInstanceOf[js.Any])
    
    inline def setSupportsSetVariableUndefined: Self = StObject.set(x, "supportsSetVariable", js.undefined)
    
    inline def setSupportsSingleThreadExecutionRequests(value: Boolean): Self = StObject.set(x, "supportsSingleThreadExecutionRequests", value.asInstanceOf[js.Any])
    
    inline def setSupportsSingleThreadExecutionRequestsUndefined: Self = StObject.set(x, "supportsSingleThreadExecutionRequests", js.undefined)
    
    inline def setSupportsStepBack(value: Boolean): Self = StObject.set(x, "supportsStepBack", value.asInstanceOf[js.Any])
    
    inline def setSupportsStepBackUndefined: Self = StObject.set(x, "supportsStepBack", js.undefined)
    
    inline def setSupportsStepInTargetsRequest(value: Boolean): Self = StObject.set(x, "supportsStepInTargetsRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsStepInTargetsRequestUndefined: Self = StObject.set(x, "supportsStepInTargetsRequest", js.undefined)
    
    inline def setSupportsSteppingGranularity(value: Boolean): Self = StObject.set(x, "supportsSteppingGranularity", value.asInstanceOf[js.Any])
    
    inline def setSupportsSteppingGranularityUndefined: Self = StObject.set(x, "supportsSteppingGranularity", js.undefined)
    
    inline def setSupportsTerminateRequest(value: Boolean): Self = StObject.set(x, "supportsTerminateRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsTerminateRequestUndefined: Self = StObject.set(x, "supportsTerminateRequest", js.undefined)
    
    inline def setSupportsTerminateThreadsRequest(value: Boolean): Self = StObject.set(x, "supportsTerminateThreadsRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsTerminateThreadsRequestUndefined: Self = StObject.set(x, "supportsTerminateThreadsRequest", js.undefined)
    
    inline def setSupportsValueFormattingOptions(value: Boolean): Self = StObject.set(x, "supportsValueFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setSupportsValueFormattingOptionsUndefined: Self = StObject.set(x, "supportsValueFormattingOptions", js.undefined)
    
    inline def setSupportsWriteMemoryRequest(value: Boolean): Self = StObject.set(x, "supportsWriteMemoryRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsWriteMemoryRequestUndefined: Self = StObject.set(x, "supportsWriteMemoryRequest", js.undefined)
  }
}
