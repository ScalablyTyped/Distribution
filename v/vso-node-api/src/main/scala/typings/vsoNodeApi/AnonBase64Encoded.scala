package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64Encoded extends js.Object {
  var base64Encoded: Double
  var rawText: Double
}

object AnonBase64Encoded {
  @scala.inline
  def apply(base64Encoded: Double, rawText: Double): AnonBase64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase64Encoded]
  }
}

