package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentChanges extends js.Object {
  /**
    * The client supports versioned document changes in `WorkspaceEdit`s
    */
  var documentChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The failure handling strategy of a client if applying the workspace edit
    * failes.
    */
  var failureHandling: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.FailureHandlingKind] = js.undefined
  /**
    * The resource operations the client supports. Clients should at least
    * support 'create', 'rename' and 'delete' files and folders.
    */
  var resourceOperations: js.UndefOr[
    js.Array[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ResourceOperationKind]
  ] = js.undefined
}

object Anon_DocumentChanges {
  @scala.inline
  def apply(
    documentChanges: js.UndefOr[scala.Boolean] = js.undefined,
    failureHandling: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.FailureHandlingKind = null,
    resourceOperations: js.Array[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ResourceOperationKind] = null
  ): Anon_DocumentChanges = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(documentChanges)) __obj.updateDynamic("documentChanges")(documentChanges)
    if (failureHandling != null) __obj.updateDynamic("failureHandling")(failureHandling)
    if (resourceOperations != null) __obj.updateDynamic("resourceOperations")(resourceOperations)
    __obj.asInstanceOf[Anon_DocumentChanges]
  }
}

