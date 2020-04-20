package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaTypeHeaderValue extends js.Object {
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonMediaTypeHeaderValue {
  @scala.inline
  def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): AnonMediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaTypeHeaderValue]
  }
}

