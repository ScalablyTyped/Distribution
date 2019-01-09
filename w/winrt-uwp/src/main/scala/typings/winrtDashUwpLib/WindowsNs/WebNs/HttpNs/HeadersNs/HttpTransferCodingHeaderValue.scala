package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

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
  def this(input: java.lang.String) = this()
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: java.lang.String = js.native
}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
@js.native
object HttpTransferCodingHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpTransferCodingHeaderValue instance.
    * @param input A string that represents the transfer-coding information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpTransferCodingHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpTransferCodingHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_ReturnValueTransferCodingHeaderValue = js.native
}

