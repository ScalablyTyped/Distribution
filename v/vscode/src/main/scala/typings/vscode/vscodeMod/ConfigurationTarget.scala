package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConfigurationTarget extends js.Object

@JSImport("vscode", "ConfigurationTarget")
@js.native
object ConfigurationTarget extends js.Object {
  /**
  		 * Global configuration
  		*/
  @js.native
  sealed trait Global extends ConfigurationTarget
  
  /**
  		 * Workspace configuration
  		 */
  @js.native
  sealed trait Workspace extends ConfigurationTarget
  
  /**
  		 * Workspace folder configuration
  		 */
  @js.native
  sealed trait WorkspaceFolder extends ConfigurationTarget
  
  /* 1 */ val Global: typings.vscode.vscodeMod.ConfigurationTarget.Global with Double = js.native
  /* 2 */ val Workspace: typings.vscode.vscodeMod.ConfigurationTarget.Workspace with Double = js.native
  /* 3 */ val WorkspaceFolder: typings.vscode.vscodeMod.ConfigurationTarget.WorkspaceFolder with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigurationTarget with Double] = js.native
}

