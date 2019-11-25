package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends js.Object {
  /**
    * Renames should be checked and tested before being executed.
    */
  var prepareProvider: js.UndefOr[Boolean] = js.undefined
}

object RenameOptions {
  @scala.inline
  def apply(prepareProvider: js.UndefOr[Boolean] = js.undefined): RenameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
}

