package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoIncrement extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: waterlineLib.waterlineLibStrings.integer
}

object Anon_AutoIncrement {
  @scala.inline
  def apply(
    `type`: waterlineLib.waterlineLibStrings.integer,
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoIncrement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement)
    __obj.asInstanceOf[Anon_AutoIncrement]
  }
}

