package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plan extends StObject {
  
  /**
    * Identity that created this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var createdByIdentity: IdentityRef = js.native
  
  /**
    * Date when the plan was created
    */
  var createdDate: Date = js.native
  
  /**
    * Description of the plan
    */
  var description: String = js.native
  
  /**
    * Id of the plan
    */
  var id: String = js.native
  
  /**
    * Identity that last modified this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var modifiedByIdentity: IdentityRef = js.native
  
  /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
  var modifiedDate: Date = js.native
  
  /**
    * Name of the plan
    */
  var name: String = js.native
  
  /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewPropertyCollection.
    */
  var properties: js.Any = js.native
  
  /**
    * Revision of the plan. Used to safeguard users from overwriting each other's changes.
    */
  var revision: Double = js.native
  
  /**
    * Type of the plan
    */
  var `type`: PlanType = js.native
  
  /**
    * The resource url to locate the plan via rest api
    */
  var url: String = js.native
  
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions = js.native
}
object Plan {
  
  @scala.inline
  def apply(
    createdByIdentity: IdentityRef,
    createdDate: Date,
    description: String,
    id: String,
    modifiedByIdentity: IdentityRef,
    modifiedDate: Date,
    name: String,
    properties: js.Any,
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
  implicit class PlanMutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedByIdentity(value: IdentityRef): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByIdentity(value: IdentityRef): Self = StObject.set(x, "modifiedByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermissions(value: PlanUserPermissions): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
  }
}
