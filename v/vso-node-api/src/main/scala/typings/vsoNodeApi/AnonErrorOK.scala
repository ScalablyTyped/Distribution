package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorOK extends js.Object {
  var error: Double
  var oK: Double
  var warning: Double
}

object AnonErrorOK {
  @scala.inline
  def apply(error: Double, oK: Double, warning: Double): AnonErrorOK = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorOK]
  }
}

