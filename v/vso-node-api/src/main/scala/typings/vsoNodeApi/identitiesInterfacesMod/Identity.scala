package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
  var customDisplayName: String = js.native
  
  var descriptor: IdentityDescriptor = js.native
  
  var id: String = js.native
  
  var isActive: Boolean = js.native
  
  var isContainer: Boolean = js.native
  
  var masterId: String = js.native
  
  var memberIds: js.Array[String] = js.native
  
  var memberOf: js.Array[IdentityDescriptor] = js.native
  
  var members: js.Array[IdentityDescriptor] = js.native
  
  var metaTypeId: Double = js.native
  
  var properties: js.Any = js.native
  
  /**
    * The display name for the identity as specified by the source identity provider.
    */
  var providerDisplayName: String = js.native
  
  var resourceVersion: Double = js.native
  
  var subjectDescriptor: String = js.native
  
  var uniqueUserId: Double = js.native
}
object Identity {
  
  @scala.inline
  def apply(
    customDisplayName: String,
    descriptor: IdentityDescriptor,
    id: String,
    isActive: Boolean,
    isContainer: Boolean,
    masterId: String,
    memberIds: js.Array[String],
    memberOf: js.Array[IdentityDescriptor],
    members: js.Array[IdentityDescriptor],
    metaTypeId: Double,
    properties: js.Any,
    providerDisplayName: String,
    resourceVersion: Double,
    subjectDescriptor: String,
    uniqueUserId: Double
  ): Identity = {
    val __obj = js.Dynamic.literal(customDisplayName = customDisplayName.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], masterId = masterId.asInstanceOf[js.Any], memberIds = memberIds.asInstanceOf[js.Any], memberOf = memberOf.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaTypeId = metaTypeId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], providerDisplayName = providerDisplayName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], subjectDescriptor = subjectDescriptor.asInstanceOf[js.Any], uniqueUserId = uniqueUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDisplayName(value: String): Self = StObject.set(x, "customDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptor(value: IdentityDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContainer(value: Boolean): Self = StObject.set(x, "isContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterId(value: String): Self = StObject.set(x, "masterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIds(value: js.Array[String]): Self = StObject.set(x, "memberIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdsVarargs(value: String*): Self = StObject.set(x, "memberIds", js.Array(value :_*))
    
    @scala.inline
    def setMemberOf(value: js.Array[IdentityDescriptor]): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberOfVarargs(value: IdentityDescriptor*): Self = StObject.set(x, "memberOf", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[IdentityDescriptor]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IdentityDescriptor*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMetaTypeId(value: Double): Self = StObject.set(x, "metaTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDisplayName(value: String): Self = StObject.set(x, "providerDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDescriptor(value: String): Self = StObject.set(x, "subjectDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUserId(value: Double): Self = StObject.set(x, "uniqueUserId", value.asInstanceOf[js.Any])
  }
}
