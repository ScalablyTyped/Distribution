package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionRevision extends StObject {
  
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: String
  
  /**
    * Gets type of change.
    */
  var changeType: AuditAction
  
  /**
    * Gets the identity who did change.
    */
  var changedBy: IdentityRef
  
  /**
    * Gets date on which it got changed.
    */
  var changedDate: Date
  
  /**
    * Gets comments for revision.
    */
  var comment: String
  
  /**
    * Get id of the definition.
    */
  var definitionId: Double
  
  /**
    * Gets definition url.
    */
  var definitionUrl: String
  
  /**
    * Get revision number of the definition.
    */
  var revision: Double
}
object ReleaseDefinitionRevision {
  
  inline def apply(
    apiVersion: String,
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    definitionId: Double,
    definitionUrl: String,
    revision: Double
  ): ReleaseDefinitionRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionRevision]
  }
  
  extension [Self <: ReleaseDefinitionRevision](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUrl(value: String): Self = StObject.set(x, "definitionUrl", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
