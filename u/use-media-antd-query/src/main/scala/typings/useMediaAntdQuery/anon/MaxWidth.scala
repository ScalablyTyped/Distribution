package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxWidth extends js.Object {
  var matchMedia: String
  var maxWidth: Double
  var minWidth: Double
}

object MaxWidth {
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double, minWidth: Double): MaxWidth = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidth]
  }
}

