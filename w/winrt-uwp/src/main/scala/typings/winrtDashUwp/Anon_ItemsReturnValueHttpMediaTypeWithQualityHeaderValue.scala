package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue extends js.Object {
  /** An array of HttpMediaTypeWithQualityHeaderValue items that start at startIndex in the HttpMediaTypeWithQualityHeaderValueCollection . */ var items: HttpMediaTypeWithQualityHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(items: HttpMediaTypeWithQualityHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue]
  }
}

