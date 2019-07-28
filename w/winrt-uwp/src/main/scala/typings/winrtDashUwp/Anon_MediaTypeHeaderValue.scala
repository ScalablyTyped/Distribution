package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaTypeHeaderValue extends js.Object {
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_MediaTypeHeaderValue {
  @scala.inline
  def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): Anon_MediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_MediaTypeHeaderValue]
  }
}

