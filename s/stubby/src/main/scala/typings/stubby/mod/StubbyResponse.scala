package typings.stubby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StubbyResponse extends js.Object {
  
  /**
    * - contents of the response body
    * - defaults to an empty content body
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * - similar to `request.file`, but the contents of the file are used as the
    *   `body`.
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * - similar to `request.headers` except that these are sent back to the
    *   client.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * - time to wait, in milliseconds, before sending back the response
    * - good for testing timeouts, or slow connections
    */
  var latency: js.UndefOr[Double] = js.native
  
  /**
    * - the HTTP status code of the response.
    * - integer or integer-like string.
    * - defaults to `200`.
    */
  var status: js.UndefOr[Double | String] = js.native
}
object StubbyResponse {
  
  @scala.inline
  def apply(): StubbyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyResponse]
  }
  
  @scala.inline
  implicit class StubbyResponseOps[Self <: StubbyResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setStatus(value: Double | String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
