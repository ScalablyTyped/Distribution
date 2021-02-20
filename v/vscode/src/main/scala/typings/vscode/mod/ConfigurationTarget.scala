package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfigurationTarget extends StObject
@JSImport("vscode", "ConfigurationTarget")
@js.native
object ConfigurationTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigurationTarget with Double] = js.native
  
  /**
    * Global configuration
    */
  @js.native
  sealed trait Global extends ConfigurationTarget
  /* 1 */ val Global: typings.vscode.mod.ConfigurationTarget.Global with Double = js.native
  
  /**
    * Workspace configuration
    */
  @js.native
  sealed trait Workspace extends ConfigurationTarget
  /* 2 */ val Workspace: typings.vscode.mod.ConfigurationTarget.Workspace with Double = js.native
  
  /**
    * Workspace folder configuration
    */
  @js.native
  sealed trait WorkspaceFolder extends ConfigurationTarget
  /* 3 */ val WorkspaceFolder: typings.vscode.mod.ConfigurationTarget.WorkspaceFolder with Double = js.native
}
