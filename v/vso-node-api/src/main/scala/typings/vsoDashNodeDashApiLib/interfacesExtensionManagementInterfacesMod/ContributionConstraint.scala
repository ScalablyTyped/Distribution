package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionConstraint extends js.Object {
  /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND'd together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR'd (only one group needs to evaluate to True for the contribution to be included).
    */
  var group: scala.Double
  /**
    * Fully qualified identifier of a shared constraint
    */
  var id: java.lang.String
  /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
  var inverse: scala.Boolean
  /**
    * Name of the IContributionFilter plugin
    */
  var name: java.lang.String
  /**
    * Properties that are fed to the contribution filter class
    */
  var properties: js.Any
  /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
  var relationships: js.Array[java.lang.String]
}

object ContributionConstraint {
  @scala.inline
  def apply(
    group: scala.Double,
    id: java.lang.String,
    inverse: scala.Boolean,
    name: java.lang.String,
    properties: js.Any,
    relationships: js.Array[java.lang.String]
  ): ContributionConstraint = {
    val __obj = js.Dynamic.literal(group = group, id = id, inverse = inverse, name = name, properties = properties, relationships = relationships)
  
    __obj.asInstanceOf[ContributionConstraint]
  }
}

