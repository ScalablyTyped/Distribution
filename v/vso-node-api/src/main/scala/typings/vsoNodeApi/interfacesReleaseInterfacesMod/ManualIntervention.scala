package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualIntervention extends StObject {
  
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef
  
  /**
    * Gets or sets comments for approval.
    */
  var comments: String
  
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date
  
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: Double
  
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: String
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date
  
  /**
    * Gets or sets the name.
    */
  var name: String
  
  /**
    * Gets releaseReference for manual intervention.
    */
  var release: ReleaseShallowReference
  
  /**
    * Gets releaseDefinitionReference for manual intervention.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  
  /**
    * Gets releaseEnvironmentReference for manual intervention.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference
  
  /**
    * Gets or sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus
  
  /**
    * Get task instance identifier.
    */
  var taskInstanceId: String
  
  /**
    * Gets url to access the manual intervention.
    */
  var url: String
}
object ManualIntervention {
  
  inline def apply(
    approver: IdentityRef,
    comments: String,
    createdOn: js.Date,
    id: Double,
    instructions: String,
    modifiedOn: js.Date,
    name: String,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    status: ManualInterventionStatus,
    taskInstanceId: String,
    url: String
  ): ManualIntervention = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskInstanceId = taskInstanceId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualIntervention]
  }
  
  extension [Self <: ManualIntervention](x: Self) {
    
    inline def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: ReleaseShallowReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    inline def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = StObject.set(x, "releaseEnvironment", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ManualInterventionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTaskInstanceId(value: String): Self = StObject.set(x, "taskInstanceId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
