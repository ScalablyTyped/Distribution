package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var isCallbackWidget: Boolean
  var isHidden: Boolean
  var name: String
}

object Description {
  @scala.inline
  def apply(description: String, isCallbackWidget: Boolean, isHidden: Boolean, name: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isCallbackWidget = isCallbackWidget.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

