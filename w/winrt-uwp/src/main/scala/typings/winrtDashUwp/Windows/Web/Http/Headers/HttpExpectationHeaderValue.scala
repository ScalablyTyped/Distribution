package typings.winrtDashUwp.Windows.Web.Http.Headers

import typings.winrtDashUwp.Anon_ExpectationHeaderValue
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValue")
@js.native
class HttpExpectationHeaderValue protected () extends js.Object {
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
  /** Gets or sets a token that represents a name for a server behavior used in the Expect HTTP header. */
  var name: String = js.native
  /** Gets a set of parameters for a server behavior included in the Expect HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets or sets a value for a server behavior used in the Expect HTTP header. */
  var value: String = js.native
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
  def parse(input: String): HttpExpectationHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): Anon_ExpectationHeaderValue = js.native
}

