package typings
package vscodeLib.vscodeMod

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
  sealed trait Global
    extends vscodeLib.vscodeMod.ConfigurationTarget
  
  /**
  		 * Workspace configuration
  		 */
  @js.native
  sealed trait Workspace
    extends vscodeLib.vscodeMod.ConfigurationTarget
  
  /**
  		 * Workspace folder configuration
  		 */
  @js.native
  sealed trait WorkspaceFolder
    extends vscodeLib.vscodeMod.ConfigurationTarget
  
  /* 1 */ val Global: Global with scala.Double = js.native
  /* 2 */ val Workspace: Workspace with scala.Double = js.native
  /* 3 */ val WorkspaceFolder: WorkspaceFolder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ConfigurationTarget with scala.Double] = js.native
}

