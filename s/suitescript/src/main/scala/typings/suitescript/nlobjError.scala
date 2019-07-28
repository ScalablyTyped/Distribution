package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
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
@JSGlobal("nlobjError")
@js.native
class nlobjError protected ()
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  def this(name: String) = this()
  def this(name: String, join: String) = this()
  def this(name: String, join: String, summary: String) = this()
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

