package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used in the User-Agent HTTP header on an HTTP request. */
@js.native
trait HttpProductInfoHeaderValue extends js.Object {
  /** Gets the product comment from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var comment: String = js.native
  /** Gets the product from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var product: HttpProductHeaderValue = js.native
}

object HttpProductInfoHeaderValue {
  @scala.inline
  def apply(comment: String, product: HttpProductHeaderValue): HttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductInfoHeaderValue]
  }
  @scala.inline
  implicit class HttpProductInfoHeaderValueOps[Self <: HttpProductInfoHeaderValue] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: HttpProductHeaderValue): Self = this.set("product", value.asInstanceOf[js.Any])
  }
  
}

