package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: String
  var `type`: Double
  var width: Double
}

object Anon_Text {
  @scala.inline
  def apply(text: String, `type`: Double, width: Double): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Text]
  }
}

