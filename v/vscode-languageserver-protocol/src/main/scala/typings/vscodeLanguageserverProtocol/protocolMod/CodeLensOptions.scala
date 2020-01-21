package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensOptions extends js.Object {
  /**
    * Code lens has a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}

object CodeLensOptions {
  @scala.inline
  def apply(resolveProvider: js.UndefOr[Boolean] = js.undefined): CodeLensOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensOptions]
  }
}

