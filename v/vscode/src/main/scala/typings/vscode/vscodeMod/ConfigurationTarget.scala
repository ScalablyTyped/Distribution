package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigurationTarget with Double] = js.native
  /* 1 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  /* 2 */ @js.native
  object Workspace extends TopLevel[Workspace with Double]
  
  /* 3 */ @js.native
  object WorkspaceFolder
    extends TopLevel[typings.vscode.vscodeMod.ConfigurationTarget.WorkspaceFolder with Double]
  
}

