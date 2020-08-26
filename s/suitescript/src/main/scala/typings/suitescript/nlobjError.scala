package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjError used system or user-defined error object.
  *
  * @classDescription Encapsulation of errors thrown during script execution.
  * @return {nlobjError}
  * @constructor
  */
@js.native
trait nlobjError extends js.Object {
  /**
    * return the error code for this system or user-defined error.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getCode(): String = js.native
  /**
    * return the error description for this error.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getDetails(): String = js.native
  /**
    * return the error db ID for this error (if it was an unhandled unexpected error).
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getId(): String = js.native
  /**
    * return the internalid of the record if this error was thrown in an aftersubmit script.
    * @return {int}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getInternalId(): js.Any = js.native
  /**
    * return a stacktrace containing the location of the error.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    */
  def getStackTrace(): Unit = js.native
  /**
    * return the userevent script name where this error was thrown.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getUserEvent(): String = js.native
}

object nlobjError {
  @scala.inline
  def apply(
    getCode: () => String,
    getDetails: () => String,
    getId: () => String,
    getInternalId: () => js.Any,
    getStackTrace: () => Unit,
    getUserEvent: () => String
  ): nlobjError = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), getDetails = js.Any.fromFunction0(getDetails), getId = js.Any.fromFunction0(getId), getInternalId = js.Any.fromFunction0(getInternalId), getStackTrace = js.Any.fromFunction0(getStackTrace), getUserEvent = js.Any.fromFunction0(getUserEvent))
    __obj.asInstanceOf[nlobjError]
  }
  @scala.inline
  implicit class nlobjErrorOps[Self <: nlobjError] (val x: Self) extends AnyVal {
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
    def setGetCode(value: () => String): Self = this.set("getCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDetails(value: () => String): Self = this.set("getDetails", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInternalId(value: () => js.Any): Self = this.set("getInternalId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStackTrace(value: () => Unit): Self = this.set("getStackTrace", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserEvent(value: () => String): Self = this.set("getUserEvent", js.Any.fromFunction0(value))
  }
  
}

