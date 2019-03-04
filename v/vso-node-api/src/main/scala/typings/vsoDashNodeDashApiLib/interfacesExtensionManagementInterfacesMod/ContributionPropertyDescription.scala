package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionPropertyDescription extends js.Object {
  /**
    * Description of the property
    */
  var description: java.lang.String
  /**
    * Name of the property
    */
  var name: java.lang.String
  /**
    * True if this property is required
    */
  var required: scala.Boolean
  /**
    * The type of value used for this property
    */
  var `type`: ContributionPropertyType
}

object ContributionPropertyDescription {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    required: scala.Boolean,
    `type`: ContributionPropertyType
  ): ContributionPropertyDescription = {
    val __obj = js.Dynamic.literal(description = description, name = name, required = required)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContributionPropertyDescription]
  }
}

