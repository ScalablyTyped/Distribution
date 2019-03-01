package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFooter
  extends vegaDashTypingsLib.typesSpecLayoutMod._LayoutOffset {
  var columnFooter: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var columnHeader: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var columnTitle: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var rowFooter: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var rowHeader: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var rowTitle: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

object Anon_ColumnFooter {
  @scala.inline
  def apply(
    columnFooter: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    columnHeader: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    columnTitle: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    rowFooter: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    rowHeader: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    rowTitle: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
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

