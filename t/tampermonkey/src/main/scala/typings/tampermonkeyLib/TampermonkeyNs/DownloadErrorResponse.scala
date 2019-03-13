package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadErrorResponse extends js.Object {
  /** Detail about that error */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Error reason
    * - `not_enabled` - the download feature isn't enabled by the user
    * - `not_whitelisted` - the requested file extension is not
    * whitelisted
    * - `not_permitted` - the user enabled the download feature, but did
    * not give the downloads permission
    * - `not_supported` - the download feature isn't supported by the
    * browser/version
    * - `not_succeeded` - the download wasn't started or failed, the
    * details attribute may provide more information
    */
  var error: tampermonkeyLib.tampermonkeyLibStrings.not_enabled | tampermonkeyLib.tampermonkeyLibStrings.not_whitelisted | tampermonkeyLib.tampermonkeyLibStrings.not_permitted | tampermonkeyLib.tampermonkeyLibStrings.not_supported | tampermonkeyLib.tampermonkeyLibStrings.not_succeeded
}

object DownloadErrorResponse {
  @scala.inline
  def apply(
    error: tampermonkeyLib.tampermonkeyLibStrings.not_enabled | tampermonkeyLib.tampermonkeyLibStrings.not_whitelisted | tampermonkeyLib.tampermonkeyLibStrings.not_permitted | tampermonkeyLib.tampermonkeyLibStrings.not_supported | tampermonkeyLib.tampermonkeyLibStrings.not_succeeded,
    details: java.lang.String = null
  ): DownloadErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[DownloadErrorResponse]
  }
}

