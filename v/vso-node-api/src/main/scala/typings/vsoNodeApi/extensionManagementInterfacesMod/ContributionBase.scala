package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionBase extends js.Object {
  /**
    * Description of the contribution/type
    */
  var description: String
  /**
    * Fully qualified identifier of the contribution/type
    */
  var id: String
  /**
    * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: "ms" - Means only the "ms" publisher can reference this. "ms.vss-web" - Means only the "vss-web" extension from the "ms" publisher can reference this.
    */
  var visibleTo: js.Array[String]
}

object ContributionBase {
  @scala.inline
  def apply(description: String, id: String, visibleTo: js.Array[String]): ContributionBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContributionBase]
  }
}

