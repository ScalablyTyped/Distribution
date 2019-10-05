package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaTypeWithQualityHeaderValue extends js.Object {
  /** The HttpMediaTypeWithQualityHeaderValue version of the string. */ var mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue
  /** true if input is valid HttpMediaTypeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_MediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(mediaTypeWithQualityHeaderValue: HttpMediaTypeWithQualityHeaderValue, returnValue: Boolean): Anon_MediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeWithQualityHeaderValue = mediaTypeWithQualityHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_MediaTypeWithQualityHeaderValue]
  }
}

