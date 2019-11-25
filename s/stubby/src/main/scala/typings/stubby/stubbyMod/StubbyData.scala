package typings.stubby.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyData extends js.Object {
  /**
    * This object is used to match an incoming request to stubby against the
    * available endpoints that have been configured.
    */
  var request: StubbyRequest
  /**
    * Assuming a match has been made against the given `request` object, data from
    * `response` is used to build the stubbed response back to the client.
    *
    * **ALSO**: The `response` property can also be a yaml sequence of responses
    * that cycle as each request is made.
    *
    * **ALSO**: The `response` property can also be a url (string) or sequence
    * of object/urls. The url will be used to record a response object to be
    * used in calls to stubby. When used this way, data from the `request`
    * portion of the endpoint will be used to assemble a request to the url
    * given as the `response`.
    */
  var response: js.UndefOr[String | StubbyResponse | (js.Array[String | StubbyResponse])] = js.undefined
}

object StubbyData {
  @scala.inline
  def apply(
    request: StubbyRequest,
    response: String | StubbyResponse | (js.Array[String | StubbyResponse]) = null
  ): StubbyData = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyData]
  }
}

