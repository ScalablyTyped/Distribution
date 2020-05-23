package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept information used in the Accept HTTP header on an HTTP request. */
trait HttpMediaTypeWithQualityHeaderValue extends js.Object {
  /** Gets or sets the character set of the content to accept that is used in the Accept HTTP header. */
  var charSet: String
  /** Gets or sets the media-type of the content to accept that is used in the Accept HTTP header. */
  var mediaType: String
  /** Gets a set of parameters included in the Accept HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  /** Get or set the qvalue or quality used in the Accept HTTP header. */
  var quality: Double
}

object HttpMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(charSet: String, mediaType: String, parameters: IVector[HttpNameValueHeaderValue], quality: Double): HttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMediaTypeWithQualityHeaderValue]
  }
}

