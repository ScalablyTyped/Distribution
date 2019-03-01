package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkOptions extends js.Object {
  /**
    * Document links have a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentLinkOptions {
  @scala.inline
  def apply(resolveProvider: js.UndefOr[scala.Boolean] = js.undefined): DocumentLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider)
    __obj.asInstanceOf[DocumentLinkOptions]
  }
}

