package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
trait HttpContentCodingWithQualityHeaderValue extends js.Object {
  /** Gets the value of the content-coding characteristic in the Accept-Encoding HTTP header. */
  var contentCoding: String
  /** Gets the value of the qvalue attribute in the Accept-Encoding HTTP header. */
  var quality: Double
}

object HttpContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(contentCoding: String, quality: Double): HttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingWithQualityHeaderValue]
  }
}

