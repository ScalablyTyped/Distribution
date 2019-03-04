package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentCodingWithQualityHeaderValue extends js.Object {
  /** The HttpContentCodingWithQualityHeaderValue version of the string. */ var contentCodingWithQualityHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingWithQualityHeaderValue
  /** true if input is valid HttpContentCodingWithQualityHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(
    contentCodingWithQualityHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingWithQualityHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCodingWithQualityHeaderValue = contentCodingWithQualityHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ContentCodingWithQualityHeaderValue]
  }
}

