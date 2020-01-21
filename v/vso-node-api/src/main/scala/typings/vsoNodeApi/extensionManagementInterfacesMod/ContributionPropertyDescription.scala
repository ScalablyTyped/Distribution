package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionPropertyDescription extends js.Object {
  /**
    * Description of the property
    */
  var description: String
  /**
    * Name of the property
    */
  var name: String
  /**
    * True if this property is required
    */
  var required: Boolean
  /**
    * The type of value used for this property
    */
  var `type`: ContributionPropertyType
}

object ContributionPropertyDescription {
  @scala.inline
  def apply(description: String, name: String, required: Boolean, `type`: ContributionPropertyType): ContributionPropertyDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionPropertyDescription]
  }
}

