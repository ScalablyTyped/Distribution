package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaption extends js.Object {
  var caption: String
  var target: String
}

object AnonCaption {
  @scala.inline
  def apply(caption: String, target: String): AnonCaption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaption]
  }
}

