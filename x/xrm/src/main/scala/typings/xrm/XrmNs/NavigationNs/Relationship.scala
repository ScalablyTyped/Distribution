package typings.xrm.XrmNs.NavigationNs

import typings.xrm.XrmEnumNs.RelationshipType
import typings.xrm.XrmEnumNs.RoleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relationship extends js.Object {
  /**
    * Name of the attribute used for relationship.
    */
  var attributeName: String
  /**
    * Name of the relationship.
    */
  var name: String
  /**
    * Name of the navigation property for this relationship.
    */
  var navigationPropertyName: js.UndefOr[String] = js.undefined
  /**
    * Relationship type.Specify one of the following values:
    * * 0:OneToMany
    * * 1:ManyToMany
    */
  var relationshipType: js.UndefOr[RelationshipType] = js.undefined
      //
  /**
    * Role type in relationship.Specify one of the following values:
    * * 1:Referencing
    * * 2:AssociationEntity
    */
  var roleType: js.UndefOr[RoleType] = js.undefined
}

object Relationship {
  @scala.inline
  def apply(
    attributeName: String,
    name: String,
    navigationPropertyName: String = null,
    relationshipType: RelationshipType = null,
    roleType: RoleType = null
  ): Relationship = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, name = name)
    if (navigationPropertyName != null) __obj.updateDynamic("navigationPropertyName")(navigationPropertyName)
    if (relationshipType != null) __obj.updateDynamic("relationshipType")(relationshipType)
    if (roleType != null) __obj.updateDynamic("roleType")(roleType)
    __obj.asInstanceOf[Relationship]
  }
}

