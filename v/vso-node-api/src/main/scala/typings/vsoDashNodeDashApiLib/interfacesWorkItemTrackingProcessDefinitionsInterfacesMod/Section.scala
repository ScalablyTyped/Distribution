package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section extends js.Object {
  var groups: js.Array[Group]
  /**
    * The id for the layout node.
    */
  var id: java.lang.String
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: scala.Boolean
}

object Section {
  @scala.inline
  def apply(groups: js.Array[Group], id: java.lang.String, overridden: scala.Boolean): Section = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("overridden")(overridden)
    __obj.asInstanceOf[Section]
  }
}

