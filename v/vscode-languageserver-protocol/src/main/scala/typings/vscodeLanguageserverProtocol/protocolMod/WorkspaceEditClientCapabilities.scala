package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceEditClientCapabilities extends js.Object {
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
  implicit class WorkspaceEditClientCapabilitiesOps[Self <: WorkspaceEditClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentChanges(value: Boolean): Self = this.set("documentChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentChanges: Self = this.set("documentChanges", js.undefined)
    @scala.inline
    def setFailureHandling(value: FailureHandlingKind): Self = this.set("failureHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureHandling: Self = this.set("failureHandling", js.undefined)
    @scala.inline
    def setResourceOperationsVarargs(value: ResourceOperationKind*): Self = this.set("resourceOperations", js.Array(value :_*))
    @scala.inline
    def setResourceOperations(value: js.Array[ResourceOperationKind]): Self = this.set("resourceOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOperations: Self = this.set("resourceOperations", js.undefined)
  }
  
}

