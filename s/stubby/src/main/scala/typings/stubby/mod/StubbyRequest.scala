package typings.stubby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StubbyRequest extends js.Object {
  
  /**
    * - if supplied, replaces `post` with the contents of the locally given
    *   file.
    *   - paths are relative from where the `--data` file is located
    * - if the file is not found when the request is made, falls back to `post`
    *   for matching.
    * - allows you to split up stubby data across multiple files
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * - values are full-fledged **regular expressions**
    * - if omitted, stubby ignores headers for the given url.
    * - case-insensitive matching of header names.
    * - a hashmap of header/value pairs similar to `query`.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * - not used if `post` or `file` are present.
    * - will be parsed into a JavaScript object.
    * - allows you to specify a JSON string that will be deeply compared with a
    *   JSON request
    */
  var json: js.UndefOr[String] = js.native
  
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
  var method: js.UndefOr[StubbyMethod | js.Array[StubbyMethod]] = js.native
  
  /**
    * - is a full-fledged **regular expression**
    * - if omitted, any post data is ignored.
    * - the body contents of the server request, such as form data.
    */
  var post: js.UndefOr[String] = js.native
  
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
  var query: js.UndefOr[StringDictionary[String]] = js.native
  
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
  var url: String = js.native
}
object StubbyRequest {
  
  @scala.inline
  def apply(url: String): StubbyRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyRequest]
  }
  
  @scala.inline
  implicit class StubbyRequestOps[Self <: StubbyRequest] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: StubbyMethod*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: StubbyMethod | js.Array[StubbyMethod]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPost(value: String): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setQuery(value: StringDictionary[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
