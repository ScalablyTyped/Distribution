package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentCodingWithQualityHeaderValue extends js.Object {
  /** The HttpContentCodingWithQualityHeaderValue version of the string. */ var contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue
  /** true if input is valid HttpContentCodingWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(contentCodingWithQualityHeaderValue: HttpContentCodingWithQualityHeaderValue, returnValue: Boolean): Anon_ContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingWithQualityHeaderValue = contentCodingWithQualityHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ContentCodingWithQualityHeaderValue]
  }
}

