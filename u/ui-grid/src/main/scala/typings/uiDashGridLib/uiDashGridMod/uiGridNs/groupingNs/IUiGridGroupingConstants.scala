package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants available in grouping module including all constants declared in the treeBase module.
  * These are manually copied as there isn't an easy way to include constants in another constants file, and we
  * don't want to make users include treeBase.
  */
trait IUiGridGroupingConstants
  extends uiDashGridLib.uiDashGridMod.uiGridNs.ISharedTreeConstants {
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COLLAPSED")(COLLAPSED)
    __obj.updateDynamic("EXPANDED")(EXPANDED)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("featureName")(featureName)
    __obj.updateDynamic("rowHeaderColName")(rowHeaderColName)
    __obj.asInstanceOf[IUiGridGroupingConstants]
  }
}

