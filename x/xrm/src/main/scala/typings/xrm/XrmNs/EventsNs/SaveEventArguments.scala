package typings.xrm.XrmNs.EventsNs

import typings.xrm.XrmEnumNs.SaveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for save event arguments.
  */
trait SaveEventArguments extends js.Object {
  /**
    * @summary Gets save mode, as an integer.
    * @returns The save mode.
    * @description Gets save mode, as an integer.<BR>
    * **Values returned are**:
    * * 1      Save
    * * 2      Save and Close
    * * 59     Save and New
    * * 70     AutoSave (Where enabled; can be used with an OnSave handler to conditionally disable auto-saving)
    * * 58     Save as Completed (Activities)
    * * 5      Deactivate
    * * 6      Reactivate
    * * 47     Assign (All user- or team-owned entities)
    * * 7      Send (Email)
    * * 16     Qualify (Lead)
    * * 15     Disqualify (Lead)
    */
  def getSaveMode(): SaveMode
  /**
    * Returns a boolean value to indicate if the record's save has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): Boolean
  /**
    * Prevents the save operation from being submitted to the server.
    * All remaining "on save" handlers will continue execution.
    */
  def preventDefault(): Unit
}

object SaveEventArguments {
  @scala.inline
  def apply(getSaveMode: () => SaveMode, isDefaultPrevented: () => Boolean, preventDefault: () => Unit): SaveEventArguments = {
    val __obj = js.Dynamic.literal(getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[SaveEventArguments]
  }
}

