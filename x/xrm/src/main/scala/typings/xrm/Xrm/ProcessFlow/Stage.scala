package typings.xrm.Xrm.ProcessFlow

import typings.xrm.anon.GetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CRM Business Process Flow stages.
  */
@js.native
trait Stage extends js.Object {
  /**
    * Returns an object with a getValue method which will return the integer value of the business process flow
    * category.
    * @returns The stage category.
    */
  def getCategory(): GetValue = js.native
  /**
    * Returns the logical name of the entity associated with the stage.
    * @returns The entity name.
    */
  def getEntityName(): String = js.native
  /**
    * Returns the unique identifier of the stage.
    * @returns The identifier of the Stage, in GUID format.
    * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
    */
  def getId(): String = js.native
  /**
    * Returns the name of the stage.
    * @returns The name.
    */
  def getName(): String = js.native
  /**
    * Returns the status of the stage.
    * @returns The status, either "active" or "inactive".
    */
  def getStatus(): StageStatus = js.native
  /**
    * Returns a collection of steps in the stage.
    * @returns An array of Step.
    */
  def getSteps(): js.Array[Step] = js.native
}

object Stage {
  @scala.inline
  def apply(
    getCategory: () => GetValue,
    getEntityName: () => String,
    getId: () => String,
    getName: () => String,
    getStatus: () => StageStatus,
    getSteps: () => js.Array[Step]
  ): Stage = {
    val __obj = js.Dynamic.literal(getCategory = js.Any.fromFunction0(getCategory), getEntityName = js.Any.fromFunction0(getEntityName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus), getSteps = js.Any.fromFunction0(getSteps))
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
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
    def setGetCategory(value: () => GetValue): Self = this.set("getCategory", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntityName(value: () => String): Self = this.set("getEntityName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatus(value: () => StageStatus): Self = this.set("getStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSteps(value: () => js.Array[Step]): Self = this.set("getSteps", js.Any.fromFunction0(value))
  }
  
}

