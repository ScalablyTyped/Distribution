package typings.uiDashGrid.uiDashGridMod.groupingNs

import typings.uiDashGrid.Anon_AVG
import typings.uiDashGrid.uiDashGridMod.ISharedTreeConstants
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
    aggregation: Anon_AVG,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridGroupingConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, featureName = featureName, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[IUiGridGroupingConstants]
  }
}

