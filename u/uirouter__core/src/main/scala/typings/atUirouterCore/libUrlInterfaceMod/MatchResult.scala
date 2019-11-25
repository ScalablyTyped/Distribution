package typings.atUirouterCore.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResult extends js.Object {
  /** The matched value from a [[UrlRule]] */
  var `match`: js.Any
  /** The rule that matched */
  var rule: UrlRule
  /** The match result weight */
  var weight: Double
}

object MatchResult {
  @scala.inline
  def apply(`match`: js.Any, rule: UrlRule, weight: Double): MatchResult = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResult]
  }
}

