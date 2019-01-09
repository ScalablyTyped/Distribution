package typings
package vegaDashTypingsLib.typesSpecLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParams extends js.Object {
  var align: js.UndefOr[
    LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[LayoutAlign]
  ] = js.undefined
  var bounds: js.UndefOr[LayoutBounds] = js.undefined
  var columns: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var footerBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var headerBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var offset: js.UndefOr[LayoutOffset] = js.undefined
  var padding: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var titleBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
}

