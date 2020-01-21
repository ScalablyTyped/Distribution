package typings.xrm.Xrm.ProcessFlow

import typings.xrm.AnonGetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CRM Business Process Flow stages.
  */
trait Stage extends js.Object {
  /**
    * Returns an object with a getValue method which will return the integer value of the business process flow
    * category.
    * @returns The stage category.
    */
  def getCategory(): AnonGetValue
  /**
    * Returns the logical name of the entity associated with the stage.
    * @returns The entity name.
    */
  def getEntityName(): String
  /**
    * Returns the unique identifier of the stage.
    * @returns The identifier of the Stage, in GUID format.
    * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
    */
  def getId(): String
  /**
    * Returns the name of the stage.
    * @returns The name.
    */
  def getName(): String
  /**
    * Returns the status of the stage.
    * @returns The status, either "active" or "inactive".
    */
  def getStatus(): StageStatus
  /**
    * Returns a collection of steps in the stage.
    * @returns An array of Step.
    */
  def getSteps(): js.Array[Step]
}

object Stage {
  @scala.inline
  def apply(
    getCategory: () => AnonGetValue,
    getEntityName: () => String,
    getId: () => String,
    getName: () => String,
    getStatus: () => StageStatus,
    getSteps: () => js.Array[Step]
  ): Stage = {
    val __obj = js.Dynamic.literal(getCategory = js.Any.fromFunction0(getCategory), getEntityName = js.Any.fromFunction0(getEntityName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus), getSteps = js.Any.fromFunction0(getSteps))
  
    __obj.asInstanceOf[Stage]
  }
}

