package typings.tinder.tinderMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When out of recommendations it is set to "out of recs", a possible value is also "recs timeout",
  * otherwise does not seem to be used
  */
trait TinderRecommendationsResult extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var results: js.Array[TinderRecommendation]
  var status: Number
}

object TinderRecommendationsResult {
  @scala.inline
  def apply(results: js.Array[TinderRecommendation], status: Number, message: String = null): TinderRecommendationsResult = {
    val __obj = js.Dynamic.literal(results = results, status = status)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TinderRecommendationsResult]
  }
}

