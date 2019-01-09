package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynchronizeOptions extends js.Object {
  /**
    * The configuration sections to synchronize. Pushing settings from the
    * client to the server is deprecated in favour of the new pull model
    * that allows servers to query settings scoped on resources. In this
    * model the client can only deliver an empty change event since the
    * actually setting value can vary on the provided resource scope.
    *
    * @deprecated Use the new pull model (`workspace/configuration` request)
    */
  var configurationSection: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    *
    */
  var fileEvents: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFileSystemWatcher */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFileSystemWatcher */ _
    ])
  ] = js.undefined
}

