package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOperationInformation extends js.Object {
  var cloneStatistics: CloneStatistics
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: Date
  /**
    * DateTime when the operation was started
    */
  var creationDate: Date
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
}

