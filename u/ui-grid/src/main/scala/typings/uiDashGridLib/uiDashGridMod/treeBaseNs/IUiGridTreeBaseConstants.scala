package typings
package uiDashGridLib.uiDashGridMod.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeBaseConstants
  extends uiDashGridLib.uiDashGridMod.ISharedTreeConstants {
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
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, featureName = featureName, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[IUiGridTreeBaseConstants]
  }
}

