package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotworkspaceFolderMod.WorkspaceFoldersServerCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperations extends StObject {
  
  /**
    * The server is interested in notifications/requests for operations on files.
    *
    * @since 3.16.0
    */
  var fileOperations: js.UndefOr[FileOperationOptions] = js.undefined
  
  /**
    * The server supports workspace folder.
    *
    * @since 3.6.0
    */
  var workspaceFolders: js.UndefOr[WorkspaceFoldersServerCapabilities] = js.undefined
}
object FileOperations {
  
  inline def apply(): FileOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOperations]
  }
  
  extension [Self <: FileOperations](x: Self) {
    
    inline def setFileOperations(value: FileOperationOptions): Self = StObject.set(x, "fileOperations", value.asInstanceOf[js.Any])
    
    inline def setFileOperationsUndefined: Self = StObject.set(x, "fileOperations", js.undefined)
    
    inline def setWorkspaceFolders(value: WorkspaceFoldersServerCapabilities): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
  }
}
