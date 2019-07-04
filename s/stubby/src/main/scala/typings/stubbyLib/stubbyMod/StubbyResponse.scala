package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyResponse extends js.Object {
  /**
    * - contents of the response body
    * - defaults to an empty content body
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * - similar to `request.file`, but the contents of the file are used as the
    *   `body`.
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * - similar to `request.headers` except that these are sent back to the
    *   client.
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * - time to wait, in milliseconds, before sending back the response
    * - good for testing timeouts, or slow connections
    */
  var latency: js.UndefOr[scala.Double] = js.undefined
  /**
    * - the HTTP status code of the response.
    * - integer or integer-like string.
    * - defaults to `200`.
    */
  var status: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StubbyResponse {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    file: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    latency: scala.Int | scala.Double = null,
    status: scala.Double | java.lang.String = null
  ): StubbyResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (file != null) __obj.updateDynamic("file")(file)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyResponse]
  }
}

