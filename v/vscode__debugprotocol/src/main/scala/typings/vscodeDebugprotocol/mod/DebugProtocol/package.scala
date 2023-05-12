package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Response to `attach` request. This is just an acknowledgement, so no body field is required. */
type AttachResponse = Response

/** Response to `cancel` request. This is just an acknowledgement, so no body field is required. */
type CancelResponse = Response

/** Response to `configurationDone` request. This is just an acknowledgement, so no body field is required. */
type ConfigurationDoneResponse = Response

/** Response to `disconnect` request. This is just an acknowledgement, so no body field is required. */
type DisconnectResponse = Response

/** Response to `goto` request. This is just an acknowledgement, so no body field is required. */
type GotoResponse = Response

/** Event message for 'initialized' event type.
		This event indicates that the debug adapter is ready to accept configuration requests (e.g. `setBreakpoints`, `setExceptionBreakpoints`).
		A debug adapter is expected to send this event when it is ready to accept configuration requests (but not before the `initialize` request has finished).
		The sequence of events/requests is as follows:
		- adapters sends `initialized` event (after the `initialize` request has returned)
		- client sends zero or more `setBreakpoints` requests
		- client sends one `setFunctionBreakpoints` request (if corresponding capability `supportsFunctionBreakpoints` is true)
		- client sends a `setExceptionBreakpoints` request if one or more `exceptionBreakpointFilters` have been defined (or if `supportsConfigurationDoneRequest` is not true)
		- client sends other future configuration requests
		- client sends one `configurationDone` request to indicate the end of the configuration.
	*/
type InitializedEvent = Event

/** Logical areas that can be invalidated by the `invalidated` event.
		Values: 
		'all': All previously fetched data has become invalid and needs to be refetched.
		'stacks': Previously fetched stack related data has become invalid and needs to be refetched.
		'threads': Previously fetched thread related data has become invalid and needs to be refetched.
		'variables': Previously fetched variable data has become invalid and needs to be refetched.
		etc.
	*/
/* Rewritten from type alias, can be one of: 
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.all
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.stacks
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.threads
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.variables
  - java.lang.String
*/
type InvalidatedAreas = _InvalidatedAreas | String

/** Response to `launch` request. This is just an acknowledgement, so no body field is required. */
type LaunchResponse = Response

/** Response to `next` request. This is just an acknowledgement, so no body field is required. */
type NextResponse = Response

/** Response to `pause` request. This is just an acknowledgement, so no body field is required. */
type PauseResponse = Response

/** Response to `restartFrame` request. This is just an acknowledgement, so no body field is required. */
type RestartFrameResponse = Response

/** Response to `restart` request. This is just an acknowledgement, so no body field is required. */
type RestartResponse = Response

/** Response to `reverseContinue` request. This is just an acknowledgement, so no body field is required. */
type ReverseContinueResponse = Response

/** Response to `startDebugging` request. This is just an acknowledgement, so no body field is required. */
type StartDebuggingResponse = Response

/** Response to `stepBack` request. This is just an acknowledgement, so no body field is required. */
type StepBackResponse = Response

/** Response to `stepIn` request. This is just an acknowledgement, so no body field is required. */
type StepInResponse = Response

/** Response to `stepOut` request. This is just an acknowledgement, so no body field is required. */
type StepOutResponse = Response

/** Response to `terminate` request. This is just an acknowledgement, so no body field is required. */
type TerminateResponse = Response

/** Response to `terminateThreads` request. This is just an acknowledgement, no body field is required. */
type TerminateThreadsResponse = Response

/** Threads request; value of command field is 'threads'.
		The request retrieves a list of all threads.
	*/
type ThreadsRequest = Request
