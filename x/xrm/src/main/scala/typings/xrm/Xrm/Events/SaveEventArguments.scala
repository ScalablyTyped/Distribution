package typings.xrm.Xrm.Events

import typings.xrm.XrmEnum.SaveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for save event arguments.
  */
@js.native
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
  def getSaveMode(): SaveMode = js.native
  /**
    * Returns a boolean value to indicate if the record's save has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): Boolean = js.native
  /**
    * Prevents the save operation from being submitted to the server.
    * All remaining "on save" handlers will continue execution.
    */
  def preventDefault(): Unit = js.native
}

object SaveEventArguments {
  @scala.inline
  def apply(getSaveMode: () => SaveMode, isDefaultPrevented: () => Boolean, preventDefault: () => Unit): SaveEventArguments = {
    val __obj = js.Dynamic.literal(getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[SaveEventArguments]
  }
  @scala.inline
  implicit class SaveEventArgumentsOps[Self <: SaveEventArguments] (val x: Self) extends AnyVal {
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
    def setGetSaveMode(value: () => SaveMode): Self = this.set("getSaveMode", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
  }
  
}

