package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
trait HttpTransferCodingHeaderValue extends js.Object {
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: String
}

object HttpTransferCodingHeaderValue {
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], value: String): HttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransferCodingHeaderValue]
  }
}

