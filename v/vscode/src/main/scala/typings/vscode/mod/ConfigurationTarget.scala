package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfigurationTarget extends StObject
@JSImport("vscode", "ConfigurationTarget")
@js.native
object ConfigurationTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigurationTarget & Double] = js.native
  
  /**
    * Global configuration
    */
  @js.native
  sealed trait Global
    extends StObject
       with ConfigurationTarget
  /* 1 */ val Global: typings.vscode.mod.ConfigurationTarget.Global & Double = js.native
  
  /**
    * Workspace configuration
    */
  @js.native
  sealed trait Workspace
    extends StObject
       with ConfigurationTarget
  /* 2 */ val Workspace: typings.vscode.mod.ConfigurationTarget.Workspace & Double = js.native
  
  /**
    * Workspace folder configuration
    */
  @js.native
  sealed trait WorkspaceFolder
    extends StObject
       with ConfigurationTarget
  /* 3 */ val WorkspaceFolder: typings.vscode.mod.ConfigurationTarget.WorkspaceFolder & Double = js.native
}
