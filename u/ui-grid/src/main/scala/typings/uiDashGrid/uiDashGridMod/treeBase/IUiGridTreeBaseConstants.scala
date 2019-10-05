package typings.uiDashGrid.uiDashGridMod.treeBase

import typings.uiDashGrid.Anon_AVG
import typings.uiDashGrid.uiDashGridMod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeBaseConstants extends ISharedTreeConstants {
  var featureName: String
}

object IUiGridTreeBaseConstants {
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: Anon_AVG,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeBaseConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, featureName = featureName, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[IUiGridTreeBaseConstants]
  }
}

