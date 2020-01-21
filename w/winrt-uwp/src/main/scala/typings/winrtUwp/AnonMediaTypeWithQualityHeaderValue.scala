package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaTypeWithQualityHeaderValue extends js.Object {
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue, returnValue: Boolean): AnonMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMediaTypeWithQualityHeaderValue]
  }
}

