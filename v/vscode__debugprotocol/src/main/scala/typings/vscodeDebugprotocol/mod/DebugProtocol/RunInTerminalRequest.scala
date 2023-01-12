package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RunInTerminal request; value of command field is 'runInTerminal'.
		This request is sent from the debug adapter to the client to run a command in a terminal.
		This is typically used to launch the debuggee in a terminal provided by the client.
		This request should only be called if the corresponding capability `supportsRunInTerminalRequest` is true.
		Client implementations of `runInTerminal` are free to run the command however they choose including issuing the command to a command line interpreter (aka 'shell'). Argument strings passed to the `runInTerminal` request must arrive verbatim in the command to be run. As a consequence, clients which use a shell are responsible for escaping any special shell characters in the argument strings to prevent them from being interpreted (and modified) by the shell.
		Some users may wish to take advantage of shell processing in the argument strings. For clients which implement `runInTerminal` using an intermediary shell, the `argsCanBeInterpretedByShell` property can be set to true. In this case the client is requested not to escape any special shell characters in the argument strings.
	*/
trait RunInTerminalRequest
  extends StObject
     with Request {
  
  // command: 'runInTerminal';
  @JSName("arguments")
  var arguments_RunInTerminalRequest: RunInTerminalRequestArguments
}
object RunInTerminalRequest {
  
  inline def apply(
    arguments: RunInTerminalRequestArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): RunInTerminalRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInTerminalRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunInTerminalRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: RunInTerminalRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
