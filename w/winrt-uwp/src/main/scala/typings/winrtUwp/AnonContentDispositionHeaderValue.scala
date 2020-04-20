package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentDispositionHeaderValue extends js.Object {
  /** The HttpContentDispositionHeaderValue version of the string. */ var contentDispositionHeaderValue: HttpContentDispositionHeaderValue
  /** true if input is valid HttpContentDispositionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonContentDispositionHeaderValue {
  @scala.inline
  def apply(contentDispositionHeaderValue: HttpContentDispositionHeaderValue, returnValue: Boolean): AnonContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(contentDispositionHeaderValue = contentDispositionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentDispositionHeaderValue]
  }
}

