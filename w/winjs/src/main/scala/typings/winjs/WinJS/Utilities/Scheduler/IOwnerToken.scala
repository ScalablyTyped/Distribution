package typings.winjs.WinJS.Utilities.Scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object that owns jobs. You can use this object to cancel a set of jobs.
  **/
@js.native
trait IOwnerToken extends js.Object {
  //#region Methods
  /**
    * Synchronously cancels the job that this token owns, including paused and blocked jobs.
    **/
  def cancelAll(): Unit = js.native
}

object IOwnerToken {
  @scala.inline
  def apply(cancelAll: () => Unit): IOwnerToken = {
    val __obj = js.Dynamic.literal(cancelAll = js.Any.fromFunction0(cancelAll))
    __obj.asInstanceOf[IOwnerToken]
  }
  @scala.inline
  implicit class IOwnerTokenOps[Self <: IOwnerToken] (val x: Self) extends AnyVal {
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
    def setCancelAll(value: () => Unit): Self = this.set("cancelAll", js.Any.fromFunction0(value))
  }
  
}

