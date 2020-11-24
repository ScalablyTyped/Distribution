package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.TransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue")
@js.native
class HttpTransferCodingHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue {
  /**
    * Initializes a new instance of the HttpProductInfoHeaderValue class.
    * @param input The transfer-coding information to initialize the HttpProductInfoHeaderValue object.
    */
  def this(input: String) = this()
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
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpTransferCodingHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): TransferCodingHeaderValue = js.native
}
