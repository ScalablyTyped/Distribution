package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentRangeHeaderValue extends js.Object {
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: HttpContentRangeHeaderValue
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonContentRangeHeaderValue {
  @scala.inline
  def apply(contentRangeHeaderValue: HttpContentRangeHeaderValue, returnValue: Boolean): AnonContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(contentRangeHeaderValue = contentRangeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentRangeHeaderValue]
  }
}

