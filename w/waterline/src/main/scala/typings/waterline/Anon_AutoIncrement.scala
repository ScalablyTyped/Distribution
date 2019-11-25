package typings.waterline

import typings.waterline.waterlineStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoIncrement extends js.Object {
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  var `type`: integer
}

object Anon_AutoIncrement {
  @scala.inline
  def apply(`type`: integer, autoIncrement: js.UndefOr[Boolean] = js.undefined): Anon_AutoIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoIncrement]
  }
}

