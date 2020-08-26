package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64Encoded extends js.Object {
  var base64Encoded: scala.Double = js.native
  var rawText: scala.Double = js.native
}

object Base64Encoded {
  @scala.inline
  def apply(base64Encoded: scala.Double, rawText: scala.Double): Base64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Encoded]
  }
  @scala.inline
  implicit class Base64EncodedOps[Self <: Base64Encoded] (val x: Self) extends AnyVal {
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
    def setBase64Encoded(value: scala.Double): Self = this.set("base64Encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawText(value: scala.Double): Self = this.set("rawText", value.asInstanceOf[js.Any])
  }
  
}

