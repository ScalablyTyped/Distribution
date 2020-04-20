package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section extends js.Object {
  var groups: js.Array[Group]
  /**
    * The id for the layout node.
    */
  var id: String
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean
}

object Section {
  @scala.inline
  def apply(groups: js.Array[Group], id: String, overridden: Boolean): Section = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

