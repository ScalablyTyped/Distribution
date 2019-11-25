package typings.subtitle.subtitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subTitleType extends js.Object {
  var end: Double | String
  var setting: js.UndefOr[String] = js.undefined
  var start: Double | String
  var text: String
}

object subTitleType {
  @scala.inline
  def apply(end: Double | String, start: Double | String, text: String, setting: String = null): subTitleType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[subTitleType]
  }
}

