package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends WorkDoneProgressOptions {
  /**
    * Renames should be checked and tested before being executed.
    *
    * @since version 3.12.0
    */
  var prepareProvider: js.UndefOr[Boolean] = js.undefined
}

object RenameOptions {
  @scala.inline
  def apply(
    prepareProvider: js.UndefOr[Boolean] = js.undefined,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): RenameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
}

