package typings.uiDashGrid.uiDashGridMod.treeView

import typings.uiDashGrid.Anon_AVG
import typings.uiDashGrid.uiDashGridMod.ISharedTreeConstants
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
    aggregation: Anon_AVG,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeViewConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUiGridTreeViewConstants]
  }
}

