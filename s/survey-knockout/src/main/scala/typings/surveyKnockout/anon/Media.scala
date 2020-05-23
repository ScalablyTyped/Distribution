package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var media: String
  var style: String
}

object Media {
  @scala.inline
  def apply(media: String, style: String): Media = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

