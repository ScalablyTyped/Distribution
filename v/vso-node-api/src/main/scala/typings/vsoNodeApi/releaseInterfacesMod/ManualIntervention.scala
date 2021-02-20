package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualIntervention extends StObject {
  
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef = js.native
  
  /**
    * Gets or sets comments for approval.
    */
  var comments: String = js.native
  
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: Double = js.native
  
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: String = js.native
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  
  /**
    * Gets or sets the name.
    */
  var name: String = js.native
  
  /**
    * Gets releaseReference for manual intervention.
    */
  var release: ReleaseShallowReference = js.native
  
  /**
    * Gets releaseDefinitionReference for manual intervention.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  
  /**
    * Gets releaseEnvironmentReference for manual intervention.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  
  /**
    * Gets or sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus = js.native
  
  /**
    * Get task instance identifier.
    */
  var taskInstanceId: String = js.native
  
  /**
    * Gets url to access the manual intervention.
    */
  var url: String = js.native
}
object ManualIntervention {
  
  @scala.inline
  def apply(
    approver: IdentityRef,
    comments: String,
    createdOn: Date,
    id: Double,
    instructions: String,
    modifiedOn: Date,
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
  
  @scala.inline
  implicit class ManualInterventionMutableBuilder[Self <: ManualIntervention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseShallowReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = StObject.set(x, "releaseEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ManualInterventionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskInstanceId(value: String): Self = StObject.set(x, "taskInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
