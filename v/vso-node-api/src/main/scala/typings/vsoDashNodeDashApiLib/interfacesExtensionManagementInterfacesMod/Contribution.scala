package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var includes: js.Array[java.lang.String]
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any
  /**
    * List of demanded claims in order for the user to see this contribution (like anonymous, public, member...).
    */
  var restrictedTo: js.Array[java.lang.String]
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[java.lang.String]
  /**
    * Id of the Contribution Type
    */
  var `type`: java.lang.String
}

object Contribution {
  @scala.inline
  def apply(
    constraints: js.Array[ContributionConstraint],
    description: java.lang.String,
    id: java.lang.String,
    includes: js.Array[java.lang.String],
    properties: js.Any,
    restrictedTo: js.Array[java.lang.String],
    targets: js.Array[java.lang.String],
    `type`: java.lang.String,
    visibleTo: js.Array[java.lang.String]
  ): Contribution = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("constraints")(constraints)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("includes")(includes)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("restrictedTo")(restrictedTo)
    __obj.updateDynamic("targets")(targets)
    __obj.updateDynamic("visibleTo")(visibleTo)
    __obj.asInstanceOf[Contribution]
  }
}

