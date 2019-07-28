package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentDispositionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDispositionHeaderValue extends js.Object {
  /** The HttpContentDispositionHeaderValue version of the string. */ var contentDispositionHeaderValue: HttpContentDispositionHeaderValue
  /** true if input is valid HttpContentDispositionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ContentDispositionHeaderValue {
  @scala.inline
  def apply(contentDispositionHeaderValue: HttpContentDispositionHeaderValue, returnValue: Boolean): Anon_ContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(contentDispositionHeaderValue = contentDispositionHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ContentDispositionHeaderValue]
  }
}

