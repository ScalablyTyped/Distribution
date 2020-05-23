package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchMedia extends js.Object {
  var matchMedia: String
  var maxWidth: Double
}

object MatchMedia {
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double): MatchMedia = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchMedia]
  }
}

