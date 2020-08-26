package typings.stripe.mod.issuing.authorizations

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthorizationDeclineOptions extends js.Object {
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}

object IAuthorizationDeclineOptions {
  @scala.inline
  def apply(): IAuthorizationDeclineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuthorizationDeclineOptions]
  }
  @scala.inline
  implicit class IAuthorizationDeclineOptionsOps[Self <: IAuthorizationDeclineOptions] (val x: Self) extends AnyVal {
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
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

