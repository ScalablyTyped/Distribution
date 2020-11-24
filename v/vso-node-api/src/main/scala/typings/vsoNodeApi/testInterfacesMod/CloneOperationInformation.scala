package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneOperationInformation extends js.Object {
  
  var cloneStatistics: CloneStatistics = js.native
  
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: Date = js.native
  
  /**
    * DateTime when the operation was started
    */
  var creationDate: Date = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationObject: ShallowReference = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationPlan: ShallowReference = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationProject: ShallowReference = js.native
  
  /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
  var message: String = js.native
  
  /**
    * The ID of the operation
    */
  var opId: Double = js.native
  
  /**
    * The type of the object generated as a result of the Clone operation
    */
  var resultObjectType: ResultObjectType = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourceObject: ShallowReference = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourcePlan: ShallowReference = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourceProject: ShallowReference = js.native
  
  /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
  var state: CloneOperationState = js.native
  
  /**
    * Url for geting the clone information
    */
  var url: String = js.native
}
object CloneOperationInformation {
  
  @scala.inline
  def apply(
    cloneStatistics: CloneStatistics,
    completionDate: Date,
    creationDate: Date,
    destinationObject: ShallowReference,
    destinationPlan: ShallowReference,
    destinationProject: ShallowReference,
    message: String,
    opId: Double,
    resultObjectType: ResultObjectType,
    sourceObject: ShallowReference,
    sourcePlan: ShallowReference,
    sourceProject: ShallowReference,
    state: CloneOperationState,
    url: String
  ): CloneOperationInformation = {
    val __obj = js.Dynamic.literal(cloneStatistics = cloneStatistics.asInstanceOf[js.Any], completionDate = completionDate.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], destinationObject = destinationObject.asInstanceOf[js.Any], destinationPlan = destinationPlan.asInstanceOf[js.Any], destinationProject = destinationProject.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], opId = opId.asInstanceOf[js.Any], resultObjectType = resultObjectType.asInstanceOf[js.Any], sourceObject = sourceObject.asInstanceOf[js.Any], sourcePlan = sourcePlan.asInstanceOf[js.Any], sourceProject = sourceProject.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOperationInformation]
  }
  
  @scala.inline
  implicit class CloneOperationInformationOps[Self <: CloneOperationInformation] (val x: Self) extends AnyVal {
    
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
    def setCloneStatistics(value: CloneStatistics): Self = this.set("cloneStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDate(value: Date): Self = this.set("completionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationObject(value: ShallowReference): Self = this.set("destinationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPlan(value: ShallowReference): Self = this.set("destinationPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProject(value: ShallowReference): Self = this.set("destinationProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpId(value: Double): Self = this.set("opId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultObjectType(value: ResultObjectType): Self = this.set("resultObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObject(value: ShallowReference): Self = this.set("sourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePlan(value: ShallowReference): Self = this.set("sourcePlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceProject(value: ShallowReference): Self = this.set("sourceProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CloneOperationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
