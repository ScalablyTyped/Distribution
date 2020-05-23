package typings.uiGrid.mod.expandable

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Whether or not to use expandable feature.  Allows you to turn off expandable on specific grids within
    * your application, or in specific modes on this grid.
    * Defaults to true.
    */
  var enableExpandable: js.UndefOr[Boolean] = js.undefined
  /**
    * Show a rowHeader to provide the expandable buttons. If set to false then implies you're going to use a
    * custom method for expanding and collapsing the subgrids.
    * Defaults to true.
    */
  var enableExpandableRowHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Width in pixels of the expandable column. Defaults to 40
    */
  var expandableRowHeaderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Height in pixels of the expanded subgrid.
    * Defaults to 150
    */
  var expandableRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * reference to the parent grid scope (the parent scope of the sub-grid element)
    */
  var expandableRowScope: js.UndefOr[IScope | js.Object] = js.undefined
  /**
    * Mandatory. The template for your expanded row
    */
  var expandableRowTemplate: js.UndefOr[String] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    enableExpandable: js.UndefOr[Boolean] = js.undefined,
    enableExpandableRowHeader: js.UndefOr[Boolean] = js.undefined,
    expandableRowHeaderWidth: js.UndefOr[Double] = js.undefined,
    expandableRowHeight: js.UndefOr[Double] = js.undefined,
    expandableRowScope: IScope | js.Object = null,
    expandableRowTemplate: String = null
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableExpandable)) __obj.updateDynamic("enableExpandable")(enableExpandable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExpandableRowHeader)) __obj.updateDynamic("enableExpandableRowHeader")(enableExpandableRowHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowHeaderWidth)) __obj.updateDynamic("expandableRowHeaderWidth")(expandableRowHeaderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowHeight)) __obj.updateDynamic("expandableRowHeight")(expandableRowHeight.get.asInstanceOf[js.Any])
    if (expandableRowScope != null) __obj.updateDynamic("expandableRowScope")(expandableRowScope.asInstanceOf[js.Any])
    if (expandableRowTemplate != null) __obj.updateDynamic("expandableRowTemplate")(expandableRowTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

