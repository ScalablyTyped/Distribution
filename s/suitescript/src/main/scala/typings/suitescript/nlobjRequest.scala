package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjRequest used for scripting web requests in Suitelets
  *
  * @classDescription Accessor to Http request data made available to Suitelets
  * @return {nlobjRequest}
  */
@js.native
trait nlobjRequest
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[Any] {
  
  /**
    * return an Object containing field names to file objects for all uploaded files.
    * @return {Object}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2009.1
    * @return
    */
  def getAllFiles(): Any = js.native
  
  /**
    * return an Object containing all the request headers and their values.
    * @return {Object}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @return
    */
  def getAllHeaders(): Any = js.native
  
  /**
    * return an Object containing all the request parameters and their values.
    * @return {Object}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @return
    */
  def getAllParameters(): Any = js.native
  
  /**
    * return the body of the POST request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getBody(): Any = js.native
  
  /**
    * return the value of an uploaded file.
    * @param {string} name file field name
    * @return {nlobjFile}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2009.1
    * @param name
    * @return
    */
  def getFile(name: String): nlobjFile = js.native
  
  /**
    * return the value of a request header.
    * @param {string} name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    * @return
    */
  def getHeader(name: String): String = js.native
  
  /**
    * return the number of lines in a sublist.
    * @param {string} group sublist name
    * @return {int}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param group
    * @return
    */
  def getLineItemCount(group: String): String | Double = js.native
  
  /**
    * return the value of a sublist value.
    * @param {string}    group sublist name
    * @param {string}    name  sublist field name
    * @param {int}    line  sublist line number
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param group
    * @param name
    * @param line
    * @return
    */
  def getLineItemValue(group: String, name: String, line: Any): String = js.native
  
  /**
    * return the METHOD of the request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getMethod(): String = js.native
  
  /**
    * return the value of a request parameter.
    *
    * @param {string} name parameter name
    * @return {string}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    * @return
    */
  def getParameter(name: String): String = js.native
  
  /**
    * return the values of a request parameter as an Array.
    *
    * @param {string} name parameter name
    * @return {string[]}
    * @method
    * @memberOf nlobjRequest
    *
    * @since 2008.2
    * @param name
    */
  def getParameterValues(name: String): Unit = js.native
  
  /**
    * return the URL of the request
    * @return {string}
    *
    * @method
    * @memberOf nlobjRequest
    * @since 2008.1
    * @return
    */
  def getURL(): String = js.native
}
