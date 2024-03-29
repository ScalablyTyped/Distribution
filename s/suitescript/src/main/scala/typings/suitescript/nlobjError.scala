package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjError used system or user-defined error object.
  *
  * @classDescription Encapsulation of errors thrown during script execution.
  * @return {nlobjError}
  */
trait nlobjError extends StObject {
  
  /**
    * return the error code for this system or user-defined error.
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getCode(): String
  
  /**
    * return the error description for this error.
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getDetails(): String
  
  /**
    * return the error db ID for this error (if it was an unhandled unexpected error).
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getId(): String
  
  /**
    * return the internalid of the record if this error was thrown in an aftersubmit script.
    * @return {int}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getInternalId(): Any
  
  /**
    * return a stacktrace containing the location of the error.
    * @return {string[]}
    *
    * @method
    *
    * @since 2008.2
    */
  def getStackTrace(): Unit
  
  /**
    * return the userevent script name where this error was thrown.
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getUserEvent(): String
}
object nlobjError {
  
  inline def apply(
    getCode: () => String,
    getDetails: () => String,
    getId: () => String,
    getInternalId: () => Any,
    getStackTrace: () => Unit,
    getUserEvent: () => String
  ): nlobjError = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), getDetails = js.Any.fromFunction0(getDetails), getId = js.Any.fromFunction0(getId), getInternalId = js.Any.fromFunction0(getInternalId), getStackTrace = js.Any.fromFunction0(getStackTrace), getUserEvent = js.Any.fromFunction0(getUserEvent))
    __obj.asInstanceOf[nlobjError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: nlobjError] (val x: Self) extends AnyVal {
    
    inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
    
    inline def setGetDetails(value: () => String): Self = StObject.set(x, "getDetails", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetInternalId(value: () => Any): Self = StObject.set(x, "getInternalId", js.Any.fromFunction0(value))
    
    inline def setGetStackTrace(value: () => Unit): Self = StObject.set(x, "getStackTrace", js.Any.fromFunction0(value))
    
    inline def setGetUserEvent(value: () => String): Self = StObject.set(x, "getUserEvent", js.Any.fromFunction0(value))
  }
}
