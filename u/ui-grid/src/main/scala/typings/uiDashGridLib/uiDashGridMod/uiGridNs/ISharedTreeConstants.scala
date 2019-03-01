package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedTreeConstants extends js.Object {
  var COLLAPSED: java.lang.String
  var EXPANDED: java.lang.String
  var aggregation: uiDashGridLib.Anon_AVG
  var rowHeaderColName: java.lang.String
}

object ISharedTreeConstants {
  @scala.inline
  def apply(
    COLLAPSED: java.lang.String,
    EXPANDED: java.lang.String,
    aggregation: uiDashGridLib.Anon_AVG,
    rowHeaderColName: java.lang.String
  ): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COLLAPSED")(COLLAPSED)
    __obj.updateDynamic("EXPANDED")(EXPANDED)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("rowHeaderColName")(rowHeaderColName)
    __obj.asInstanceOf[ISharedTreeConstants]
  }
}

