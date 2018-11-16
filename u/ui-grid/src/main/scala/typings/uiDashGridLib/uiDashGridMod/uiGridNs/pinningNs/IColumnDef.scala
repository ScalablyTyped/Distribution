package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.pinningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnDef extends js.Object {
  /**
               * Enable pinning for the individual column.  Defaults to true
               * @default true
               */
  var enablePinning: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Column is pinned left when grid is rendered.  Defaults to false
               * @default false
               */
  var pinnedLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Column is pinned right when grid is rendered.  Defaults to false
               * @default false
               */
  var pinnedRight: js.UndefOr[scala.Boolean] = js.undefined
}

