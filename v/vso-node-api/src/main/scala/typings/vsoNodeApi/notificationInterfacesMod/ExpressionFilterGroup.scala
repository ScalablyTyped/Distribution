package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionFilterGroup extends StObject {
  
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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilterGroup]
  }
  
  @scala.inline
  implicit class ExpressionFilterGroupMutableBuilder[Self <: ExpressionFilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
