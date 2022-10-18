package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionFilterModel extends StObject {
  
  /**
    * Flat list of clauses in this subscription
    */
  var clauses: js.Array[ExpressionFilterClause]
  
  /**
    * Grouping of clauses in the subscription
    */
  var groups: js.Array[ExpressionFilterGroup]
  
  /**
    * Max depth of the Subscription tree
    */
  var maxGroupLevel: Double
}
object ExpressionFilterModel {
  
  inline def apply(
    clauses: js.Array[ExpressionFilterClause],
    groups: js.Array[ExpressionFilterGroup],
    maxGroupLevel: Double
  ): ExpressionFilterModel = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], maxGroupLevel = maxGroupLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilterModel]
  }
  
  extension [Self <: ExpressionFilterModel](x: Self) {
    
    inline def setClauses(value: js.Array[ExpressionFilterClause]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: ExpressionFilterClause*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setGroups(value: js.Array[ExpressionFilterGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: ExpressionFilterGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setMaxGroupLevel(value: Double): Self = StObject.set(x, "maxGroupLevel", value.asInstanceOf[js.Any])
  }
}
