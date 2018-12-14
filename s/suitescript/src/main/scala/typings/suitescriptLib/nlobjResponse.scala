package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
org.scalablytyped.runtime.Instantiable0[js.Any] {
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
  def addHeader(name: java.lang.String, value: java.lang.String): js.Any = js.native
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
  def getCode(): java.lang.String = js.native
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
  def getHeader(): java.lang.String = js.native
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
  def getHeaders(name: java.lang.String): scala.Unit = js.native
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
  def sendRedirect(`type`: java.lang.String, subtype: java.lang.String): js.Any = js.native
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
  def sendRedirect(`type`: java.lang.String, subtype: java.lang.String, id: java.lang.String): js.Any = js.native
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
  def sendRedirect(`type`: java.lang.String, subtype: java.lang.String, id: java.lang.String, pagemode: scala.Boolean): js.Any = js.native
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
  def sendRedirect(
    `type`: java.lang.String,
    subtype: java.lang.String,
    id: java.lang.String,
    pagemode: scala.Boolean,
    parameters: js.Any
  ): js.Any = js.native
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
  def sendRedirect(`type`: java.lang.String, subtype: java.lang.String, id: scala.Double): js.Any = js.native
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
  def sendRedirect(`type`: java.lang.String, subtype: java.lang.String, id: scala.Double, pagemode: scala.Boolean): js.Any = js.native
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
  def sendRedirect(
    `type`: java.lang.String,
    subtype: java.lang.String,
    id: scala.Double,
    pagemode: scala.Boolean,
    parameters: js.Any
  ): js.Any = js.native
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
  def setContentType(`type`: java.lang.String): scala.Unit = js.native
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
  def setContentType(`type`: java.lang.String, name: java.lang.String): scala.Unit = js.native
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
  def setContentType(`type`: java.lang.String, name: java.lang.String, disposition: java.lang.String): scala.Unit = js.native
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
  def setEncoding(encoding: java.lang.String): js.Any = js.native
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
  def setHeader(name: java.lang.String, value: java.lang.String): js.Any = js.native
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
  def write(output: java.lang.String): js.Any = js.native
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
  def writeLine(output: java.lang.String): js.Any = js.native
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

