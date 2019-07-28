package typings.xlsx.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateNFOption extends js.Object {
  /** Use specified date format */
  var dateNF: js.UndefOr[NumberFormat] = js.undefined
}

object DateNFOption {
  @scala.inline
  def apply(dateNF: NumberFormat = null): DateNFOption = {
    val __obj = js.Dynamic.literal()
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateNFOption]
  }
}

