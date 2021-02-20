package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEditClientCapabilities extends StObject {
  
  /**
    * The client supports versioned document changes in `WorkspaceEdit`s
    */
  var documentChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * The failure handling strategy of a client if applying the workspace edit
    * fails.
    *
    * @since 3.13.0
    */
  var failureHandling: js.UndefOr[FailureHandlingKind] = js.native
  
  /**
    * The resource operations the client supports. Clients should at least
    * support 'create', 'rename' and 'delete' files and folders.
    *
    * @since 3.13.0
    */
  var resourceOperations: js.UndefOr[js.Array[ResourceOperationKind]] = js.native
}
object WorkspaceEditClientCapabilities {
  
  @scala.inline
  def apply(): WorkspaceEditClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceEditClientCapabilities]
  }
  
  @scala.inline
  implicit class WorkspaceEditClientCapabilitiesMutableBuilder[Self <: WorkspaceEditClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentChanges(value: Boolean): Self = StObject.set(x, "documentChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentChangesUndefined: Self = StObject.set(x, "documentChanges", js.undefined)
    
    @scala.inline
    def setFailureHandling(value: FailureHandlingKind): Self = StObject.set(x, "failureHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureHandlingUndefined: Self = StObject.set(x, "failureHandling", js.undefined)
    
    @scala.inline
    def setResourceOperations(value: js.Array[ResourceOperationKind]): Self = StObject.set(x, "resourceOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOperationsUndefined: Self = StObject.set(x, "resourceOperations", js.undefined)
    
    @scala.inline
    def setResourceOperationsVarargs(value: ResourceOperationKind*): Self = StObject.set(x, "resourceOperations", js.Array(value :_*))
  }
}
