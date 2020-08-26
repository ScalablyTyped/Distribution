package typings.typeFest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailUrl extends js.Object {
  /**
  			The email address to which issues should be reported.
  			*/
  var email: js.UndefOr[String] = js.native
  /**
  			The URL to the package's issue tracker.
  			*/
  var url: js.UndefOr[String] = js.native
}

object EmailUrl {
  @scala.inline
  def apply(): EmailUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailUrl]
  }
  @scala.inline
  implicit class EmailUrlOps[Self <: EmailUrl] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

