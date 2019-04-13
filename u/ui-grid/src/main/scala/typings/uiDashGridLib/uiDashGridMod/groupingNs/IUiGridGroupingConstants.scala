package typings
package uiDashGridLib.uiDashGridMod.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants available in grouping module including all constants declared in the treeBase module.
  * These are manually copied as there isn't an easy way to include constants in another constants file, and we
  * don't want to make users include treeBase.
  */
trait IUiGridGroupingConstants
  extends uiDashGridLib.uiDashGridMod.ISharedTreeConstants {
  var featureName: java.lang.String
}

object IUiGridGroupingConstants {
  @scala.inline
  def apply(
    COLLAPSED: java.lang.String,
    EXPANDED: java.lang.String,
    aggregation: uiDashGridLib.Anon_AVG,
    featureName: java.lang.String,
    rowHeaderColName: java.lang.String
  ): IUiGridGroupingConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, featureName = featureName, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[IUiGridGroupingConstants]
  }
}

