package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentRangeHeaderValue extends js.Object {
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: HttpContentRangeHeaderValue
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ContentRangeHeaderValue {
  @scala.inline
  def apply(contentRangeHeaderValue: HttpContentRangeHeaderValue, returnValue: Boolean): Anon_ContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(contentRangeHeaderValue = contentRangeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContentRangeHeaderValue]
  }
}

