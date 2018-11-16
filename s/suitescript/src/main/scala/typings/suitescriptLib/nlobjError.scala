package typings
package suitescriptLib

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
ScalablyTyped.runtime.Instantiable0[js.Any] {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, join: java.lang.String) = this()
  def this(name: java.lang.String, join: java.lang.String, summary: java.lang.String) = this()
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
  def getCode(): java.lang.String = js.native
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
  def getDetails(): java.lang.String = js.native
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
  def getId(): java.lang.String = js.native
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
  def getStackTrace(): scala.Unit = js.native
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
  def getUserEvent(): java.lang.String = js.native
}

