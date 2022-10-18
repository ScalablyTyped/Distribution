package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.GroupsOnLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEditClientCapabilities extends StObject {
  
  /**
    * Whether the client in general supports change annotations on text edits,
    * create file, rename file and delete file changes.
    *
    * @since 3.16.0
    */
  var changeAnnotationSupport: js.UndefOr[GroupsOnLabel] = js.undefined
  
  /**
    * The client supports versioned document changes in `WorkspaceEdit`s
    */
  var documentChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The failure handling strategy of a client if applying the workspace edit
    * fails.
    *
    * @since 3.13.0
    */
  var failureHandling: js.UndefOr[FailureHandlingKind] = js.undefined
  
  /**
    * Whether the client normalizes line endings to the client specific
    * setting.
    * If set to `true` the client will normalize line ending characters
    * in a workspace edit to the client-specified new line
    * character.
    *
    * @since 3.16.0
    */
  var normalizesLineEndings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource operations the client supports. Clients should at least
    * support 'create', 'rename' and 'delete' files and folders.
    *
    * @since 3.13.0
    */
  var resourceOperations: js.UndefOr[js.Array[ResourceOperationKind]] = js.undefined
}
object WorkspaceEditClientCapabilities {
  
  inline def apply(): WorkspaceEditClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceEditClientCapabilities]
  }
  
  extension [Self <: WorkspaceEditClientCapabilities](x: Self) {
    
    inline def setChangeAnnotationSupport(value: GroupsOnLabel): Self = StObject.set(x, "changeAnnotationSupport", value.asInstanceOf[js.Any])
    
    inline def setChangeAnnotationSupportUndefined: Self = StObject.set(x, "changeAnnotationSupport", js.undefined)
    
    inline def setDocumentChanges(value: Boolean): Self = StObject.set(x, "documentChanges", value.asInstanceOf[js.Any])
    
    inline def setDocumentChangesUndefined: Self = StObject.set(x, "documentChanges", js.undefined)
    
    inline def setFailureHandling(value: FailureHandlingKind): Self = StObject.set(x, "failureHandling", value.asInstanceOf[js.Any])
    
    inline def setFailureHandlingUndefined: Self = StObject.set(x, "failureHandling", js.undefined)
    
    inline def setNormalizesLineEndings(value: Boolean): Self = StObject.set(x, "normalizesLineEndings", value.asInstanceOf[js.Any])
    
    inline def setNormalizesLineEndingsUndefined: Self = StObject.set(x, "normalizesLineEndings", js.undefined)
    
    inline def setResourceOperations(value: js.Array[ResourceOperationKind]): Self = StObject.set(x, "resourceOperations", value.asInstanceOf[js.Any])
    
    inline def setResourceOperationsUndefined: Self = StObject.set(x, "resourceOperations", js.undefined)
    
    inline def setResourceOperationsVarargs(value: ResourceOperationKind*): Self = StObject.set(x, "resourceOperations", js.Array(value*))
  }
}
