package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkOptions extends WorkDoneProgressOptions {
  /**
    * Document links have a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}

object DocumentLinkOptions {
  @scala.inline
  def apply(
    resolveProvider: js.UndefOr[Boolean] = js.undefined,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): DocumentLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLinkOptions]
  }
}

