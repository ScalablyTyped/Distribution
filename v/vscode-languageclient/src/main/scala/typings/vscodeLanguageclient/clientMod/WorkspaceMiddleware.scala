package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware
import typings.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceMiddleware
  extends StObject
     with _WorkspaceMiddleware
     with ConfigurationWorkspaceMiddleware
     with WorkspaceFolderWorkspaceMiddleware
object WorkspaceMiddleware {
  
  @scala.inline
  def apply(): WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceMiddleware]
  }
}
