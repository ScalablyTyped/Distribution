package typings
package subtitleLib.subtitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subTitleType extends js.Object {
  var end: scala.Double | java.lang.String
  var setting: js.UndefOr[java.lang.String] = js.undefined
  var start: scala.Double | java.lang.String
  var text: java.lang.String
}

object subTitleType {
  @scala.inline
  def apply(
    end: scala.Double | java.lang.String,
    start: scala.Double | java.lang.String,
    text: java.lang.String,
    setting: java.lang.String = null
  ): subTitleType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text)
    if (setting != null) __obj.updateDynamic("setting")(setting)
    __obj.asInstanceOf[subTitleType]
  }
}

