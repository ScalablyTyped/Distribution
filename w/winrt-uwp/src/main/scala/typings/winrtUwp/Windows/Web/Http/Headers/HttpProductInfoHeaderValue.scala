package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used in the User-Agent HTTP header on an HTTP request. */
trait HttpProductInfoHeaderValue extends js.Object {
  /** Gets the product comment from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var comment: String
  /** Gets the product from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var product: HttpProductHeaderValue
}

object HttpProductInfoHeaderValue {
  @scala.inline
  def apply(comment: String, product: HttpProductHeaderValue): HttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductInfoHeaderValue]
  }
}

