package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaTypeHeaderValue extends js.Object {
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeHeaderValue
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_MediaTypeHeaderValue {
  @scala.inline
  def apply(
    mediaTypeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeHeaderValue,
    returnValue: scala.Boolean
  ): Anon_MediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_MediaTypeHeaderValue]
  }
}

