package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the `NaturalLanguageUnderstandingV1` constructor. */
@js.native
trait Options extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  var iam_access_token: js.UndefOr[String] = js.native
  var iam_apikey: js.UndefOr[String] = js.native
  var iam_url: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var use_unauthenticated: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
  var version: String = js.native
}

object Options {
  @scala.inline
  def apply(version: String): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIam_access_token(value: String): Self = this.set("iam_access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIam_access_token: Self = this.set("iam_access_token", js.undefined)
    @scala.inline
    def setIam_apikey(value: String): Self = this.set("iam_apikey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIam_apikey: Self = this.set("iam_apikey", js.undefined)
    @scala.inline
    def setIam_url(value: String): Self = this.set("iam_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIam_url: Self = this.set("iam_url", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUse_unauthenticated(value: Boolean): Self = this.set("use_unauthenticated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_unauthenticated: Self = this.set("use_unauthenticated", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

