package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightBoxItem extends js.Object {
  var source: String
  var `type`: String
}

object LightBoxItem {
  @scala.inline
  def apply(source: String, `type`: String): LightBoxItem = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightBoxItem]
  }
}

