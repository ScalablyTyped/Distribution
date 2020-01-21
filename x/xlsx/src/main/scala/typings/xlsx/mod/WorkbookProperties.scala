package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookProperties extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.undefined
  /** Worksheet Epoch (1904 if true, 1900 if false) */
  var date1904: js.UndefOr[Boolean] = js.undefined
  /** Warn or strip personally identifying info on save */
  var filterPrivacy: js.UndefOr[Boolean] = js.undefined
}

object WorkbookProperties {
  @scala.inline
  def apply(
    CodeName: String = null,
    date1904: js.UndefOr[Boolean] = js.undefined,
    filterPrivacy: js.UndefOr[Boolean] = js.undefined
  ): WorkbookProperties = {
    val __obj = js.Dynamic.literal()
    if (CodeName != null) __obj.updateDynamic("CodeName")(CodeName.asInstanceOf[js.Any])
    if (!js.isUndefined(date1904)) __obj.updateDynamic("date1904")(date1904.asInstanceOf[js.Any])
    if (!js.isUndefined(filterPrivacy)) __obj.updateDynamic("filterPrivacy")(filterPrivacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookProperties]
  }
}

