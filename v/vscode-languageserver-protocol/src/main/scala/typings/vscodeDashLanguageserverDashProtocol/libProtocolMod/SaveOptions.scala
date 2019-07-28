package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends js.Object {
  /**
    * The client is supposed to include the content on save.
    */
  var includeText: js.UndefOr[Boolean] = js.undefined
}

object SaveOptions {
  @scala.inline
  def apply(includeText: js.UndefOr[Boolean] = js.undefined): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeText)) __obj.updateDynamic("includeText")(includeText)
    __obj.asInstanceOf[SaveOptions]
  }
}

