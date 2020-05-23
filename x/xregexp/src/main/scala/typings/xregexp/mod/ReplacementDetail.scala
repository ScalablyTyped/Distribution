package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replacement details used in and array for replacing multiple items.
  */
trait ReplacementDetail extends js.Object {
  /**
    * What to search for.
    */
  var `0`: Pattern
  /**
    * The replacement string or function
    */
  var `1`: ReplacementValue
  /**
    * Replacement scope. If not explicitly specified and `regex` uses flag g,
    * `scope` is 'all'.
    */
  var `2`: js.UndefOr[MatchScope | Null] = js.undefined
}

object ReplacementDetail {
  @scala.inline
  def apply(`0`: Pattern, `1`: ReplacementValue, `2`: js.UndefOr[Null | MatchScope] = js.undefined): ReplacementDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (!js.isUndefined(`2`)) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementDetail]
  }
}

