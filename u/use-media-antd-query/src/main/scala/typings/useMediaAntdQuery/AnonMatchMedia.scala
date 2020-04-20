package typings.useMediaAntdQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatchMedia extends js.Object {
  var matchMedia: String
  var maxWidth: Double
}

object AnonMatchMedia {
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double): AnonMatchMedia = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatchMedia]
  }
}

