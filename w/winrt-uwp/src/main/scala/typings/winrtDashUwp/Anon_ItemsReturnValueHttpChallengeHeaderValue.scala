package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpChallengeHeaderValue extends js.Object {
  /** An array of HttpChallengeHeaderValue items that start at startIndex in the HttpChallengeHeaderValueCollection . */ var items: HttpChallengeHeaderValue
  /** The number of HttpChallengeHeaderValue items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpChallengeHeaderValue {
  @scala.inline
  def apply(items: HttpChallengeHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpChallengeHeaderValue]
  }
}

