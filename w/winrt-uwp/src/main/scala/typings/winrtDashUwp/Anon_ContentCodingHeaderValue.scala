package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentCodingHeaderValue extends js.Object {
  /** The HttpContentCodingHeaderValue version of the string. */ var contentCodingHeaderValue: HttpContentCodingHeaderValue
  /** true if input is valid HttpContentCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ContentCodingHeaderValue {
  @scala.inline
  def apply(contentCodingHeaderValue: HttpContentCodingHeaderValue, returnValue: Boolean): Anon_ContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingHeaderValue = contentCodingHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ContentCodingHeaderValue]
  }
}

