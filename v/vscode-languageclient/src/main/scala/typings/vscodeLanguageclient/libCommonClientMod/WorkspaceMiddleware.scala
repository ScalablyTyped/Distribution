package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeLanguageclient.libCommonConfigurationMod.ConfigurationMiddleware
import typings.vscodeLanguageclient.libCommonConfigurationMod.DidChangeConfigurationMiddleware
import typings.vscodeLanguageclient.libCommonFileOperationsMod.FileOperationsMiddleware
import typings.vscodeLanguageclient.libCommonWorkspaceFolderMod.WorkspaceFolderMiddleware
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
