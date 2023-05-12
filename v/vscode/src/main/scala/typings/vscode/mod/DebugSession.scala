package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSession extends StObject {
  
  /**
  		 * The "resolved" {@link DebugConfiguration debug configuration} of this session.
  		 * "Resolved" means that
  		 * - all variables have been substituted and
  		 * - platform specific attribute sections have been "flattened" for the matching platform and removed for non-matching platforms.
  		 */
  val configuration: DebugConfiguration = js.native
  
  /**
  		 * Send a custom request to the debug adapter.
  		 */
  def customRequest(command: String): Thenable[Any] = js.native
  def customRequest(command: String, args: Any): Thenable[Any] = js.native
  
  /**
  		 * Maps a breakpoint in the editor to the corresponding Debug Adapter Protocol (DAP) breakpoint that is managed by the debug adapter of the debug session.
  		 * If no DAP breakpoint exists (either because the editor breakpoint was not yet registered or because the debug adapter is not interested in the breakpoint), the value `undefined` is returned.
  		 *
  		 * @param breakpoint A {@link Breakpoint} in the editor.
  		 * @return A promise that resolves to the Debug Adapter Protocol breakpoint or `undefined`.
  		 */
  def getDebugProtocolBreakpoint(breakpoint: Breakpoint): Thenable[js.UndefOr[DebugProtocolBreakpoint]] = js.native
  
  /**
  		 * The unique ID of this debug session.
  		 */
  val id: String = js.native
  
  /**
  		 * The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
  		 * Any changes will be properly reflected in the UI.
  		 */
  var name: String = js.native
  
  /**
  		 * The parent session of this debug session, if it was created as a child.
  		 * @see DebugSessionOptions.parentSession
  		 */
  val parentSession: js.UndefOr[DebugSession] = js.native
  
  /**
  		 * The debug session's type from the {@link DebugConfiguration debug configuration}.
  		 */
  val `type`: String = js.native
  
  /**
  		 * The workspace folder of this session or `undefined` for a folderless setup.
  		 */
  val workspaceFolder: js.UndefOr[WorkspaceFolder] = js.native
}
