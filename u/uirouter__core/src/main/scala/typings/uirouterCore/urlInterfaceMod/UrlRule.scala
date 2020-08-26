package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.TargetStateDef
import typings.uirouterCore.stateMod.TargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlRule extends js.Object {
  /**
    * The rule's ID.
    *
    * IDs are auto-assigned when the rule is registered, in increasing order.
    */
  @JSName("$id")
  var $id: Double = js.native
  /** @internal */
  var _group: Double = js.native
  /**
    * This function is called if the rule matched, and was selected as the "best match".
    * This function handles the rule match event.
    *
    * See [[UrlRuleHandlerFn]] for details
    */
  @JSName("handler")
  var handler_Original: UrlRuleHandlerFn = js.native
  /**
    * This function should match the url and return the match details
    *
    * See [[UrlRuleMatchFn]] for details
    */
  @JSName("match")
  var match_Original: UrlRuleMatchFn = js.native
  /**
    * The rule's priority (defaults to 0).
    *
    * This can be used to explicitly modify the rule's priority.
    * Higher numbers are higher priority.
    */
  var priority: Double = js.native
  /** The type of the rule */
  var `type`: UrlRuleType = js.native
  /**
    * This function is called if the rule matched, and was selected as the "best match".
    * This function handles the rule match event.
    *
    * See [[UrlRuleHandlerFn]] for details
    */
  def handler(): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.UndefOr[scala.Nothing], url: js.UndefOr[scala.Nothing], router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.UndefOr[scala.Nothing], url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.UndefOr[scala.Nothing], url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.Any): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.Any, url: js.UndefOr[scala.Nothing], router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.Any, url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
  def handler(matchValue: js.Any, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
  /**
    * This function should match the url and return the match details
    *
    * See [[UrlRuleMatchFn]] for details
    */
  def `match`(): js.Any = js.native
  def `match`(url: js.UndefOr[scala.Nothing], router: UIRouter): js.Any = js.native
  def `match`(url: UrlParts): js.Any = js.native
  def `match`(url: UrlParts, router: UIRouter): js.Any = js.native
  /**
    * The priority of a given match.
    *
    * Sometimes more than one UrlRule might have matched.
    * This method is used to choose the best match.
    *
    * If multiple rules matched, each rule's `matchPriority` is called with the value from [[match]].
    * The rule with the highest `matchPriority` has its [[handler]] called.
    */
  def matchPriority(`match`: js.Any): Double = js.native
}

