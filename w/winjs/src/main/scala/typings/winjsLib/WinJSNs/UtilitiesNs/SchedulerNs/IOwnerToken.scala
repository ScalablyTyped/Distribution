package typings
package winjsLib.WinJSNs.UtilitiesNs.SchedulerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object that owns jobs. You can use this object to cancel a set of jobs.
  **/
trait IOwnerToken extends js.Object {
  //#region Methods
  /**
    * Synchronously cancels the job that this token owns, including paused and blocked jobs.
    **/
  def cancelAll(): scala.Unit
}

object IOwnerToken {
  @scala.inline
  def apply(cancelAll: () => scala.Unit): IOwnerToken = {
    val __obj = js.Dynamic.literal(cancelAll = js.Any.fromFunction0(cancelAll))
  
    __obj.asInstanceOf[IOwnerToken]
  }
}

