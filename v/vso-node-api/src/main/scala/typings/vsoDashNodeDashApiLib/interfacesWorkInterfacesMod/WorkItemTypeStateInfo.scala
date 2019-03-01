package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeStateInfo extends js.Object {
  /**
    * State name to state category map
    */
  var states: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Work Item type name
    */
  var workItemTypeName: java.lang.String
}

object WorkItemTypeStateInfo {
  @scala.inline
  def apply(
    states: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    workItemTypeName: java.lang.String
  ): WorkItemTypeStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("states")(states)
    __obj.updateDynamic("workItemTypeName")(workItemTypeName)
    __obj.asInstanceOf[WorkItemTypeStateInfo]
  }
}

