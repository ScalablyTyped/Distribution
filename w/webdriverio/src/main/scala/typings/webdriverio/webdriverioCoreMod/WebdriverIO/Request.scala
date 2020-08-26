package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
    */
  var hasPostData: js.UndefOr[Boolean] = js.native
  /**
    * HTTP request headers.
    */
  var headers: Record[String, String] = js.native
  /**
    * Priority of the resource request at the time request is sent.
    */
  var initialPriority: ResourcePriority = js.native
  /**
    * Whether is loaded via link preload.
    */
  var isLinkPreload: js.UndefOr[Boolean] = js.native
  /**
    * HTTP request method.
    */
  var method: String = js.native
  /**
    * The mixed content type of the request.
    */
  var mixedContentType: js.UndefOr[MixedContentType] = js.native
  /**
    * HTTP POST request data.
    */
  var postData: js.UndefOr[String] = js.native
  /**
    * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
    */
  var referrerPolicy: ReferrerPolicy = js.native
  /**
    * Request URL (without fragment).
    */
  var url: String = js.native
  /**
    * Fragment of the requested URL starting with hash, if present.
    */
  var urlFragment: js.UndefOr[String] = js.native
}

object Request {
  @scala.inline
  def apply(
    headers: Record[String, String],
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: ReferrerPolicy,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialPriority(value: ResourcePriority): Self = this.set("initialPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPostData(value: Boolean): Self = this.set("hasPostData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPostData: Self = this.set("hasPostData", js.undefined)
    @scala.inline
    def setIsLinkPreload(value: Boolean): Self = this.set("isLinkPreload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLinkPreload: Self = this.set("isLinkPreload", js.undefined)
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = this.set("mixedContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixedContentType: Self = this.set("mixedContentType", js.undefined)
    @scala.inline
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    @scala.inline
    def setUrlFragment(value: String): Self = this.set("urlFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlFragment: Self = this.set("urlFragment", js.undefined)
  }
  
}

