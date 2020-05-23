package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var text: String
  var `type`: Double
  var width: Double
}

object Text {
  @scala.inline
  def apply(text: String, `type`: Double, width: Double): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

