package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialResultParams extends js.Object {
  /**
    * An optional token that a server can use to report partial results (e.g. streaming) to
    * the client.
    */
  var partialResultToken: js.UndefOr[ProgressToken] = js.undefined
}

object PartialResultParams {
  @scala.inline
  def apply(partialResultToken: ProgressToken = null): PartialResultParams = {
    val __obj = js.Dynamic.literal()
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResultParams]
  }
}

