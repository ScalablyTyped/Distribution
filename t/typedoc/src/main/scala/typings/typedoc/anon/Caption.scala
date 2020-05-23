package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caption extends js.Object {
  var caption: String
  var target: String
}

object Caption {
  @scala.inline
  def apply(caption: String, target: String): Caption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caption]
  }
}

