package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_FailureHandling extends js.Object {
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
           * support 'create', 'rename' and 'delete'.
           */
  var resourceOperations: js.UndefOr[
    js.Array[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ResourceOperationKind]
  ] = js.undefined
}

