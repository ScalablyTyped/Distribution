package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjServerResponse..
  *
  * @classDescription Contains the results of a server response to an outbound Http(s) call.
  * @return {nlobjServerResponse}
  * @constructor
  *
  * @since 2008.1
  */
@js.native
trait nlobjServerResponse
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  /**
    * return an Array of all headers returned.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    */
  def getAllHeaders(): Unit = js.native
  /**
    * return the response body returned.
    * @return {string}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @return
    */
  def getBody(): js.Any = js.native
  /**
    * return the response code returned.
    * @return {int}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @return
    */
  def getCode(): String = js.native
  /**
    * return the Content-Type header in response
    * @return {string}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @return
    */
  def getContentType(): String = js.native
  /**
    * return the nlobjError thrown via a client call to nlapiRequestURL.
    * @return {nlobjError}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @return
    */
  def getError(): js.Function0[Unit] = js.native
  /**
    * return the value of a header returned.
    * @param {string} name the name of the header to return
    * @return {string}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @param name
    * @return
    */
  def getHeader(name: String): String = js.native
  /**
    * return all the values of a header returned.
    * @param {string} name the name of the header to return
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjServerResponse
    *
    * @since 2008.1
    * @param name
    */
  def getHeaders(name: String): Unit = js.native
}

