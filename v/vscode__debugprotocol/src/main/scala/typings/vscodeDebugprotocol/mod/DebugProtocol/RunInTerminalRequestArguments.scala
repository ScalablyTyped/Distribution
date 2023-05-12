package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.external
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.integrated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `runInTerminal` request. */
trait RunInTerminalRequestArguments extends StObject {
  
  /** List of arguments. The first argument is the command to run. */
  var args: js.Array[String]
  
  /** This property should only be set if the corresponding capability `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell to launch the application, then the client must not attempt to escape characters with special meanings for the shell. The user is fully responsible for escaping as needed and that arguments using special characters may not be portable across shells. */
  var argsCanBeInterpretedByShell: js.UndefOr[Boolean] = js.undefined
  
  /** Working directory for the command. For non-empty, valid paths this typically results in execution of a change directory command. */
  var cwd: String
  
  /** Environment key-value pairs that are added to or removed from the default environment. */
  var env: js.UndefOr[StringDictionary[String | Null]] = js.undefined
  
  /** What kind of terminal to launch. Defaults to `integrated` if not specified. */
  var kind: js.UndefOr[integrated | external] = js.undefined
  
  /** Title of the terminal. */
  var title: js.UndefOr[String] = js.undefined
}
object RunInTerminalRequestArguments {
  
  inline def apply(args: js.Array[String], cwd: String): RunInTerminalRequestArguments = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInTerminalRequestArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunInTerminalRequestArguments] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsCanBeInterpretedByShell(value: Boolean): Self = StObject.set(x, "argsCanBeInterpretedByShell", value.asInstanceOf[js.Any])
    
    inline def setArgsCanBeInterpretedByShellUndefined: Self = StObject.set(x, "argsCanBeInterpretedByShell", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: StringDictionary[String | Null]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setKind(value: integrated | external): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
