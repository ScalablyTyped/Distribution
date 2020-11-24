package typings.xrm.Xrm.Navigation

import typings.xrm.XrmEnum.RelationshipType
import typings.xrm.XrmEnum.RoleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relationship extends js.Object {
  
  /**
    * Name of the attribute used for relationship.
    */
  var attributeName: String = js.native
  
  /**
    * Name of the relationship.
    */
  var name: String = js.native
  
  /**
    * Name of the navigation property for this relationship.
    */
  var navigationPropertyName: js.UndefOr[String] = js.native
  
  /**
    * Relationship type.Specify one of the following values:
    * * 0:OneToMany
    * * 1:ManyToMany
    */
  var relationshipType: js.UndefOr[RelationshipType] = js.native
  
      //
  /**
    * Role type in relationship.Specify one of the following values:
    * * 1:Referencing
    * * 2:AssociationEntity
    */
  var roleType: js.UndefOr[RoleType] = js.native
}
object Relationship {
  
  @scala.inline
  def apply(attributeName: String, name: String): Relationship = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit class RelationshipOps[Self <: Relationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationPropertyName(value: String): Self = this.set("navigationPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationPropertyName: Self = this.set("navigationPropertyName", js.undefined)
    
    @scala.inline
    def setRelationshipType(value: RelationshipType): Self = this.set("relationshipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipType: Self = this.set("relationshipType", js.undefined)
    
    @scala.inline
    def setRoleType(value: RoleType): Self = this.set("roleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleType: Self = this.set("roleType", js.undefined)
  }
}
