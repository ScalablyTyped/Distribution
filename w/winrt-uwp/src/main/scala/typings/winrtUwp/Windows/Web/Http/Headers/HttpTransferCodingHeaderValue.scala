package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.AnonTransferCodingHeaderValue
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
@js.native
class HttpTransferCodingHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpProductInfoHeaderValue class.
    * @param input The transfer-coding information to initialize the HttpProductInfoHeaderValue object.
    */
  def this(input: String) = this()
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
@js.native
object HttpTransferCodingHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpTransferCodingHeaderValue instance.
    * @param input A string that represents the transfer-coding information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  def parse(input: String): HttpTransferCodingHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpTransferCodingHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): AnonTransferCodingHeaderValue = js.native
}

