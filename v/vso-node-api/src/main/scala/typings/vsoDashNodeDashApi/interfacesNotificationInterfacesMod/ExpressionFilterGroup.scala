package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilterGroup extends js.Object {
  /**
    * The index of the last FilterClause in this group
    */
  var end: Double
  /**
    * Level of the group, since groups can be nested for each nested group the level will increase by 1
    */
  var level: Double
  /**
    * The index of the first FilterClause in this group
    */
  var start: Double
}

object ExpressionFilterGroup {
  @scala.inline
  def apply(end: Double, level: Double, start: Double): ExpressionFilterGroup = {
    val __obj = js.Dynamic.literal(end = end, level = level, start = start)
  
    __obj.asInstanceOf[ExpressionFilterGroup]
  }
}

