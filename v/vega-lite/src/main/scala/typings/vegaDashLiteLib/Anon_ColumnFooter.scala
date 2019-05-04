package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFooter extends js.Object {
  var columnFooter: js.UndefOr[scala.Double] = js.undefined
  var columnHeader: js.UndefOr[scala.Double] = js.undefined
  var columnTitle: js.UndefOr[scala.Double] = js.undefined
  var rowFooter: js.UndefOr[scala.Double] = js.undefined
  var rowHeader: js.UndefOr[scala.Double] = js.undefined
  var rowTitle: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColumnFooter {
  @scala.inline
  def apply(
    columnFooter: scala.Int | scala.Double = null,
    columnHeader: scala.Int | scala.Double = null,
    columnTitle: scala.Int | scala.Double = null,
    rowFooter: scala.Int | scala.Double = null,
    rowHeader: scala.Int | scala.Double = null,
    rowTitle: scala.Int | scala.Double = null
  ): Anon_ColumnFooter = {
    val __obj = js.Dynamic.literal()
    if (columnFooter != null) __obj.updateDynamic("columnFooter")(columnFooter.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (rowFooter != null) __obj.updateDynamic("rowFooter")(rowFooter.asInstanceOf[js.Any])
    if (rowHeader != null) __obj.updateDynamic("rowHeader")(rowHeader.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnFooter]
  }
}

