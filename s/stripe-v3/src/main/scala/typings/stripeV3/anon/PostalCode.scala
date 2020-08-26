package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCode extends js.Object {
  var postalCode: String | Double = js.native
}

object PostalCode {
  @scala.inline
  def apply(postalCode: String | Double): PostalCode = {
    val __obj = js.Dynamic.literal(postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCode]
  }
  @scala.inline
  implicit class PostalCodeOps[Self <: PostalCode] (val x: Self) extends AnyVal {
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
    def setPostalCode(value: String | Double): Self = this.set("postalCode", value.asInstanceOf[js.Any])
  }
  
}

