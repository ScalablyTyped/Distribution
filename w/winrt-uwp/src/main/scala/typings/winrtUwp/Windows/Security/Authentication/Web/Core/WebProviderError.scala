package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error from a web account provider. */
trait WebProviderError extends js.Object {
  /** Gets the error code. */
  var errorCode: Double
  /** Gets the error message. */
  var errorMessage: String
  /** Gets the error properties. */
  var properties: IMap[String, String]
}

object WebProviderError {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String, properties: IMap[String, String]): WebProviderError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderError]
  }
}

