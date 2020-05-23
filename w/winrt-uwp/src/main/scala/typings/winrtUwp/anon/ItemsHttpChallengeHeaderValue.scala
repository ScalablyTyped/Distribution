package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpChallengeHeaderValue extends js.Object {
  /** An array of HttpChallengeHeaderValue items that start at startIndex in the HttpChallengeHeaderValueCollection . */ var items: HttpChallengeHeaderValue
  /** The number of HttpChallengeHeaderValue items retrieved. */ var returnValue: Double
}

object ItemsHttpChallengeHeaderValue {
  @scala.inline
  def apply(items: HttpChallengeHeaderValue, returnValue: Double): ItemsHttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpChallengeHeaderValue]
  }
}

