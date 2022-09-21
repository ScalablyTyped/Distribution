package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneOperationInformation extends StObject {
  
  var cloneStatistics: CloneStatistics
  
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: js.Date
  
  /**
    * DateTime when the operation was started
    */
  var creationDate: js.Date
  
  /**
    * Shallow reference of the destination
    */
  var destinationObject: ShallowReference
  
  /**
    * Shallow reference of the destination
    */
  var destinationPlan: ShallowReference
  
  /**
    * Shallow reference of the destination
    */
  var destinationProject: ShallowReference
  
  /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
  var message: String
  
  /**
    * The ID of the operation
    */
  var opId: Double
  
  /**
    * The type of the object generated as a result of the Clone operation
    */
  var resultObjectType: ResultObjectType
  
  /**
    * Shallow reference of the source
    */
  var sourceObject: ShallowReference
  
  /**
    * Shallow reference of the source
    */
  var sourcePlan: ShallowReference
  
  /**
    * Shallow reference of the source
    */
  var sourceProject: ShallowReference
  
  /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
  var state: CloneOperationState
  
  /**
    * Url for geting the clone information
    */
  var url: String
}
object CloneOperationInformation {
  
  inline def apply(
    cloneStatistics: CloneStatistics,
    completionDate: js.Date,
    creationDate: js.Date,
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
  
  extension [Self <: CloneOperationInformation](x: Self) {
    
    inline def setCloneStatistics(value: CloneStatistics): Self = StObject.set(x, "cloneStatistics", value.asInstanceOf[js.Any])
    
    inline def setCompletionDate(value: js.Date): Self = StObject.set(x, "completionDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDestinationObject(value: ShallowReference): Self = StObject.set(x, "destinationObject", value.asInstanceOf[js.Any])
    
    inline def setDestinationPlan(value: ShallowReference): Self = StObject.set(x, "destinationPlan", value.asInstanceOf[js.Any])
    
    inline def setDestinationProject(value: ShallowReference): Self = StObject.set(x, "destinationProject", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpId(value: Double): Self = StObject.set(x, "opId", value.asInstanceOf[js.Any])
    
    inline def setResultObjectType(value: ResultObjectType): Self = StObject.set(x, "resultObjectType", value.asInstanceOf[js.Any])
    
    inline def setSourceObject(value: ShallowReference): Self = StObject.set(x, "sourceObject", value.asInstanceOf[js.Any])
    
    inline def setSourcePlan(value: ShallowReference): Self = StObject.set(x, "sourcePlan", value.asInstanceOf[js.Any])
    
    inline def setSourceProject(value: ShallowReference): Self = StObject.set(x, "sourceProject", value.asInstanceOf[js.Any])
    
    inline def setState(value: CloneOperationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
