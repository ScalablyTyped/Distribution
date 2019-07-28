package typings.xrm.XrmNs.ProcessFlowNs

import typings.xrm.XrmNs.CollectionNs.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM Business Process Flow instance.
  */
trait Process extends js.Object {
  /**
    * Returns the unique identifier of the process.
    * @returns The identifier for this process, in GUID format.
    * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
    */
  def getId(): String
  /**
    * Returns the name of the process.
    * @returns The name.
    */
  def getName(): String
  /**
    * Returns an collection of stages in the process.
    * @returns The stages.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getStages(): ItemCollection[Stage]
  /**
    * Returns a boolean value to indicate if the process is rendered.
    * @returns true if the process is rendered, false if not.
    */
  def isRendered(): Boolean
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
}

