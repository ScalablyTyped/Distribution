package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaTypeWithQualityHeaderValue extends js.Object {
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeWithQualityHeaderValue
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_MediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(
    mediaTypeWithQualityHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeWithQualityHeaderValue,
    returnValue: scala.Boolean
  ): Anon_MediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_MediaTypeWithQualityHeaderValue]
  }
}

