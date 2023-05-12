package typings.xrm.Xrm.Controls

import typings.xrm.XrmEnum.RelationshipType
import typings.xrm.XrmEnum.RoleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing information about the relationship used to filter the subgrid.
  */
trait GridRelationship extends StObject {
  
  /**
    * Name of the column
    */
  var attributeName: String
  
  /**
    * Name of the relationship
    */
  var name: String
  
  /**
    * Name of the navigation property for this relationship.
    */
  var navigationPropertyName: String
  
  /**
    * Returns one of the following values to indicate the relationship type.
    */
  var relationshipType: RelationshipType
  
  /**
    * Returns one of the following values to indicate the role type of relationship
    */
  var roleType: RoleType
}
object GridRelationship {
  
  inline def apply(
    attributeName: String,
    name: String,
    navigationPropertyName: String,
    relationshipType: RelationshipType,
    roleType: RoleType
  ): GridRelationship = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigationPropertyName = navigationPropertyName.asInstanceOf[js.Any], relationshipType = relationshipType.asInstanceOf[js.Any], roleType = roleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridRelationship] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavigationPropertyName(value: String): Self = StObject.set(x, "navigationPropertyName", value.asInstanceOf[js.Any])
    
    inline def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
    
    inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
  }
}
