package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateResultModel extends js.Object {
  /**
    * Color of the state
    */
  var color: java.lang.String
  /**
    * Is the state hidden
    */
  var hidden: scala.Boolean
  /**
    * The ID of the State
    */
  var id: java.lang.String
  /**
    * Name of the state
    */
  var name: java.lang.String
  /**
    * Order in which state should appear
    */
  var order: scala.Double
  /**
    * Category of the state
    */
  var stateCategory: java.lang.String
  /**
    * Url of the state
    */
  var url: java.lang.String
}

object WorkItemStateResultModel {
  @scala.inline
  def apply(
    color: java.lang.String,
    hidden: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    order: scala.Double,
    stateCategory: java.lang.String,
    url: java.lang.String
  ): WorkItemStateResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("stateCategory")(stateCategory)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
}

