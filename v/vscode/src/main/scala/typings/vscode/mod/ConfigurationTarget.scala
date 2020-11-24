package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfigurationTarget extends js.Object
@JSImport("vscode", "ConfigurationTarget")
@js.native
object ConfigurationTarget extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigurationTarget with Double] = js.native
  
  /**
    * Global configuration
    */
  @js.native
  sealed trait Global extends ConfigurationTarget
  /* 1 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  /**
    * Workspace configuration
    */
  @js.native
  sealed trait Workspace extends ConfigurationTarget
  /* 2 */ @js.native
  object Workspace extends TopLevel[Workspace with Double]
  
  /**
    * Workspace folder configuration
    */
  @js.native
  sealed trait WorkspaceFolder extends ConfigurationTarget
  /* 3 */ @js.native
  object WorkspaceFolder
    extends TopLevel[typings.vscode.mod.ConfigurationTarget.WorkspaceFolder with Double]
}
