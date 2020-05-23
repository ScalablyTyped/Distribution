package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTypeHeaderValue extends js.Object {
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object MediaTypeHeaderValue {
  @scala.inline
  def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): MediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeHeaderValue]
  }
}

