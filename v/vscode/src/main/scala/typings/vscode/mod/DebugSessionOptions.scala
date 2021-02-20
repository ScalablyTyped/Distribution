package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSessionOptions extends StObject {
  
  /**
    * Controls if the debug session's parent session is shown in the CALL STACK view even if it has only a single child.
    * By default, the debug session will never hide its parent.
    * If compact is true, debug sessions with a single child are hidden in the CALL STACK view to make the tree more compact.
    */
  var compact: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether this session should have a separate debug console or share it
    * with the parent session. Has no effect for sessions which do not have a parent session.
    * Defaults to Separate.
    */
  var consoleMode: js.UndefOr[DebugConsoleMode] = js.native
  
  /**
    * Controls whether this session should run without debugging, thus ignoring breakpoints.
    * When this property is not specified, the value from the parent session (if there is one) is used.
    */
  var noDebug: js.UndefOr[Boolean] = js.native
  
  /**
    * When specified the newly created debug session is registered as a "child" session of this
    * "parent" debug session.
    */
  var parentSession: js.UndefOr[DebugSession] = js.native
}
object DebugSessionOptions {
  
  @scala.inline
  def apply(): DebugSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSessionOptions]
  }
  
  @scala.inline
  implicit class DebugSessionOptionsMutableBuilder[Self <: DebugSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setConsoleMode(value: DebugConsoleMode): Self = StObject.set(x, "consoleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleModeUndefined: Self = StObject.set(x, "consoleMode", js.undefined)
    
    @scala.inline
    def setNoDebug(value: Boolean): Self = StObject.set(x, "noDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDebugUndefined: Self = StObject.set(x, "noDebug", js.undefined)
    
    @scala.inline
    def setParentSession(value: DebugSession): Self = StObject.set(x, "parentSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSessionUndefined: Self = StObject.set(x, "parentSession", js.undefined)
  }
}
