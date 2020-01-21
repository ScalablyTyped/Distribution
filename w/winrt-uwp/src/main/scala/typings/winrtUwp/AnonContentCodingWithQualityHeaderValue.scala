package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentCodingWithQualityHeaderValue extends js.Object {
  /** The HttpContentCodingWithQualityHeaderValue version of the string. */ var contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue
  /** true if input is valid HttpContentCodingWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue, returnValue: Boolean): AnonContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingWithQualityHeaderValue = contentCodingWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentCodingWithQualityHeaderValue]
  }
}

