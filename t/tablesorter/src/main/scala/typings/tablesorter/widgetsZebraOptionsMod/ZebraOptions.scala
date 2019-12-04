package typings.tablesorter.widgetsZebraOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZebraOptions extends js.Object {
  /**
    * The classes to add to even and odd rows.
    */
  var zebra: js.UndefOr[js.Tuple2[String, String]] = js.undefined
}

object ZebraOptions {
  @scala.inline
  def apply(zebra: js.Tuple2[String, String] = null): ZebraOptions = {
    val __obj = js.Dynamic.literal()
    if (zebra != null) __obj.updateDynamic("zebra")(zebra.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZebraOptions]
  }
}

