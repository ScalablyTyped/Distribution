package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyStrings.not_enabled
import typings.tampermonkey.tampermonkeyStrings.not_permitted
import typings.tampermonkey.tampermonkeyStrings.not_succeeded
import typings.tampermonkey.tampermonkeyStrings.not_supported
import typings.tampermonkey.tampermonkeyStrings.not_whitelisted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadErrorResponse extends js.Object {
  /** Detail about that error */
  var details: js.UndefOr[String] = js.native
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
  var error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded = js.native
}

object DownloadErrorResponse {
  @scala.inline
  def apply(error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded): DownloadErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadErrorResponse]
  }
  @scala.inline
  implicit class DownloadErrorResponseOps[Self <: DownloadErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
  
}

