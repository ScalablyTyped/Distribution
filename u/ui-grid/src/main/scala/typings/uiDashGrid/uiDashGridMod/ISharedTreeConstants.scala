package typings.uiDashGrid.uiDashGridMod

import typings.uiDashGrid.Anon_AVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedTreeConstants extends js.Object {
  var COLLAPSED: String
  var EXPANDED: String
  var aggregation: Anon_AVG
  var rowHeaderColName: String
}

object ISharedTreeConstants {
  @scala.inline
  def apply(COLLAPSED: String, EXPANDED: String, aggregation: Anon_AVG, rowHeaderColName: String): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED, EXPANDED = EXPANDED, aggregation = aggregation, rowHeaderColName = rowHeaderColName)
  
    __obj.asInstanceOf[ISharedTreeConstants]
  }
}

