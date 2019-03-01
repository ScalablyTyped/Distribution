package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeBaseConstants
  extends uiDashGridLib.uiDashGridMod.uiGridNs.ISharedTreeConstants {
  var featureName: java.lang.String
}

object IUiGridTreeBaseConstants {
  @scala.inline
  def apply(
    COLLAPSED: java.lang.String,
    EXPANDED: java.lang.String,
    aggregation: uiDashGridLib.Anon_AVG,
    featureName: java.lang.String,
    rowHeaderColName: java.lang.String
  ): IUiGridTreeBaseConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COLLAPSED")(COLLAPSED)
    __obj.updateDynamic("EXPANDED")(EXPANDED)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("featureName")(featureName)
    __obj.updateDynamic("rowHeaderColName")(rowHeaderColName)
    __obj.asInstanceOf[IUiGridTreeBaseConstants]
  }
}

