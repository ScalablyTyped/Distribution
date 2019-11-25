package typings.vegaDashTypings.typesSpecLayoutMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
  - typings.vegaDashTypings.typesSpecLayoutMod.LayoutParams
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  def SignalRef(signal: String): Layout = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def LayoutParams(
    align: LayoutAlign | SignalRef | RowColumn[LayoutAlign] = null,
    bounds: LayoutBounds = null,
    columns: Double | SignalRef = null,
    footerBand: Double | SignalRef | RowColumn[Double] = null,
    headerBand: Double | SignalRef | RowColumn[Double] = null,
    offset: LayoutOffset = null,
    padding: Double | SignalRef | RowColumn[Double] = null,
    titleAnchor: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor] = null,
    titleBand: Double | SignalRef | RowColumn[Double] = null
  ): Layout = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (footerBand != null) __obj.updateDynamic("footerBand")(footerBand.asInstanceOf[js.Any])
    if (headerBand != null) __obj.updateDynamic("headerBand")(headerBand.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor.asInstanceOf[js.Any])
    if (titleBand != null) __obj.updateDynamic("titleBand")(titleBand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

