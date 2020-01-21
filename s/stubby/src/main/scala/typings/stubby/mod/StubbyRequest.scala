package typings.stubby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbyRequest extends js.Object {
  /**
    * - if supplied, replaces `post` with the contents of the locally given
    *   file.
    *   - paths are relative from where the `--data` file is located
    * - if the file is not found when the request is made, falls back to `post`
    *   for matching.
    * - allows you to split up stubby data across multiple files
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * - values are full-fledged **regular expressions**
    * - if omitted, stubby ignores headers for the given url.
    * - case-insensitive matching of header names.
    * - a hashmap of header/value pairs similar to `query`.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * - not used if `post` or `file` are present.
    * - will be parsed into a JavaScript object.
    * - allows you to specify a JSON string that will be deeply compared with a
    *   JSON request
    */
  var json: js.UndefOr[String] = js.undefined
  /**
    * - defaults to `GET`.
    * - case-insensitive.
    * - can be any of the following:
    *   - HEAD
    *   - GET
    *   - POST
    *   - PUT
    *   - DELETE
    *   - etc.
    * - it can also be an array of values.
    */
  var method: js.UndefOr[StubbyMethod | js.Array[StubbyMethod]] = js.undefined
  /**
    * - is a full-fledged **regular expression**
    * - if omitted, any post data is ignored.
    * - the body contents of the server request, such as form data.
    */
  var post: js.UndefOr[String] = js.undefined
  /**
    * - values are full-fledged **regular expressions**
    * - if omitted, stubby ignores query parameters for the given url.
    * - a yaml hashmap of variable/value pairs.
    * - allows the query parameters to appear in any order in a uri
    * - The following will match either of these:
    *   - /with/parameters?search=search+terms&filter=month
    *   - /with/parameters?filter=month&search=search+terms
    *
    * **NOTE**: repeated querystring keys (often array representations) will
    * have their values converted to a comma-separated list.
    */
  var query: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * - is a full-fledged **regular expression**
    * - This is the only required property of an endpoint.
    * - signify the url after the base host and port (i.e. after
    *   `localhost:8882`).
    * - any query parameters are stripped (so don't include them, that's what
    *   `query` is for).
    *   - `/url?some=value&another=value` becomes `/url`
    * - no checking is done for URI-encoding compliance.
    *   - If it's invalid, it won't ever trigger a match.
    */
  var url: String
}

object StubbyRequest {
  @scala.inline
  def apply(
    url: String,
    file: String = null,
    headers: StringDictionary[String] = null,
    json: String = null,
    method: StubbyMethod | js.Array[StubbyMethod] = null,
    post: String = null,
    query: StringDictionary[String] = null
  ): StubbyRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyRequest]
  }
}

