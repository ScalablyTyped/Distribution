package typings.uirouterCore.urlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchResult extends js.Object {
  /** The matched value from a [[UrlRule]] */
  var `match`: js.Any = js.native
  /** The rule that matched */
  var rule: UrlRule = js.native
  /** The match result weight */
  var weight: Double = js.native
}

object MatchResult {
  @scala.inline
  def apply(`match`: js.Any, rule: UrlRule, weight: Double): MatchResult = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResult]
  }
  @scala.inline
  implicit class MatchResultOps[Self <: MatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatch(value: js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: UrlRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

