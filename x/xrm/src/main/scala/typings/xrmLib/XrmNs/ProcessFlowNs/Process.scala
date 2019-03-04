package typings
package xrmLib.XrmNs.ProcessFlowNs

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
  def getId(): java.lang.String
  /**
    * Returns the name of the process.
    * @returns The name.
    */
  def getName(): java.lang.String
  /**
    * Returns an collection of stages in the process.
    * @returns The stages.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getStages(): xrmLib.XrmNs.CollectionNs.ItemCollection[Stage]
  /**
    * Returns a boolean value to indicate if the process is rendered.
    * @returns true if the process is rendered, false if not.
    */
  def isRendered(): scala.Boolean
}

object Process {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getStages: js.Function0[xrmLib.XrmNs.CollectionNs.ItemCollection[Stage]],
    isRendered: js.Function0[scala.Boolean]
  ): Process = {
    val __obj = js.Dynamic.literal(getId = getId, getName = getName, getStages = getStages, isRendered = isRendered)
  
    __obj.asInstanceOf[Process]
  }
}

