package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
trait HttpMediaTypeHeaderValue extends js.Object {
  /** Gets or sets the character set of the entity-body used in the Content-Type HTTP header. */
  var charSet: String
  /** Gets or sets the media-type of the entity-body used in the Content-Type HTTP header. */
  var mediaType: String
  /** Gets a set of parameters included in the Content-Type HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
}

object HttpMediaTypeHeaderValue {
  @scala.inline
  def apply(charSet: String, mediaType: String, parameters: IVector[HttpNameValueHeaderValue]): HttpMediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMediaTypeHeaderValue]
  }
}

