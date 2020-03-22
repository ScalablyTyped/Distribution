package typings.useMediaAntdQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxWidth extends js.Object {
  var matchMedia: String
  var maxWidth: Double
  var minWidth: Double
}

object AnonMaxWidth {
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double, minWidth: Double): AnonMaxWidth = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxWidth]
  }
}

