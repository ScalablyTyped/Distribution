package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.TransferCodingHeaderValue
import org.scalablytyped.runtime.StObject
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
object HttpTransferCodingHeaderValue {
  
  /**
    * Converts a string to an HttpTransferCodingHeaderValue instance.
    * @param input A string that represents the transfer-coding information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpTransferCodingHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): TransferCodingHeaderValue = js.native
}
