package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogLevel extends js.Object {
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: String
  /**
    * Plural name for the backlog level
    */
  var pluralName: String
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[String]
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[String]
}

object BacklogLevel {
  @scala.inline
  def apply(
    categoryReferenceName: String,
    pluralName: String,
    workItemStates: js.Array[String],
    workItemTypes: js.Array[String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], pluralName = pluralName.asInstanceOf[js.Any], workItemStates = workItemStates.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BacklogLevel]
  }
}

