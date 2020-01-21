package typings.waterline

import typings.waterline.waterlineStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoIncrement extends js.Object {
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  var `type`: integer
}

object AnonAutoIncrement {
  @scala.inline
  def apply(`type`: integer, autoIncrement: js.UndefOr[Boolean] = js.undefined): AnonAutoIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoIncrement]
  }
}

