package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
trait HttpContentRangeHeaderValue extends js.Object {
  /** Gets the position at which to start sending data in the Content-Range HTTP header. */
  var firstBytePosition: Double
  /** Gets the position at which to stop sending data in the Content-Range HTTP header. */
  var lastBytePosition: Double
  /** Gets the length of the full content entity body in the Content-Range HTTP header. */
  var length: Double
  /** Gets or sets the value of the range units used in the Content-Range HTTP header. */
  var unit: String
}

object HttpContentRangeHeaderValue {
  @scala.inline
  def apply(firstBytePosition: Double, lastBytePosition: Double, length: Double, unit: String): HttpContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(firstBytePosition = firstBytePosition.asInstanceOf[js.Any], lastBytePosition = lastBytePosition.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentRangeHeaderValue]
  }
}

