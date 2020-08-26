package typings.xrm.Xrm.ProcessFlow

import typings.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM Business Process Flow instance.
  */
@js.native
trait Process extends js.Object {
  /**
    * Returns the unique identifier of the process.
    * @returns The identifier for this process, in GUID format.
    * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
    */
  def getId(): String = js.native
  /**
    * Returns the name of the process.
    * @returns The name.
    */
  def getName(): String = js.native
  /**
    * Returns an collection of stages in the process.
    * @returns The stages.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getStages(): ItemCollection[Stage] = js.native
  /**
    * Returns a boolean value to indicate if the process is rendered.
    * @returns true if the process is rendered, false if not.
    */
  def isRendered(): Boolean = js.native
}

object Process {
  @scala.inline
  def apply(
    getId: () => String,
    getName: () => String,
    getStages: () => ItemCollection[Stage],
    isRendered: () => Boolean
  ): Process = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStages = js.Any.fromFunction0(getStages), isRendered = js.Any.fromFunction0(isRendered))
    __obj.asInstanceOf[Process]
  }
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
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
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStages(value: () => ItemCollection[Stage]): Self = this.set("getStages", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRendered(value: () => Boolean): Self = this.set("isRendered", js.Any.fromFunction0(value))
  }
  
}

