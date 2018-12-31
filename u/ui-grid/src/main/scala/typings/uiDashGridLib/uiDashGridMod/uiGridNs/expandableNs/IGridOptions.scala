package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Whether or not to use expandable feature.  Allows you to turn off expandable on specific grids within
    * your application, or in specific modes on this grid.
    * Defaults to true.
    */
  var enableExpandable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show a rowHeader to provide the expandable buttons. If set to false then implies you're going to use a
    * custom method for expanding and collapsing the subgrids.
    * Defaults to true.
    */
  var enableExpandableRowHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width in pixels of the expandable column. Defaults to 40
    */
  var expandableRowHeaderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height in pixels of the expanded subgrid.
    * Defaults to 150
    */
  var expandableRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * reference to the parent grid scope (the parent scope of the sub-grid element)
    */
  var expandableRowScope: js.UndefOr[angularLib.angularMod.angularNs.IScope | js.Object] = js.undefined
  /**
    * Mandatory. The template for your expanded row
    */
  var expandableRowTemplate: js.UndefOr[java.lang.String] = js.undefined
}

