package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeStateInfo extends js.Object {
  /**
    * State name to state category map
    */
  var states: StringDictionary[String]
  /**
    * Work Item type name
    */
  var workItemTypeName: String
}

object WorkItemTypeStateInfo {
  @scala.inline
  def apply(states: StringDictionary[String], workItemTypeName: String): WorkItemTypeStateInfo = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateInfo]
  }
}

