package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  var postalCode: String | Double
}

object PostalCode {
  @scala.inline
  def apply(postalCode: String | Double): PostalCode = {
    val __obj = js.Dynamic.literal(postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCode]
  }
}

