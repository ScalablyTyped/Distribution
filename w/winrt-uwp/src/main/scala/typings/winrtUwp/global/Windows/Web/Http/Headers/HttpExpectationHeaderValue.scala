package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValue")
@js.native
class HttpExpectationHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue {
  /**
    * Initializes a new instance of the HttpExpectationHeaderValue class with a name.
    * @param name A token that represents a name used in the Expect HTTP header.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpExpectationHeaderValue class with a name and value for the name.
    * @param name A token that represents a name used in the Expect HTTP header.
    * @param value A value for the name used in the Expect HTTP header.
    */
  def this(name: String, value: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValue")
@js.native
object HttpExpectationHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpExpectationHeaderValue instance.
    * @param input A string that represents the information in the Expect HTTP header.
    * @return An HttpExpectationHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ExpectationHeaderValue = js.native
}
