package typings.stubby.stubbyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyResponse extends js.Object {
  /**
    * - contents of the response body
    * - defaults to an empty content body
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * - similar to `request.file`, but the contents of the file are used as the
    *   `body`.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * - similar to `request.headers` except that these are sent back to the
    *   client.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * - time to wait, in milliseconds, before sending back the response
    * - good for testing timeouts, or slow connections
    */
  var latency: js.UndefOr[Double] = js.undefined
  /**
    * - the HTTP status code of the response.
    * - integer or integer-like string.
    * - defaults to `200`.
    */
  var status: js.UndefOr[Double | String] = js.undefined
}

object StubbyResponse {
  @scala.inline
  def apply(
    body: String = null,
    file: String = null,
    headers: StringDictionary[String] = null,
    latency: Int | Double = null,
    status: Double | String = null
  ): StubbyResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyResponse]
  }
}

