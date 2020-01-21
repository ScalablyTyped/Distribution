package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMedia extends js.Object {
  var media: String
  var style: String
}

object AnonMedia {
  @scala.inline
  def apply(media: String, style: String): AnonMedia = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMedia]
  }
}

