package typings.uiGrid.mod.treeView

import typings.uiGrid.AnonAVG_
import typings.uiGrid.mod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeViewConstants extends ISharedTreeConstants {
  var featureName: String
}

object IUiGridTreeViewConstants {
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: AnonAVG_,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeViewConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridTreeViewConstants]
  }
}

