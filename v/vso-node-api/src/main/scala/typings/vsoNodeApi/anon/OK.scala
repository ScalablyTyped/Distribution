package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OK extends js.Object {
  var error: scala.Double
  var oK: scala.Double
  var warning: scala.Double
}

object OK {
  @scala.inline
  def apply(error: scala.Double, oK: scala.Double, warning: scala.Double): OK = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OK]
  }
}

