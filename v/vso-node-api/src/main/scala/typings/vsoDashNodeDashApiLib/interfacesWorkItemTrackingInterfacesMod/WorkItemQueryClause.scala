package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemQueryClause extends js.Object {
  /**
    * Child clauses if the current clause is a logical operator
    */
  var clauses: js.Array[WorkItemQueryClause]
  /**
    * Field associated with condition
    */
  var field: WorkItemFieldReference
  /**
    * Right side of the condition when a field to field comparison
    */
  var fieldValue: WorkItemFieldReference
  /**
    * Determines if this is a field to field comparison
    */
  var isFieldValue: scala.Boolean
  /**
    * Logical operator separating the condition clause
    */
  var logicalOperator: LogicalOperation
  /**
    * The field operator
    */
  var operator: WorkItemFieldOperation
  /**
    * Right side of the condition when a field to value comparison
    */
  var value: java.lang.String
}

