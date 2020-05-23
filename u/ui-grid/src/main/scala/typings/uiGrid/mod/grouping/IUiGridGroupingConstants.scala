package typings.uiGrid.mod.grouping

import typings.uiGrid.anon.AVG_
import typings.uiGrid.mod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants available in grouping module including all constants declared in the treeBase module.
  * These are manually copied as there isn't an easy way to include constants in another constants file, and we
  * don't want to make users include treeBase.
  */
trait IUiGridGroupingConstants extends ISharedTreeConstants {
  var featureName: String
}

object IUiGridGroupingConstants {
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: AVG_,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridGroupingConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridGroupingConstants]
  }
}

