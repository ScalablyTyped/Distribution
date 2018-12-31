package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When out of recommendations it is set to "out of recs", a possible value is also "recs timeout",
  * otherwise does not seem to be used
  */
trait TinderRecommendationsResult extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var results: js.Array[TinderRecommendation]
  var status: stdLib.Number
}

