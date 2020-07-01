package typings.stylelintWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  timestamp  :number}> */
trait Partialtimestampnumber extends js.Object {
  var timestamp: js.UndefOr[Double] = js.undefined
}

object Partialtimestampnumber {
  @scala.inline
  def apply(timestamp: js.UndefOr[Double] = js.undefined): Partialtimestampnumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialtimestampnumber]
  }
}

