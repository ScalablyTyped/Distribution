package typings.vsoNodeApi.interfacesWorkInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  /**
    * Identity that created this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var createdByIdentity: IdentityRef
  
  /**
    * Date when the plan was created
    */
  var createdDate: js.Date
  
  /**
    * Description of the plan
    */
  var description: String
  
  /**
    * Id of the plan
    */
  var id: String
  
  /**
    * Identity that last modified this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var modifiedByIdentity: IdentityRef
  
  /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
  var modifiedDate: js.Date
  
  /**
    * Name of the plan
    */
  var name: String
  
  /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewPropertyCollection.
    */
  var properties: Any
  
  /**
    * Revision of the plan. Used to safeguard users from overwriting each other's changes.
    */
  var revision: Double
  
  /**
    * Type of the plan
    */
  var `type`: PlanType
  
  /**
    * The resource url to locate the plan via rest api
    */
  var url: String
  
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
}
object Plan {
  
  inline def apply(
    createdByIdentity: IdentityRef,
    createdDate: js.Date,
    description: String,
    id: String,
    modifiedByIdentity: IdentityRef,
    modifiedDate: js.Date,
    name: String,
    properties: Any,
    revision: Double,
    `type`: PlanType,
    url: String,
    userPermissions: PlanUserPermissions
  ): Plan = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedByIdentity = modifiedByIdentity.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userPermissions = userPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    inline def setCreatedByIdentity(value: IdentityRef): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedByIdentity(value: IdentityRef): Self = StObject.set(x, "modifiedByIdentity", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUserPermissions(value: PlanUserPermissions): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
  }
}
