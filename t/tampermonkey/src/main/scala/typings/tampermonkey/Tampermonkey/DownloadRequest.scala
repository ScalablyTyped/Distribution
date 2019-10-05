package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Request
trait DownloadRequest extends js.Object {
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  /**
    * Filename - for security reasons the file extension needs to be
    * whitelisted at Tampermonkey options page
    */
  var name: String
  /** Callback to be executed if this download ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[DownloadErrorResponse]] = js.undefined
  /** Callback to be executed if this download finished */
  var onload: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback to be executed if this download failed due to a timeout */
  var onprogress: js.UndefOr[RequestEventListener[DownloadProgressResponse]] = js.undefined
  /** Callback to be executed if this download finished */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Show 'Save As' dialog */
  var saveAs: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  /** URL from where the data should be downloaded */
  var url: String
}

object DownloadRequest {
  @scala.inline
  def apply(
    name: String,
    url: String,
    headers: RequestHeaders = null,
    onerror: RequestEventListener[DownloadErrorResponse] = null,
    onload: () => Unit = null,
    onprogress: RequestEventListener[DownloadProgressResponse] = null,
    ontimeout: () => Unit = null,
    saveAs: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): DownloadRequest = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction0(onload))
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress)
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(js.Any.fromFunction0(ontimeout))
    if (!js.isUndefined(saveAs)) __obj.updateDynamic("saveAs")(saveAs)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadRequest]
  }
}

