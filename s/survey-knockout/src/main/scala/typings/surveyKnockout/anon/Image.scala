package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: String
  var root: String
}

object Image {
  @scala.inline
  def apply(image: String, root: String): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

