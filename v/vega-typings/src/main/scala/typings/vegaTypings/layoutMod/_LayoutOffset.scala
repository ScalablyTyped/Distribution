package typings.vegaTypings.layoutMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LayoutOffset extends js.Object

object _LayoutOffset {
  @scala.inline
  def SignalRef(signal: String): _LayoutOffset = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_LayoutOffset]
  }
  @scala.inline
  def AnonColumnFooter(
    columnFooter: Double | SignalRef = null,
    columnHeader: Double | SignalRef = null,
    columnTitle: Double | SignalRef = null,
    rowFooter: Double | SignalRef = null,
    rowHeader: Double | SignalRef = null,
    rowTitle: Double | SignalRef = null
  ): _LayoutOffset = {
    val __obj = js.Dynamic.literal()
    if (columnFooter != null) __obj.updateDynamic("columnFooter")(columnFooter.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (rowFooter != null) __obj.updateDynamic("rowFooter")(rowFooter.asInstanceOf[js.Any])
    if (rowHeader != null) __obj.updateDynamic("rowHeader")(rowHeader.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LayoutOffset]
  }
}

