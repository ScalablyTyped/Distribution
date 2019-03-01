package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogLevel extends js.Object {
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: java.lang.String
  /**
    * Plural name for the backlog level
    */
  var pluralName: java.lang.String
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[java.lang.String]
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[java.lang.String]
}

object BacklogLevel {
  @scala.inline
  def apply(
    categoryReferenceName: java.lang.String,
    pluralName: java.lang.String,
    workItemStates: js.Array[java.lang.String],
    workItemTypes: js.Array[java.lang.String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categoryReferenceName")(categoryReferenceName)
    __obj.updateDynamic("pluralName")(pluralName)
    __obj.updateDynamic("workItemStates")(workItemStates)
    __obj.updateDynamic("workItemTypes")(workItemTypes)
    __obj.asInstanceOf[BacklogLevel]
  }
}

