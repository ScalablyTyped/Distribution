package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeWatchedFilesClientCapabilities extends js.Object {
  /**
    * Did change watched files notification supports dynamic registration. Please note
    * that the current protocol doesn't support static configuration for file changes
    * from the server side.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object DidChangeWatchedFilesClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): DidChangeWatchedFilesClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesClientCapabilities]
  }
}

