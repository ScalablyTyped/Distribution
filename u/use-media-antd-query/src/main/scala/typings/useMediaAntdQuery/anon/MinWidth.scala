package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinWidth extends js.Object {
  var matchMedia: String
  var minWidth: Double
}

object MinWidth {
  @scala.inline
  def apply(matchMedia: String, minWidth: Double): MinWidth = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidth]
  }
}

