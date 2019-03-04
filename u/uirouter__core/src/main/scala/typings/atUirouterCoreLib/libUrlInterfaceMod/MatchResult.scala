package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResult extends js.Object {
  /** The matched value from a [[UrlRule]] */
  var `match`: js.Any
  /** The rule that matched */
  var rule: UrlRule
  /** The match result weight */
  var weight: scala.Double
}

object MatchResult {
  @scala.inline
  def apply(`match`: js.Any, rule: UrlRule, weight: scala.Double): MatchResult = {
    val __obj = js.Dynamic.literal(rule = rule, weight = weight)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[MatchResult]
  }
}

