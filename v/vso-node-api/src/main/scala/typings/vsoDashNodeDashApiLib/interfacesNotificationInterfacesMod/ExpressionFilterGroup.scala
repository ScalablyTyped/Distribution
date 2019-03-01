package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilterGroup extends js.Object {
  /**
    * The index of the last FilterClause in this group
    */
  var end: scala.Double
  /**
    * Level of the group, since groups can be nested for each nested group the level will increase by 1
    */
  var level: scala.Double
  /**
    * The index of the first FilterClause in this group
    */
  var start: scala.Double
}

object ExpressionFilterGroup {
  @scala.inline
  def apply(end: scala.Double, level: scala.Double, start: scala.Double): ExpressionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ExpressionFilterGroup]
  }
}

