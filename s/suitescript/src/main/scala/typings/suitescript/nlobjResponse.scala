package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjResponse used for scripting web responses in Suitelets
  *
  * @classDescription Accessor to Http response made available to Suitelets.
  * @return {nlobjResponse}
  * @constructor
  */
@js.native
trait nlobjResponse
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * add a value for a response header.
    * @param  {string} name of header
    * @param  {string} value for header
    * @return  {void}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param name
    * @param value
    * @return
    */
  def addHeader(name: String, value: String): js.Any = js.native
  
  /**
    * return an Array of all response headers
    * @return  {Object}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @return
    */
  def getAllHeaders(): js.Any = js.native
  
  def getBody(): js.Any = js.native
  
  def getCode(): String = js.native
  
  /**
    * return the value of a response header.
    * @param  {string} name of header
    * @return  {string}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @return
    */
  def getHeader(): String = js.native
  
  /**
    * return an Array of all response header values for a header
    * @param  {string} name of header
    * @return  {string[]}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param name
    */
  def getHeaders(name: String): Unit = js.native
  
  /**
    * suppress caching for this response.
    * @return  {void}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2009.1
    * @return
    */
  def sendNoCache(): js.Any = js.native
  
  /**
    * sets the redirect URL for the response. all URLs must be internal unless the Suitelet is being executed in an "Available without Login" context
    *  at which point it can use type "external" to specify an external url via the subtype arg
    *
    * @param {string} type type specifier for URL: suitelet|tasklink|record|mediaitem|external
    * @param {string} subtype subtype specifier for URL (corresponding to type): scriptid|taskid|recordtype|mediaid|url
    * @param {string} [id] internal ID specifier (sub-subtype corresponding to type): deploymentid|n/a|recordid|n/a
    * @param {string} [pagemode] string specifier used to configure page (suitelet: external|internal, tasklink|record: edit|view)
    * @param {Object} [parameters] Object used to specify additional URL parameters as name/value pairs
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param type
    * @param subtype
    * @param id?
    * @param pagemode?
    * @param parameters?
    * @return
    */
  def sendRedirect(`type`: String, subtype: String): js.Any = js.native
  def sendRedirect(
    `type`: String,
    subtype: String,
    id: js.UndefOr[scala.Nothing],
    pagemode: js.UndefOr[scala.Nothing],
    parameters: js.Any
  ): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: js.UndefOr[scala.Nothing], pagemode: Boolean): js.Any = js.native
  def sendRedirect(
    `type`: String,
    subtype: String,
    id: js.UndefOr[scala.Nothing],
    pagemode: Boolean,
    parameters: js.Any
  ): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: String): js.Any = js.native
  def sendRedirect(
    `type`: String,
    subtype: String,
    id: String,
    pagemode: js.UndefOr[scala.Nothing],
    parameters: js.Any
  ): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: String, pagemode: Boolean): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: String, pagemode: Boolean, parameters: js.Any): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: Double): js.Any = js.native
  def sendRedirect(
    `type`: String,
    subtype: String,
    id: Double,
    pagemode: js.UndefOr[scala.Nothing],
    parameters: js.Any
  ): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: Double, pagemode: Boolean): js.Any = js.native
  def sendRedirect(`type`: String, subtype: String, id: Double, pagemode: Boolean, parameters: js.Any): js.Any = js.native
  
  /**
    * sets the content type for the response (and an optional filename for binary output).
    *
    * @param {string} type the file type i.e. plainText, word, pdf, htmldoc (see list of media item types)
    * @param {string} filename the file name
    * @param {string} disposition Content Disposition used for streaming attachments: inline|attachment
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param type
    * @param filename
    * @param disposition
    * @return
    */
  def setContentType(`type`: String): Unit = js.native
  def setContentType(`type`: String, name: js.UndefOr[scala.Nothing], disposition: String): Unit = js.native
  def setContentType(`type`: String, name: String): Unit = js.native
  def setContentType(`type`: String, name: String, disposition: String): Unit = js.native
  
  /**
    * sets the character encoding for the response.
    * @param {String} encoding
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2012.2
    * @param encoding
    * @return
    */
  def setEncoding(encoding: String): js.Any = js.native
  
  /**
    * set the value of a response header.
    * @param  {string} name of header
    * @param  {string} value for header
    * @return  {void}
    *
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param name
    * @param value
    * @return
    */
  def setHeader(name: String, value: String): js.Any = js.native
  
  /**
    * write information (text/xml/html) to the response.
    *
    * @param {string} output
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param output
    * @return
    */
  def write(output: String): js.Any = js.native
  
  /**
    * write line information (text/xml/html) to the response.
    *
    * @param {string} output
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param output
    * @return
    */
  def writeLine(output: String): js.Any = js.native
  
  /**
    * write a UI object page.
    *
    * @param {Object} pageobject page UI object: nlobjList|nlobjAssistant|nlobjForm|nlobjDashboard
    * @return {void}
    * @method
    * @memberOf nlobjResponse
    *
    * @since 2008.2
    * @param pageobject
    * @return
    */
  def writePage(pageobject: js.Any): js.Any = js.native
}
