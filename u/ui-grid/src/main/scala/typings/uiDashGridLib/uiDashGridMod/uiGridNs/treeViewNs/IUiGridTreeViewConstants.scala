package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridTreeViewConstants
  extends uiDashGridLib.uiDashGridMod.uiGridNs.ISharedTreeConstants {
  var featureName: java.lang.String
}

object IUiGridTreeViewConstants {
  @scala.inline
  def apply(
    COLLAPSED: java.lang.String,
    EXPANDED: java.lang.String,
    aggregation: uiDashGridLib.Anon_AVG,
    featureName: java.lang.String,
    rowHeaderColName: java.lang.String
  ): IUiGridTreeViewConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, featureName = featureName, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[IUiGridTreeViewConstants]
  }
}

