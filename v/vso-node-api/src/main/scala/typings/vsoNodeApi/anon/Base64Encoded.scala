package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base64Encoded extends js.Object {
  var base64Encoded: scala.Double
  var rawText: scala.Double
}

object Base64Encoded {
  @scala.inline
  def apply(base64Encoded: scala.Double, rawText: scala.Double): Base64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Encoded]
  }
}

