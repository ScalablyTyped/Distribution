package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contribution extends ContributionBase {
  /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
  var constraints: js.Array[ContributionConstraint]
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String]
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any
  /**
    * List of demanded claims in order for the user to see this contribution (like anonymous, public, member...).
    */
  var restrictedTo: js.Array[String]
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String]
  /**
    * Id of the Contribution Type
    */
  var `type`: String
}

object Contribution {
  @scala.inline
  def apply(
    constraints: js.Array[ContributionConstraint],
    description: String,
    id: String,
    includes: js.Array[String],
    properties: js.Any,
    restrictedTo: js.Array[String],
    targets: js.Array[String],
    `type`: String,
    visibleTo: js.Array[String]
  ): Contribution = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contribution]
  }
}

