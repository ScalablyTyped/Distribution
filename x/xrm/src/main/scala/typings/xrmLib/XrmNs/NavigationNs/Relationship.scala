package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Relationship extends js.Object {
  /**
               * Name of the attribute used for relationship.
               */
  var attributeName: java.lang.String
  /**
               * Name of the relationship.
               */
  var name: java.lang.String
  /**
               * Name of the navigation property for this relationship.
               */
  var navigationPropertyName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Relationship type.Specify one of the following values:
               * * 0:OneToMany
               * * 1:ManyToMany
               */
  var relationshipType: js.UndefOr[xrmLib.XrmEnumNs.RelationshipType] = js.undefined
      //
  /**
               * Role type in relationship.Specify one of the following values:
               * * 1:Referencing
               * * 2:AssociationEntity
               */
  var roleType: js.UndefOr[xrmLib.XrmEnumNs.RoleType] = js.undefined
}

