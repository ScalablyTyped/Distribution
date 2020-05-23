package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
trait HttpContentCodingHeaderValue extends js.Object {
  /** Gets the value of the content-coding information used in the Content-Encoding HTTP header. */
  var contentCoding: String
}

object HttpContentCodingHeaderValue {
  @scala.inline
  def apply(contentCoding: String): HttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingHeaderValue]
  }
}

