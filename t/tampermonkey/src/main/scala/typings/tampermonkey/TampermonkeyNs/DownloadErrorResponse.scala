package typings.tampermonkey.TampermonkeyNs

import typings.tampermonkey.tampermonkeyStrings.not_enabled
import typings.tampermonkey.tampermonkeyStrings.not_permitted
import typings.tampermonkey.tampermonkeyStrings.not_succeeded
import typings.tampermonkey.tampermonkeyStrings.not_supported
import typings.tampermonkey.tampermonkeyStrings.not_whitelisted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadErrorResponse extends js.Object {
  /** Detail about that error */
  var details: js.UndefOr[String] = js.undefined
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
  var error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded
}

object DownloadErrorResponse {
  @scala.inline
  def apply(
    error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded,
    details: String = null
  ): DownloadErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[DownloadErrorResponse]
  }
}

