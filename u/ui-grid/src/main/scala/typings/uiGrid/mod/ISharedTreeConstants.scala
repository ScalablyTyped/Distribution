package typings.uiGrid.mod

import typings.uiGrid.Anon_AVG
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
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISharedTreeConstants]
  }
}

