package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.configurationMod.ConfigurationMiddleware
import typings.vscodeLanguageclient.configurationMod.DidChangeConfigurationMiddleware
import typings.vscodeLanguageclient.fileOperationsMod.FileOperationsMiddleware
import typings.vscodeLanguageclient.workspaceFolderMod.WorkspaceFolderMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceMiddleware
  extends StObject
     with _WorkspaceMiddleware
     with ConfigurationMiddleware
     with DidChangeConfigurationMiddleware
     with WorkspaceFolderMiddleware
     with FileOperationsMiddleware
object WorkspaceMiddleware {
  
  inline def apply(): WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceMiddleware]
  }
}
