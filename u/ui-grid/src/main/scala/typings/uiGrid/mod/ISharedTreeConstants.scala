package typings.uiGrid.mod

import typings.uiGrid.AnonAVG_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedTreeConstants extends js.Object {
  var COLLAPSED: String
  var EXPANDED: String
  var aggregation: AnonAVG_
  var rowHeaderColName: String
}

object ISharedTreeConstants {
  @scala.inline
  def apply(COLLAPSED: String, EXPANDED: String, aggregation: AnonAVG_, rowHeaderColName: String): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISharedTreeConstants]
  }
}

