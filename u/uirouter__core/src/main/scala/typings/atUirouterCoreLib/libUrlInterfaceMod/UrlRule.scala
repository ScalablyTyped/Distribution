package typings
package atUirouterCoreLib.libUrlInterfaceMod

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
  var $id: scala.Double = js.native
  /** @hidden */
  var _group: scala.Double = js.native
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
  var priority: scala.Double = js.native
  /** The type of the rule */
  var `type`: UrlRuleType = js.native
  /**
    * This function is called if the rule matched, and was selected as the "best match".
    * This function handles the rule match event.
    *
    * See [[UrlRuleHandlerFn]] for details
    */
  def handler(): java.lang.String | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef | scala.Unit = js.native
  def handler(matchValue: js.Any): java.lang.String | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef | scala.Unit = js.native
  def handler(matchValue: js.Any, url: UrlParts): java.lang.String | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef | scala.Unit = js.native
  def handler(matchValue: js.Any, url: UrlParts, router: atUirouterCoreLib.libRouterMod.UIRouter): java.lang.String | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef | scala.Unit = js.native
  /**
    * This function should match the url and return the match details
    *
    * See [[UrlRuleMatchFn]] for details
    */
  def `match`(): js.Any = js.native
  def `match`(url: UrlParts): js.Any = js.native
  def `match`(url: UrlParts, router: atUirouterCoreLib.libRouterMod.UIRouter): js.Any = js.native
  /**
    * The priority of a given match.
    *
    * Sometimes more than one UrlRule might have matched.
    * This method is used to choose the best match.
    *
    * If multiple rules matched, each rule's `matchPriority` is called with the value from [[match]].
    * The rule with the highest `matchPriority` has its [[handler]] called.
    */
  def matchPriority(`match`: js.Any): scala.Double = js.native
}

